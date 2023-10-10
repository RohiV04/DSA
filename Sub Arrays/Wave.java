import java.util.*;

public class Wave {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
        int n = arr.length, i, j, temp;
        for (i = 0; i < n-1; i += 2) {
            j = i + 1;
            if (arr[j] < arr[i]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for (i = 1; i < n-1; i += 2) {
            j = i + 1;
            if (arr[j] > arr[i]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for (i = 0; i < n; i++) 
        System.out.println(arr[i]);
    }
}
