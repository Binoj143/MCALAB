a=raw_input("Enter the string:")
f= {}
for i in a:
    if i in f:
        f[i] += 1
    else:
        f[i] = 1
print("Count of all characters in the given string is :\n " + str(f))
      

