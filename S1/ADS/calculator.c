#include<stdio.h>
void main()
{
int a,b,op;
printf("1. Addition 2. Subtraction 3. Multiplication 4.Division\n Enter your choice :");
scanf("%d",&op);
printf("\n Enter values for perform arithmetic operation");
printf("\n A =");
scanf("%d",&a);
printf("\n B =");
scanf("%d",&b);
switch(op)
{
case 1:
printf("A+B= %d+%d=%d",a,b,a+b);
break;
case 2:
printf("A-B= %d-%d=%d",a,b,a-b);
break;
case 3:
printf("A*B= %d*%d=%d",a,b,a*b);
break;
case 4:
printf("A/B= %d/d=%d",a,b,a/b);
break;
default:
printf("Wrong choice!!!! \n Please enter correct choice");
break;
}
}
