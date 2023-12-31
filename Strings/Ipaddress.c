#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int validate_ipv4(char *ip_address) {
    int num, dots = 0;
    char *ptr;

    if (ip_address == NULL)
        return 0;
    ptr = strtok(ip_address, ".");

    if (ptr == NULL)
        return 0;

    while (ptr) {
        if (!isdigit(*ptr))
            return 0;

        num = atoi(ptr);

        if (num < 0 || num > 255)
            return 0;

        ptr = strtok(NULL, ".");

        if (ptr != NULL)
            dots++;
    }

    if (dots != 3)
        return 0;

    return 1;
}

int main() {
    char ip_address[16];

    printf("Enter an IPv4 address: ");
    scanf("%s", ip_address);

    if (validate_ipv4(ip_address))
        printf("%s is a valid IPv4 address.\n", ip_address);
    else
        printf("%s is not a valid IPv4 address.\n", ip_address);

    return 0;
}
