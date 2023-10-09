import java.util.*;

public class Balls {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, red = 0, white = 0, blue = 0;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                red++;
            } else if (arr[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }
        for (i = 0; i < red; i++) {
            arr[i] = 0;
        }
        for (i = red; i < white; i++) {
            arr[i] = 1;
        }
        for (i = white; i < n; i++) {
            arr[i] = 2;
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
