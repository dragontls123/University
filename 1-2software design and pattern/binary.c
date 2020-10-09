#include <stdio.h>

char *binary(unsigned int c) {
    static char binary[33];
    unsigned int mask = 0x01;

    for (int i = 0; i < 32; i++)
        binary[31 - i] = '0' + ((c >> i) & mask);
    binary[32] = 0;
    return binary;
}

void main()
{
    unsigned int a = 60;    /* 60 = 0011 1100 */
    unsigned int b = 13;	/* 13 = 0000 1101 */
    unsigned int c;

    c = a & b;      // 0000 1100 = 12
    printf("Line 1 - Value of c is %s(2)\n", binary(c));
    c = a | b;      // 0011 1101 = 61
    printf("Line 2 - Value of c is %s(2)\n", binary(c));
    c = a ^ b;      // 0011 0001 = 49
    printf("Line 3 - Value of c is %s(2)\n", binary(c));
    c = ~a;         // 1100 0011 = -61
    printf("Line 4 - Value of c is %s(2)\n", binary(c));

    c = a << 2;     // 1111 0000 = 240
    printf("Line 5 - Value of c is %s(2)\n", binary(c));
    c = a >> 2;     // 0000 1111 = 15
    printf("Line 6 - Value of c is %s(2)\n", binary(c));
}
