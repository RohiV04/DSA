import java.util.*;

public class InversePyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i, j;
        for (i = len; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
