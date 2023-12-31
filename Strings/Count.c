#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    gets(str);
    int l=strlen(str);
    int alpha=0,num=0,other=0;
    for(int i=0;str[i]!='\0';i++){
        if(str[i]<'A' && str[i]>'Z' && str[i]<'a' && str[i]>'z'){
            alpha++;
        }
        else if(str[i]>='0' && str[i]<='9'){
            num++;
        }
        else{
            other++;
        }
    }
    printf("Alphabets: %d\nNumbers: %d\nOther: %d\n",alpha,num,other);
    return 0;
}