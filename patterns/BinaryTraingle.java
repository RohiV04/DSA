import java.util.*;
public class BinaryTraingle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size  :");
        int len = sc.nextInt();
        int i,j,k=1;
        for(i=1;i<=len;i++){
            for(j=1;j<=i;j++){
                if(k==1){
                    System.out.print("1 ");
                    k=0;
                }
                else{
                    System.out.print("0 ");
                    k=1;}
            }
            System.out.print("\n");
        }
    }
}
