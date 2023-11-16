def gcd(a,b):
	while b!=0:
	a,b=b,a%b
	return a
num1=int(input("enter 1st number"))
num2=int(input("enter 2nd number"))
result =gcd(num1,num2
print("gcd of",num1,"and",num2,"is",result)
