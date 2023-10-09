#include<stdio.h>
int main(){
    int n1[]={1,5,10,20,40,80};
    int n2[]={6,7,20,80,100};
    int n3[]={3,4,15,20,30,70,80,120};
    int i=0,j=0,k=0;
    while(i<6 && j<5 && k<8){
        if(n1[i]==n2[j] && n2[j]==n3[k]){
            printf("%d \n",n1[i]);
            i++;j++;k++;
        }
        else if(n1[i]<n2[j])
            i++;
        else if(n2[j]<n3[k])
            j++;
        else
            k++;
    }
    return 0;
}