#include <stdio.h>

int main()
{
    double number1;
    double number2;

    scanf("%lf", &number1);
    scanf("%lf", &number2);
    
    getchar(); /* this catches '/n' character */
    char operation = getchar();

    double result = 1;
    switch (operation) {
        case '+':
            result = number1 + number2;
            break;
        case '-':
            result = number1 - number2;
            break;
        case '*':
            result = number1 * number2;
            break;
        case '/':
            result = number1 / number2;
            break;
    }

    printf("Wynik działania %lf %c %lf = %lf\n", number1, operation, number2, result);
    return 0;
}