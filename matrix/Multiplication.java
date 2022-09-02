package matrix;

public class Multiplication {
    public static void main(String[] args) {
        int A[][] = { { 4, 8 }, { 0, 2 }, { 1, 6 } };
        int B[][] = { { 5, 2 }, { 9, 4 } };
        int result[][] = multiplyMatrix(A, B);
        // System.out.println(multiplyMatrix(A, B).length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        // code here
        int row1 = A.length;
        int col1 = A[0].length;
        int row2 = B.length;
        int col2 = B[0].length;

        if (col1 != row2) {

            return new int[0][0];
        }
        int C[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
