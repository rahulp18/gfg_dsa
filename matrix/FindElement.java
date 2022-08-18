package matrix;

public class FindElement {
    public static void main(String[] args) {
        int mat[][] = {
                { 12, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 }
        };
        findPrintElement(mat, 12);
    }

    public static void findPrintElement(int mat[][], int x) {

        int c = mat[0].length - 1;
        int r = 0;
        while (c >= 0 && r < mat.length) {
            int tre = mat[r][c];
            if (tre == x) {
                System.out.println("Element position is " + r + " " + c);
                return;
            } else if (tre > x) {
                c--;
            } else {
                r++;
            }
        }

        System.out.println("Element not found");

    }
}
