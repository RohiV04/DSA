import java.util.*;

public class HollowBox {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows :");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns :");
        int col = sc.nextInt();
        int i, j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(i==0 || j==0 || i==(row-1) || j==(col-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
