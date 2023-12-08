input_string = raw_input("Enter a string: ")
def add_ing_ly(input_string):
    if input_string.endswith('ing'):
        result_string = input_string + 'ly'
    else:
            result_string = input_string + 'ing'
    return result_string
modified_string = add_ing_ly(input_string)
print("Modified string:", modified_string)
