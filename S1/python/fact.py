
def factorial_loop(n):
    factorial = 1
    for i in range(1, n + 1):
        factorial *= i
    return factorial


num = int(input("Enter a number: "))
result = factorial_loop(num)
print("Factorial of", num, "is", result)

def factorial_recursive(n):
    if n == 0:
        return 1
    else:
        return n * factorial_recursive(n - 1)

num = int(input("Enter a number: "))
result = factorial_recursive(num)
print("Factorial of", num, "is", result)
