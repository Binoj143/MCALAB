list1 = input("Enter the first list: ")

list2 = input("Enter the second list: ")


if len(list1) == len(list2):

  print("The two lists are of the same length.")

else:

  print("The two lists are not of the same length.")

set1 = set(list1)

set2 = set(list2)

intersection = set1 & set2

if intersection:

    print("The two lists have at least one value in common.")

else:

    print("The two lists have no values in common.")

