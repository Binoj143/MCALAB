string1 = input("Enter the first string: ")
string2 = input("Enter the second string: ")
if len(string1) > 0 and len(string2) > 0:
    new_string1 = string2[0] + string1[1:]
    new_string2 = string1[0] + string2[1:]
    result_string = new_string1 + " " + new_string2
    print("Resulting string: ", result_string)
else:
    print("Both strings must have at least one character.")
