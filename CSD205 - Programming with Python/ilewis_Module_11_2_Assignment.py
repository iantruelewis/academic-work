# Ian Lewis
# 07/23/24
# Module 11_2 Assignment

# This program has a recursive function that accepts an integer argument, n, and prints the number of 1 up to 
# and including n. Included is a non-recursive method that takes an integer argument, n, and prints the number 
# of 1 up to and including n.

# This program also:
    # Includes an explanation of each functions approach to solving the problem in the code documentation.
    # Includes test code that will not allow a negative or 0 value.
    # Includes which function is being invoked at both the start and end of the output in the display.


def print_numbers_recursive(n):
    # Function uses recursion to print numbers from 1 to n. 
    # Calls itself with n-1 until reaching 0, then stops. 
    # Numbers printed in ascending order after recursive calls return.
    if n > 0:
        print_numbers_recursive(n - 1)
        print(n, end=' ')
# Cite: Gaddis Python 6e Chapter 12, Pages 3-5, 8-10, 13-16, 18-22,
# Cite: w3schools.com, Articles "Python Functions," "Python Function Recursion,"
# "Python Raise an Exception," "Python Built-in Exceptions," "Python Try Except,"
# Cite: geeksforgeeks.org, Article "Recursion in Python"


def print_numbers_non_recursive(n):
    # Function uses a for loop to print numbers from 1 to n. 
    # Iterates through range and prints each number directly.
    for i in range(1, n + 1):
        print(i, end=' ')
# Cite: Gaddis Python 6e Chapter 12, Pages 3-5, 8-10, 13-16, 18-22,
# Cite: w3schools.com, Articles "Python Functions," "Python Function Recursion,"
# "Python Raise an Exception," "Python Built-in Exceptions," "Python Try Except,"
# Cite: geeksforgeeks.org, Article "Recursion in Python"


def test_print_functions():
    # Function tests both recursive and non-recursive functions. 
    # Prompts user to enter positive integer and validates input. 
    # Calls and displays output of both functions.
    while True:
        try:
            print()
            n = int(input("Enter a positive integer: "))
            if n <= 0:
                raise ValueError("The number must be greater than 0.")
            break
        except ValueError as ve:
            print(ve)
    
    # Displays recursive function information.
    print("\nInvokes recursive function:")
    print_numbers_recursive(n)
    print("\nEnd of recursive function output\n")

    # Displays non-recursive function information.
    print("Invokes non-recursive function:")
    print_numbers_non_recursive(n)
    print("\nEnd of non-recursive function output\n")
# Cite: Gaddis Python 6e Chapter 12, Pages 3-5, 8-10, 13-16, 18-22,
# Cite: w3schools.com, Articles "Python Functions," "Python Function Recursion,"
# "Python Raise an Exception," "Python Built-in Exceptions," "Python Try Except,"
# Cite: geeksforgeeks.org, Article "Recursion in Python"


# Calls main function.
if __name__ == "__main__":
    # Tests both recursive and non-recursive functions.
    test_print_functions()
