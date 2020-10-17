#include <stdio.h>

int main() {
    int number;
    scanf("%u", &number);
    printf("Decimal: %i; Hex: %x; Octal %o\n", number, number, number);

    return 0;
}