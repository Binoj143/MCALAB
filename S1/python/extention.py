filename= input("enter a filename:")
if"." in filename:
	name,extention = filename.split(".")
	print("the extention is:"+ extention)
else:
	print("invalid filename format.please include file extention(eg.,filename.txt)")

