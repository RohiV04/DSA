#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100];
    gets(str1);
    int l = strlen(str1);
    char substr[100];
    gets(substr);
    int l2 = strlen(substr);
    int j = 0;
    for (int i = 0; i < l; i++)
    {
        if (str1[i] == substr[j] && (str1[i + 1] == substr[j + 1] || (str1[i - 1] == substr[j - 1])))
        {
            j++;
        }
    }
    if (j == l2)
    {
        printf("Substring found");
    }
    else
    {
        printf("Substring not found");
    }
    return 0;
}