#include<stdio.h>  
 int main()    
{    
int a,b;  
printf("Enter value for A \n");
scanf("%d",&a); 
printf("Enter value for B \n");
scanf("%d",&b);    
printf("Before swap A=%d B=%d",a,b);      
a=a+b;
b=a-b;
a=a-b;
printf("\nAfter swap A=%d B=%d \n",a,b);    
return 0;  
}   

