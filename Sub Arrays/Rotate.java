import java.util.*;

public class Rotate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        // int d=3,n=5;
        // int[] arr = {1,2,3,4,5};
        int mark = n / d, i = 0, low = 0, high = 0, j;
        System.out.println("sol");
        while (i < mark) {
            high += d;
            for (j = high - 1; j >= low; j--)
                System.out.println(arr[j]);
            low = high;

            i++;
        }
        while (high < n) {
            System.out.println(arr[high]);
            high++;
        }

    }
}
