package matrix;

public class SnakePrinting {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSnake(arr);
        System.out.println(arr[1].length);
    }

    public static void printSnake(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int m = arr[i].length;
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
