public class Matrix {
    public static void main(String[] args) {
    generateMatrix(4);
    }

    public static double [][] generateMatrix(int size) {
        double[][] arrayOfHell = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    arrayOfHell [i][j] = 1.0;
                }
                System.out.print(arrayOfHell[i][j] + "  ");
            }
            System.out.println();
        }
        return arrayOfHell;
    }
}
