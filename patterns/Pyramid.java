import java.util.*;

public class Pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i, j;
        for (i = len; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = len; j >= i; j--) {
                System.out.print((len - i + 1) + " ");
            }
            System.out.print("\n");
        }
    }
}
