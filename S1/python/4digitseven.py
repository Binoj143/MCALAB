def is_all_even(number):
    return all(int(digit) % 2 == 0 for digit in str(number))

def is_perfect_square(number):
    root = int(number ** 0.5)
    return root * root == number

start_range = int(input("Enter the starting number of the range (four digits): "))
end_range = int(input("Enter the ending number of the range (four digits): "))

result_list = [num for num in range(start_range, end_range + 1) if is_all_even(num) and is_perfect_square(num)]

print("List of four-digit numbers with all even digits and perfect squares:")
print(result_list)
