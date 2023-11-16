#include<stdio.h>  
int main()    
{    
long int num,remind,sum=0,temp=0;    
printf("Enter the number= " );    
scanf("%ld",&num);    
temp=num;    
while(num>0)    
{    
remind=num%10;    
sum=(sum*10)+remind;    
num=num/10;    
}    
if(temp==sum)    
printf("%ld is a palindrome number ",temp);    
else    
printf("%ld is not a palindrome number",temp);   
return 0;  
}   
