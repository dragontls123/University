#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main()
{
    char str[256] = "A thief named hong gil dong lived with friends named hong gil don and hong gil ja in a village named hong gil dong village.";
    char sub[64] = "hong gil dong";
    char *ptr = str; int match = 0;

    while ((ptr = strstr(ptr, sub)) != NULL) {
        printf("Match at offset %lld\n", ptr - str);
        ptr += strlen(sub);
        match++;
    }
    printf("%d matches!\n", match);
}
