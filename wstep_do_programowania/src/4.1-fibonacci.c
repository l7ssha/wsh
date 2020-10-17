#include <stdio.h>

int fibonacci(int n)
{
    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int steps;
    scanf("%d", &steps);

    printf("%d element ciagu to: %d\n", steps, fibonacci(steps));
    return 0;
}