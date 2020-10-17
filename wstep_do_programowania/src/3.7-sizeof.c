#include <stdio.h>

int main() {
    printf("int size: %i bytes\nfloat size: %i bytes\ndouble size: %i bytes\nchar size: %i bytes\n", sizeof(int), sizeof(float), sizeof(double), sizeof(char));
    return 0;
}