#include <stdio.h>
int main()
{
    int a[] = {-5, 3, 6, 12, 15};
    int b[] = {-12, -10, -6, -3, 4, 10};
    int n1 = (sizeof(a) / sizeof(a[0]));
    int n2 = (sizeof(b) / sizeof(b[0]));
    int len = n1 + n2, k = 0, i = 0, j = 0;
    int merge[len];

    while (i < n1 && j < n2)
    {
        if (a[i] < b[j])
        {
            merge[k] = a[i];
            k++;
            i++;
        }
        else
        {
            merge[k] = b[j];
            k++;
            j++;
        }
    }
    while (i < n1)
    {
       merge[k] = a[i];
            k++;
            i++; 
    }
    while (j < n2)
    {
       merge[k] = b[j];
            k++;
            j++; 
    }
    if(len&1){
        printf("%d \n",merge[len/2]);
    }else{
         printf("%d \n",merge[len/2]+merge[(len/2)+1]);
    }

return 0;
}