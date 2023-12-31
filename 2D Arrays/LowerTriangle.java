import java.util.Scanner;

public class LowerTriangle {
    public static void main(String args[]){
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.println(arr1[i][j]);
            }
            for(int k=j;k<n;k++){
                System.out.println(0);
            }
        }
    }
    
}
