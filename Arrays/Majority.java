import java.util.*;

public class Majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
      int n= sc.nextInt();
       boolean flag=false;
      int[] arr=new int[n];
      int i;
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int check=n/2;
       
      for(i=0;i<n;i++){
        int key=arr[i];
        int num=count(key,arr,check);
        if(num>0){
            System.out.println(num);
            flag=true;
            break;
        }
      }
      if(flag)
      System.out.println("No Majority Element");
    }

    static int count(int key, int arr[], int check) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                count++;
            }
        }
        if (count >= check) {
            return key;
        }
        return 0;
    }
}
