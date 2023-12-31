import java.util.Scanner;

public class Trace {
    public static void main(String args[]) {
        int n, m;
        int k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int trace = 0;
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        if (n > m) {
            k = m;
        } else
            k = n;
        for (int i = 0; i < k; i++) {
            trace += arr1[i][i];
        }
        System.out.println(trace);
    }
}
