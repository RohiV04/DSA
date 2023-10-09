import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i, j, k = 1;
        for (i = 1; i <= len; i++) {

            for (j = 0; j < i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.print("\n");
        }
    }
}
