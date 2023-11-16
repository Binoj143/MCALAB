def add_ing_ly(input_string):
    if input_string.endswith('ing'):
        result_string = input_string + 'ly'
    else:
        result_string = input_string + 'ing'
    return result_string

# Get input string from user
input_string = input("Enter a string: ")
# Call the function and print the result
modified_string = add_ing_ly(input_string)
print("Modified string:", modified_string)

