#include<stdio.h>

int stack[100],choice,n,top,x,i;
void push();
void pop();
void display();
int main()
{
	top=-1;
	printf("Enter the size of stack \n");
	scanf("%d",&n);
	printf("\n 1. PUSH \n 2. POP\n 3. DISPLAY\n 4. EXIT\n");
	do
{
	printf("Enter your choice : \n");
	scanf("%d",&choice);
	switch(choice)
{
	case 1:
{
	push();
	break;
}
	case 2:
{
	pop();
	break;
}
	case 3:
{
	display();
	break;
}
	case 4:
{
	printf("EXIT");
	break;
}
	default:
{
	printf("Enter valid choice");
}
}
}
while(choice=4);
return 0;
}
void push()
{
if (top>=n-1)
{
printf("Stack is overflow");
}
else
{
printf("Enter the value to be pushed : \n");
scanf("%d",&x);
top++;
stack[top]=x;
}
}
void pop()
{
if(top<=-1)
{
printf("\nStack underFlow \n");
}
else
{
printf("\nThe poped element is : %d \n",stack[top]);
top--;
}
}
void display()
{
if(top>=0)
{
printf("\nThe element in stack \n");
for (i=top;i>=0;i--)
printf("%d	",stack[i]);
}
else
{
printf("\nStack is Empty");
}
}
