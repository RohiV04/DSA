#include <stdio.h>
#include <string.h>
void check(char str[], char substr[])
{
    int j = 0, cnt = 0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (substr[j] == str[i] && (substr[j + 1] == str[i + 1] || substr[j - 1] == str[i - 1]))
        {
            j++;
        }
        if (j == strlen(substr))
        {
            cnt++;
            j = 0;
        }
    }
    printf("%d",cnt);
}
int main()
{
    char str[100];
    char substr[100];
    gets(str);
    gets(substr);
check(str,substr);

    return 0;
}
