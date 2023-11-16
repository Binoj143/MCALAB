#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
struct node *next;
};
struct node *start;
void push ()  
{  
    int x;  
    struct node *ptr =(struct node*)malloc(sizeof(struct node));   
    if(ptr == NULL)  
    {  
        printf("not able to push the element");   
    }  
    else   
    {  
        printf("Enter the value");  
        scanf("%d",&x);  
        if(start==NULL)  
        {         
            ptr->data = x;  
            ptr -> next = NULL;  
            start=ptr;  
        }   
        else   
        {  
            ptr->data = x;  
            ptr->next = start;  
            start=ptr;  
               
        }  
        printf("Item pushed");  
          
    }  
}  
void pop()
{
	int x;
	struct node *ptr;
	if(start==NULL)
	{
	printf("Underflow");
	}
	else
	{
		x=start->data;
		ptr=start;
		start=start->next;
		free(ptr);
		printf("Element popped%d",x);
		}
}
void traverse()
{
	struct node *temp;
	if(start==NULL)
	{
	printf("WARNNING\n");
	printf("--------");
	printf("\nList is empty\n");
	}
	else
	{
		temp=start;
		printf("The list is");
		while(temp!=NULL)
		{
		printf("%d-->",temp->data);
		temp=temp->next;
		}
	}
}
void search()
{
	int i=1,f=0,x;
	struct node *ptr;
	ptr=start;
	if(ptr==NULL)
	{
	printf("\n Stack is empty");
	}
	else
	{
		printf("\n Enter elements");
		scanf("%d",&x);
		while(ptr!=NULL)
		{
			if(ptr->data==x)
			{
			f=1;
			break;
			}
			i++;
			ptr=ptr->next;
		}
			if(f==0)
			printf("\n Item not found");
		else
		printf("\n item found at position %d",i);
	}
}
void main()
{
	int ch=0;
	while(ch!=5)
	{
	printf("\n1.PUSH");
	printf("\n2.POP");
	printf("\n3.LINEAR SEARCH");
	printf("\n4.DISPLAY");
	printf("\n5.EXIT");
	printf("\n\nENTER YOUR CHOICE!!!...: ");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1:
	push();
	break;
	case 2:
	pop();
	break;
	case 3:
	search();
	break;
	case 4:
	traverse();
	break;
	case 5:
	exit(0);
	break;
	default:
	printf("\n INVALID CHOICE");
}
}
}

