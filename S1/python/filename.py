fn= raw_input("Enter a filename:")
if "." in fn:
	name, extension= fn.split(".")
	print("The extension of the file is:" +extension)
else:
	print("Invalid filename format. Please include the file extension (e.g., filename.txt)")

