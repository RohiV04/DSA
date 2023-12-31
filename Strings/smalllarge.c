#include <stdio.h>
#include <string.h>

int main()
{
    char str[1000];

    gets(str);
    int len = strlen(str);
    int cnt = 0, small_l = 0, large_l = 0, small_r = 0, large_r = 0, scnt=100, lcnt = 0;
    for (int i = 0; i < len; i++)
    {
        if (str[i] != ' ')
        {
            cnt++;
        }
        else
        {
            if (cnt<scnt)
            {
                scnt = cnt;
                small_r = i-1;
                small_l = i - cnt;
            }
            if (cnt>lcnt)
            {
                lcnt = cnt;
                large_r = i -1;
                large_l = i - cnt;
            }
            cnt = 0;
        }
    }
    int k;
    for (k = small_l; k <= small_r; k++)
        printf("%c", str[k]);
        printf("\n");
    for (k = large_l; k <= large_r; k++)
        printf("%c", str[k]);
    return 0;
}
