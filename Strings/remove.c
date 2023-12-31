#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];

    gets(str);
    int len = strlen(str);
    int j = 0;
    char str2[len];
    for (int i = 0; i < len; i++)
    {
        if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z')
        {
            str2[j] = str[i];
            j++;
            // printf("%c",str[i]);
        }
    }
    printf("%s", str2);

    return 0;
}
