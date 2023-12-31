#include <stdio.h>
#include <string.h>
int frequency(char str[],char c){
    int j=0;
    for (int i = 0; str[i]!='\0'; i++)
    {
        if (str[i]==c)
        {
            j++;
        }
    }
    return j;
}
int main()
{
    char str[100];

    gets(str);
    char c;
    scanf("%c",c);
    int cnt=frequency(str,c);
    printf("%d", cnt);

    return 0;
}
