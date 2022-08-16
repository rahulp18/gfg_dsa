package matrix;

public class Transpose {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 12, 13, 14 }, { 15, 16, 17, 18 } };
        transposeMtrx(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMtrx(int arr[][]) {
        int r = arr.length;
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

}
