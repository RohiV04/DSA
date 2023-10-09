import java.util.*;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter TestCases  :");
        int test = sc.nextInt();
        while (test > 0) {
            System.out.print("Enter a  :");
            int a = sc.nextInt();
            System.out.print("Enter b  :");
            int b = sc.nextInt();
            System.out.print("Enter c  :");
            int c = sc.nextInt();
            int val = a;
            for (int i = 0; i < c; i++) {
                val = (int) (val + Math.pow(2, i) * b);
                System.out.print(val + " ");
            }
            test--;
        }
    }
}
