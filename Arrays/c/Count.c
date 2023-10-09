#include <stdio.h>
int main(){
    int n,cnt=0, i;
    int arr[]={1,1,2,2,2,2,2,3};
    for(i=0;i<8;i++){
     
            if(arr[i]==2){
                cnt++;
            }if(arr[i]>2){
                break;
            }
        
    }
    printf("%d",cnt);
    return 0;
}