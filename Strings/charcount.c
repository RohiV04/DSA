#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];

    gets(str);
    int len = strlen(str);
    int cnt;
    for (int i = 0; i < len; i++)
    {
        for (int j = i + 1; j < len && str[j]!='*'; j++)
        {
            cnt = 1;
            if (str[i] == str[j] )
            {
                cnt++;
                str[j]='*';
            }
        }
        printf(" %c \t%d\n", str[i], cnt);
    }


    return 0;
}
