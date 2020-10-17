#include <stdio.h>

int main()
{
    char code = getchar();

    printf("Kod w ascii litery `%c` = `%u`\n", code, (int)code);
    return 0;
}