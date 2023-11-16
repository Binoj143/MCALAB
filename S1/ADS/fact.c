#include<stdio.h>
void main()
{
int n,i,fact=1;
printf("Enter number");
scanf("%d",&n);
for(i=n;i>0;i--)
{
fact=fact*i;
}
printf("Factorial of %d is %d \N",n,fact);
}
