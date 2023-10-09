import java.util.*;

public class SumPair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = sc.nextInt();
        int i, j, l = 0, r = 0, max = 0, mul;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                mul = arr[i] * arr[j];
                if (mul > max) {
                    l = arr[i];
                    r = arr[j];
                    max = mul;
                }

            }
        }
        System.out.println(max + "" + l + "" + r);

    }
}
