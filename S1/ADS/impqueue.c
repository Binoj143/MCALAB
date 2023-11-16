#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
void enQueue();
void deQueue();
void show();
int inp_arr[SIZE];
int REAR=-1,FRONT=-1;
void main()
{
int ch;
while(1)
{
printf("\n1.Enqueue Operation\n2.Dequeue Operation\n3.Display\n4.Exit\n\n Enter your choice !!!!!!!!(*_*)");
scanf("%d",&ch);
switch(ch)
{
case 1:
enQueue();
break;
case 2:
deQueue();
break;
case 3:
show();
break;
case 4:
exit(0);
break;
default:
printf("\nIncorrect choice!!!!!!!!");
}
}
getch();
}
void enQueue()
{
int insert_item;
if(REAR==SIZE-1)
printf("\nOverFlow");
else
{
if(FRONT==-1)
FRONT=0;
printf("\nEnter element to be insert into the queue ");
scanf("%d",&insert_item);
REAR=REAR+1;
inp_arr[REAR]=insert_item;
}
}
void deQueue()
{
if(FRONT==-1||FRONT>REAR)
{
printf("\nUnderFlow");
return;
}
else
{
printf("Element deleted from the queue is %d ",inp_arr[FRONT]);
FRONT=FRONT+1;
}
}
void show()
{
if(FRONT==-1)
printf("\nEmpty Queue");
else
{
for(int i=FRONT;i<=REAR;i++)
printf("%d	",inp_arr[i]);
}
}
