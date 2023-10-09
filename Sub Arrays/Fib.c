#include <stdio.h>

int isFib(int n);

int main()
{
    int arr[] = {1, 4, 3, 9, 10, 13, 7};
    int b[7], check;
    int i, j = 0;
    for (i = 0; i < 7; i++)
    {
        check = isFib(arr[i]);
        if (check)
        {
            b[j] = arr[i];
            j++;
        }
    }
    for(i=0;i<j;i++){
        printf("%d \n",b[i]);
    }
    return 0;
}

int isFib(int n)
{
    int i, a = 1, b = 2, c = 3;
    if (n == 0 || n == 1 || n == 2 || n == 3)
        return 1;
    else
    {

        for (i = 0; i < n; i++)
        {
            c = a + b;
            if (n == c)
                return 1;
            a = b;
            b = c;
        }
    }
    return 0;
}