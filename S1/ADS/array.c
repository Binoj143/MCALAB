#include<stdio.h>
void main()
{
int arr[5];
int i,l,s,n;
printf("enter the size of the array:");
scanf("%d",&n);
printf("enter the array elements:");
for(i=0;i<n;i++)
{
scanf("%d",&arr[i]);
}
for(i=0;i<n;i++)
{
printf("%d",arr[i]);
}
for(i=0;i<n;i++)
{
if(arr[i]<arr[i-1])
{
s=arr[
