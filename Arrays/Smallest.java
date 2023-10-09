import java.util.Arrays;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Smallest element: " + arr[0]);
    }
}