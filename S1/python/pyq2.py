def change_string(str1):
	return str1[-1:] + str1[1:-1] + str1[:1]
print(change_string('abcd'))
print(change_string('12345'))
