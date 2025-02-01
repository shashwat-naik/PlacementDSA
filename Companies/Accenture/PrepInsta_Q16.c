#include <stdio.h>
int main()
{
    int sum = 0, num, ans = 0;
    printf("Enter a number: \n");
    scanf("%d", &num);
    for (int i = 1; i <= 10; i++)
    {
        ans = num * i;
        printf("%d ", ans);
        sum += ans;
    }
    printf("\n%d", sum);
    return 0;
}