#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    gets(str);
    int k, cnt = 0, start;
    scanf("%d", &k);
    int l = strlen(str);
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] != ' ')
        {
            cnt++;
        }
        else
        {
            if (cnt == k)
            {
                for (int j = start; j < i; j++)
                {
                    printf("%c", str[j]);
                }
                break;
            }
            else
            {
                cnt = 0;
                start = i;
            }
        }
    }
    return 0;
}