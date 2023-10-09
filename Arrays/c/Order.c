#include <stdio.h>

int main() {
    int n, i, j;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int a[n], b[n];
    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    i = 0;
    j = 0;
    while (i < n) {
        if (a[i] >= 0) {
            b[j] = a[i];
            j++;
        }
        i++;
    }
    i = 0;
    while (i < n) {
        if (a[i] < 0) {
            b[j] = a[i];
            j++;
        }
        i++;
    }
    printf("Sorted array: ");
    for (i = 0; i < n; i++)
        printf("%d ", b[i]);
    return 0;
}