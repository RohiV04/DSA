import java.util.*;

public class Duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int i, j, cnt = 0, flag=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] dup = new int[5];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // int arr[]={1,2,3,2,4};
            for (i = 0; i < arr.length; i++) {
                for (j = (arr.length - 1); j > i; j--) {
                    if (arr[i] == arr[j]) {
                        dup[cnt] = arr[i];
                        // flag = arr[i];
                        cnt++;
                    }
                }
            }
            if (cnt == 0) {
                System.out.println("-1");
            } else {
                // System.out.println(flag);
                for (i = 0; i < dup.length; i++) {
                System.out.println(dup[i]);
                }
            }

            t--;
        }

    }
}
