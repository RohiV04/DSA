#include <stdio.h>
int main()
{
    int arr[] = {-1, -3, -10, 0, 60};
    int i, j, mul, max=arr[0];
    for (i = 0; i < 5; i++)
    {
        mul = arr[i];
        for (j = i + 1; j <= 5; j++)
        {
            mul *= arr[j];
            if (mul > max)
                max = mul;
        }
    }
    printf("%d", max);
    return 0;
}