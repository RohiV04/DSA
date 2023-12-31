import java.util.Scanner;

public class Magic {
    public static void main(String args[]){
        int n,m,sum1=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[] arr3 = new int[n];
        int[] arr4 = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
                if(i==j){
                    sum1+=arr1[i][j];
                }
                arr3[i]+=arr1[i][j];     
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
                if(i==j){
                    sum2+=arr1[i][j];
                }
                arr4[i]+=arr1[i][j];   
            }
        }
if(sum1==sum2 && arr3==arr4)
    System.out.println("Magic");
else
    System.out.println("Not Magic");

    }
}
