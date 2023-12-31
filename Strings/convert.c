#include<stdio.h>
#include<string.h>
int main(){
char str[50];
gets(str);
int l=strlen(str);
printf("%d",l);
for(int i=0;i<l;i++){
    if(str[i]>='A' && str[i]<='Z'){
        str[i]=str[i]+32;
    }
    else if(str[i]>='a' && str[i]<='z'){
        str[i]=str[i]-32;
    }
    printf("\n %d",i);}

    printf("%s",str);

    return 0;

}