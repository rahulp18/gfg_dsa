package matrix;

import java.util.ArrayList;

public interface PrintBoundary {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(boundaryTraversal(arr, arr.length, arr[0].length));
    }

    public static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        // code here
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                res.add(matrix[0][i]);
            }
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                res.add(matrix[i][0]);
            }
        } else {
            for (int i = 0; i < m; i++) {
                res.add(matrix[0][i]);
            }
            for (int i = 1; i < n; i++)
                res.add(matrix[i][m - 1]);
            for (int i = m - 2; i >= 0; i--)
                res.add(matrix[n - 1][i]);
            for (int i = n - 2; i >= 1; i--)
                res.add(matrix[i][0]);
        }
        return res;

    }
}
