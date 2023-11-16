#include<stdio.h>
#include<stdlib.h>
int a[10],front=-1,rear=-1,n;
void insert();
void display();
void del();
int main()
{
int ch,n;
printf("Enter the size of the queue : \n");
scanf("%d",&n);
while(1)
{
printf("\n1.Insertion \n2.Deletion \n3.Display \n4.Exit \nEnter your choice : ");
scanf("%d",&ch);
switch(ch)
{
case 1:
insert();
break;
case 2:
del();
break;
case 3:
display();
break;
case 4:
printf("\nEnter any key to exit...!!!!");
exit(0);
break;
default:
printf("\nInvalid choice!!!!!!!!!!!!");
}
}
return 0;
}
void insert()
{
int x;
if ((front==0&&rear==n-1)||(front==rear+1))
{
printf("\nQueue is full");
}
else 
{
printf("\nEnter the element to be insert");
scanf("%d",&x);
if(front==-1&&rear==-1)
front=rear=0;
else if(rear==n-1&&front!=0)
rear=0;
else
rear=(rear+1)%n;
a[rear]=x;
}
}
void display()
{
int i;
printf("\nFront=%d Rear=%d\n",front,rear);
if(front==-1)
printf("\n Queue is empty");
else if (front<=rear)
{
for(i=front;i<=rear;i++)
printf("\n%d",a[i]);
}
else
{
for(i=front;i<n;i++)
printf("\n%d",a[i]);
for(i=0;i<=rear;i++)
printf("\n%d",a[i]);
}
}
void del()
{
if(front==-1)
printf("\nQueue is empty");
else
{
printf("\nDeleted element is %d",a[front]);
if(front==rear)
front=rear=-1;
else
{
if(front==n-1)
front=0;
else
front=front+1;
}
}
}
