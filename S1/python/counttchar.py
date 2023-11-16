input_string = input("Enter a string: ")
char_frequency = {}
for char in input_string:
    char_frequency[char] = char_frequency.get(char, 0) + 1
print("Character frequencies in the string:")
for char, frequency in char_frequency.items():
    print(f"'{char}': {frequency}")
