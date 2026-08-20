# Ian Lewis
# 06/15/24
# Module 4_2 Assignment

# The purpose of this program is to convert miles to kilometers.
# This program also utilizes try/except blocks.

# Function runs conversion of miles to kilometers.
def miles_to_kilometers(miles):
    # Converts miles to kilometers using floats (decimals).
    # Conversion factor of 1.60934
    kilometers = miles * 1.60934
    # Return statement calls value from conversion.
    return kilometers
# Cite: Gaddis Python 6e Chapter 5, Pages 4-12, 20-23, 57-59

def main():
    # While loop continues to prompt user until valid input is entered.
    while True:
        # Initiates try/except blocks within while loop.
        try:
            # User inputs the number of miles driven.
            miles = input("Enter the number of miles driven: ")

            # Checks valid input and converts input to float.
            miles = float(miles)
            # If statement checks for valid input from user.
            if miles < 0:
                # Negative miles cannot be calculated.
                # Raises ValueError (ve) exception and prints error message.
                raise ValueError("Number of miles cannot be negative.")
            
            # Calls function to convert miles to kilometers.
            kilometers = miles_to_kilometers(miles)
            
            # Prints results of valid conversion as fstring.
            print(f"{miles} miles is equal to {kilometers:.2f} kilometers.")
            # Break statement causes while loop to stop running.
            break
        
        except ValueError as ve:
            # Prints ValueError message and requests valid input from user.
            print(f"Invalid input: {ve} Please enter a valid number.")
# Cite: Gaddis Python 6e Chapter 4, Pages 5-8, 32
# Cite: Gaddis Python 6e Chapter 5, Pages 20-23
# Cite: w3schools.com, Articles "Python While Loops," "Python Try Except," 
# "Python Built-in Exceptions," "Python Raise an Exception"


# Calls main function to execute program.
if __name__ == "__main__":
    main()