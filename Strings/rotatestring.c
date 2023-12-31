#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];

    gets(str);
    int len = strlen(str);
    int n, j = 0;
    scanf("%d", &n);
    char str2[len];
    for (int i = n; i < len; i++)
    {
        str2[j++] = str[i];
    }
    for (int i = 0; i < n; i++)
    {
        str2[j] = str[i];
        j++;
    }
    printf("%s \n", str2);
    return 0;
}
