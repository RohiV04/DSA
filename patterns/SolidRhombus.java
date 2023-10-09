import java.util.Scanner;
public class SolidRhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i,j;
          for(i=len;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=len;j++){
                System.out.print("* ");
            }
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
          }
    }
}
