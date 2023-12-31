#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];

    gets(str);
    int len = strlen(str);
    int cnt;
    int flag = 0, right=len-1,left=0;
    while (right>=left)
    {
        if (str[left] != str[right])
            flag = 1;
     printf("%c \t %c \n",str[left],str[right]);
        right--;
        left++;
        
    }
    if (flag)
        printf("Not a Palindrome");
    else
        printf("It is a Pallindrome");

    return 0;
}
