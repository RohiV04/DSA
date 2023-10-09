#include <stdio.h>
int main(){
    int n,cnt=0,sum1=0,sum2=0,i;
    int arr[]={1,2,4,6,3,7,8};
    for(i=0;i<7;i++){
     sum1+=arr[i];
        
    }
    sum2=8*9/2;
    printf("%d",sum2-sum1);
    return 0;
}