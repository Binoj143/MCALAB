#include<stdio.h>  
int main()    
{    
int num,remind,sum=0,temp=0,new=0;    
printf("Enter the number= " );    
scanf("%d",&num);    
temp=num;    
while(num>0)    
{    
remind=num%10;     
num=num/10;
new=new+remind;  
}    
 printf("sum of digits is %d",new); 
return 0;  
}   
