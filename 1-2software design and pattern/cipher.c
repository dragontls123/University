#pragma warning (disable: 4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void cipher(char *text, int shift)
{
    for (int i = 0; i < strlen(text); i++) {
        if (text[i] < ' ') continue;
        else if (isupper(text[i])) text[i] = (text[i] + shift - 'A') % 26 + 'A';
        else if (islower(text[i])) text[i] = (text[i] + shift - 'a') % 26 + 'a';
        else text[i] += shift;
    }
}

void decipher(char *text, int shift)
{
    cipher(text, -shift);
}

void main()
{
    FILE *fd = fopen("original.txt", "r");
    FILE *fd_out = fopen("cipher.txt", "w");
    char str[256]; int key;

    printf("Enter shift key: ");
    scanf("%d", &key);
    while (fgets(str, sizeof(str), fd) != NULL) {
        cipher(str, key);
        fprintf(fd_out, "%s", str);
    }
    fclose(fd);
    fclose(fd_out);

    fd = fopen("cipher.txt", "r");
    fd_out = fopen("decipher.txt", "w");

    while (fgets(str, sizeof(str), fd) != NULL) {
        decipher(str, key);
        fprintf(fd_out, "%s", str);
    }
    fclose(fd);
    fclose(fd_out);
}
