#include<stdio.h>  
int main()    
{    
long int num,remind,sum=0,temp=0,new;    
printf("Enter the number= " );    
scanf("%ld",&num);    
temp=num;    
while(num>0)    
{    
remind=num%10;    
sum=remind+(sum*10);  
num=num/10; 
printf("%ld",remind);   
}    
 
return 0;  
}   
