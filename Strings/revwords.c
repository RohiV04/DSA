#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];

    gets(str);
    int len = strlen(str), cnt = 0;
    char res[len];
    for (int i = len - 1; i >= 0; i--)
    {
        if (str[i] != ' ')
        {
            cnt++;
        }
        else
        {
            for (int j = i ; j <= i + cnt; j++)
            {
                printf("%c", str[j]);
            }
            printf(" ");
            cnt = 0;
        }
    }
    for(int i=0;str[i]!='\0';i++){
        if(str[i]!=' '){
            printf("%c",str[i]);
        }else{
            break;
        }
    }

    return 0;
}
