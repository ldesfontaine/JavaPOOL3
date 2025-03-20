package tp1;

public class exo5 {

    public void remplirUneMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void afficherUneMatrice(int[][] matrice) {
        for (int[] ints : matrice) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public void additionnerMatrices(int[][] matrice1, int[][] matrice2) {
        int[][] matrice3 = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matrice3[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        afficherUneMatrice(matrice3);
    }

    public void multiplierMatrices(int[][] matrice1, int[][] matrice2) {
        int n = matrice1.length;
        int[][] matrice3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrice3[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        afficherUneMatrice(matrice3);
    }



    public void transposeMatrice(int[][] matrice) {
        int n = matrice.length;
        int[][] matrice2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice2[i][j] = matrice[j][i];
            }
        }
        afficherUneMatrice(matrice2);
    }


public static void test() {
    exo5 exo5 = new exo5();
    int[][] matrice1 = new int[3][3];
    int[][] matrice2 = new int[3][3];
    exo5.remplirUneMatrice(matrice1);
    exo5.remplirUneMatrice(matrice2);
    exo5.afficherUneMatrice(matrice1);
    System.out.println("\n");
    exo5.afficherUneMatrice(matrice2);

    System.out.println("Addition matrices");
    exo5.additionnerMatrices(matrice1, matrice2);

    System.out.println("Multiplication matrices");
    exo5.multiplierMatrices(matrice1, matrice2);

    System.out.println("Transpose matrice 1");
    exo5.transposeMatrice(matrice1);
}

    public static void main(String[] args) {
        test();
    }
}
