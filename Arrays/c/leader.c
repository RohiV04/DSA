#include <stdio.h>
int main(){
    int n,cnt=0, i, j;
    int arr={8,4,2,1};
    for(i=0;i<4;i++){
        for(j=i+1;i<4;i++){
            if(arr[j]>arr[i]){
                cnt++;
            }
        }
    }
    printf("%d",cnt);
    return 0;
}