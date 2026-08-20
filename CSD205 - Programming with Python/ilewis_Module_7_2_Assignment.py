# Ian Lewis
# 07/07/24
# Module 7_2 Assignment

# The purpose of this program is to write a program that acquires a string containing a 
# person’s first, middle, and last names, and then display their first, middle, and last initials. 


def get_initials(full_name):
    # Splits full name entered by user into list of names
    separate_names = full_name.split()
    
    # Extracts first letter of each name part and capitalizes it
    initials = [name[0].upper() + '.' for name in separate_names]
    
    # Joins initials with a space and return result
    return ' '.join(initials)
# Cite: Gaddis Python 6e Chapter 8, Pages 4-6, 8-10, 13-16, 21-22,
# Cite: w3schools.com, Articles "Python Strings," "Python - Slicing Strings,"
# "Python - String Concatenation," "Python - String Methods,"


def main():
    # Styling preference to break up lines of text
    print()
    # User enters a full name
    full_name = input("Enter your first, middle, and last names: ")
    # Styling preference to break up lines of text
    print()

    # Displays the initials from full name
    print("Initials: " + get_initials(full_name))
    # Styling preference to break up lines of text
    print()


if __name__ == "__main__":
    main()