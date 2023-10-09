import java.util.*;

public class Union {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] res=new int[n1+n2];
int i,j=0;
for(i=0;i<n1;i++){
  res[i]=  arr1[i]=sc.nextInt();
}
for(i=0;i<n2;i++){
    arr2[i]=sc.nextInt();
}
 int k=n1;
while(j<n2){
    int key=arr2[j];
   
    boolean flag=search(key,arr1);
    if(flag){
        res[k]=arr2[j];
        k++;
    }
    j++;
}
    }

    static boolean search(int key, int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
