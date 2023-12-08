cn=raw_input("Enter comma-separated colour names:")
c=cn.split(',')
c=[color.strip() for color in c]
if len(c)>=2:
	print("First color:", c[0])
	print("Last color:", c[-1])
else:
	print("Please enter atleast two color names")
