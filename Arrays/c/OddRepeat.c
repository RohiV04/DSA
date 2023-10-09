#include <stdio.h>

int main() {
    int arr={1,2,1,2,3};
    int i,j,k,l=0;
    while(l<5){
        k=arr[l];
        if(k==-1){
            l++;
        }
        else{
            for(i=l;i<6;i++){
                for(j=i+1;j<6;j++){
                    if(arr[j]==arr[i]){
                        arr[j]=-1;
                        arr[i]=-1;
                        break;
                    }
                    
                }
                   l++;
            }
         
        }
    }
    return 0;
}