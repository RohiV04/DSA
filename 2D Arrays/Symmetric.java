import java.util.Scanner;

public class Symmetric {
    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i][j] != arr1[j][i]) {
                    System.out.println("Not Symmetric");
                    return;
                }
            }
        }
        System.out.println("Symmetric");
    }
}