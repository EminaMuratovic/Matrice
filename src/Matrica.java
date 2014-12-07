
public class Matrica {

		public static void main(String[] args) {
		System.out.println("Unesite broj redova prve matrice: ");
		int brRedova1 = TextIO.getInt();
		System.out.println("Unesite broj kolona prve matrice: ");
		int brKolona1 = TextIO.getInt();
		int[][] mat1 = kreirajMatricu(brRedova1, brKolona1);
		for(int i = 0; i < brKolona1; i++)
		{for(int j = 0; j < brRedova1; j++)
		{
		System.out.print(mat1[i][j]+ " ");
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("Unesite broj redova druge matrice: ");
		int brRedova2 = TextIO.getInt();
		System.out.println("Unesite broj kolona druge matrice: ");
		int brKolona2 = TextIO.getInt();
		int[][] mat2 = kreirajMatricu(brRedova2, brKolona2);
		for(int i = 0; i < brKolona2; i++)
		{for(int j = 0; j < brRedova2; j++)
		{
		System.out.print(mat2[i][j] + " ");
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("Zbir matrica je matrica: ");
		int[][] matSum = sabiranje(mat1, mat2);
		if(matSum == mat1) System.out.println("Matrice nije moguce sabrati!");
		else 
		{for(int i=0; i<brKolona2; i++)
		{for(int j=0; j<brRedova2; j++)
		{
		System.out.print(matSum[i][j] + " ");
		}
		System.out.println();
		}
		}
		System.out.println();
		System.out.println("Razlika matrica je matrica: ");
		int[][] matRaz = oduzimanje(mat1, mat2);
		if(matRaz == mat1) System.out.println("Matrice nije moguce oduzeti!");
		else
		{
		for(int i = 0; i < brKolona2; i++)
		{for(int j = 0; j < brRedova2; j++)
		{
		System.out.print(matRaz[i][j] + " ");		
		}
		System.out.println();
		}
		}
		System.out.println("Proizvod matrica je matrica: ");
		int[][] matPr = mnozenje(mat1, mat2);
		if(matPr == mat1) System.out.println("Matrice nije moguce pomnoziti!");
		else
		{
		for(int i = 0; i < brKolona2; i++)
		{for(int j = 0; j < brRedova2; j++)
		{
		System.out.print(matPr[i][j] + " ");		
		}
		System.out.println();
		}
		}

		}


/**
 * proizvod dvije matrice
 * @param mat1 int dvodimenzionalni niz
 * @param mat2 int dvodimenzionalni niz
 * @return matrica
 */
		private static int[][] mnozenje(int[][] mat1, int[][] mat2) {
		int suma=0;
		int[][] pr = new int[mat1.length][mat2[0].length];
		if(mat2.length != mat1[0].length) return mat1;
		for (int i = 0; i < mat1.length; i++)
		{
			for (int j = 0; j < mat2[i].length; j++)
			{
				for (int r = 0; r < mat2.length; r++)
				{
					suma += mat1[i][r]*mat2[r][j];
				}
				pr[i][j] = suma;
				suma = 0;
			}
		}
		return pr;
		}
/**
 * razlika dvije matrice
 * @param mat1 int dvodimenzionalni niz
 * @param mat2 int dvodimenzionalni niz
 * @return matrica
 */
		private static int[][] oduzimanje(int[][] mat1, int[][] mat2) {
		int[][] raz = new int[mat1.length][mat1[0].length];
		if(mat1.length != mat2.length || mat1[0].length != mat2[0].length)
		return mat1;
		for(int i = 0; i < mat1.length; i++)
		{for(int j = 0; j < mat1[0].length; j++)
		raz[i][j] = mat1[i][j] - mat2[i][j];
		}
		return raz;
		}
/**
 * zbir dvije matrice
 * @param mat1 int dvodimenzionalni niz
 * @param mat2 int dvodimenzionalni niz
 * @return matrica
 */
		private static int[][] sabiranje(int[][] mat1, int[][] mat2) {
		int[][] sum = new int[mat1.length][mat1[0].length];
		if(mat1.length != mat2.length || mat1[0].length != mat2[0].length)
		return mat1;
		for(int i = 0; i < mat1.length; i++)
		{for(int j = 0; j < mat1[0].length; j++)
		sum[i][j] = mat1[i][j] + mat2[i][j];
		}
		return sum;
		}
/**
 * kreira matricu sa zadanim kolonama i redovima
 * @param brRedova int bilo koji broj
 * @param brKolona int bilo koji broj
 * @return matrica
 */
		private static int[][] kreirajMatricu(int brRedova, int brKolona) {
		int[][] mat = new int[brKolona][brRedova];
		System.out.println("Unesite elemente: ");
		for(int i = 0; i < brKolona; i++)
		for(int j = 0; j < brRedova; j++)
		mat[i][j] = TextIO.getInt();
		return mat;
		}
		
		}

