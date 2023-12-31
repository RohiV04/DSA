import java.util.Scanner;

public class Identical {
    public static void main(String args[]){
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
        System.out.println("Identical");
        else
        System.out.println("Not Identical");

    }
}
