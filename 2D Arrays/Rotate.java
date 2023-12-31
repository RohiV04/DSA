public class Rotate {
    public static void main(String args[]) {
        int i, j, n = 3;
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (i = 0; i <n; i++) {
            for (j = n - 1; j >= 0; j--) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
