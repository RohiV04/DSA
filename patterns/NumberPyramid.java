import java.util.Scanner;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i,j;
        for(i=1;i<=len;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
