import java.util.Scanner;

public class Pallandrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i, j, k;
        for (i = 1; i <= len; i++) {
            for (j = len - i; j >= 1; j--) {
                System.out.print(" ");
            }
for(j=1;j<=i;j++){
    System.out.print(j+" ");
    
}
            System.out.print("\n");
        }
    }
}
