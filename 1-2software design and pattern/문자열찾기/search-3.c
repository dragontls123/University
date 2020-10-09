#pragma warning (disable: 4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main()
{
    char str[256] = "A thief named hong gil dong lived with friends named hong gil don and hong gil ja in a village named hong gil dong village.";
    char pat[64] = "hong*dong";
    char subpat[2][64] = { "", "" };
    char *ptr; int match = 0;

    ptr = strstr(pat, "*");
    strncpy(subpat[0], pat, ptr - pat);
    strcpy(subpat[1], ptr + 1);

    ptr = str;
    while ((ptr = strstr(ptr, subpat[0])) != NULL) {
        int offset = (int)(ptr - str);
        if ((ptr = strstr(ptr + strlen(subpat[0]), subpat[1])) == NULL) break;
        printf("Match at offset %d\n", offset);
        ptr += strlen(subpat[1]);
        match++;
    }
    printf("%d matches!\n", match);
}
