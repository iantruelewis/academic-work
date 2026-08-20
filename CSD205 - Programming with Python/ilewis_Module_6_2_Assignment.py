# Ian Lewis
# 06/29/24
# Module 6_2 Assignment

# The purpose of this program is to collect and organize information in a tuple.
# The U.S. states are used as the information collection.

# This program will:
#   • Initialize the original values of the U.S. states
#   • Display contents of tuple in a single statment
#   • Iterate through the collection displaying output in a sentence using f-string format
#   • Repeat output in reverse order using different context string


def main():
    # Initializes values of U.S. states
    states = ("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland")
    print()
    
    # Displays contents of tuple in single statement
    print(f"U.S. states tuple: {states}")
    print()

    # Iterates through collection displaying output as a complete sentence using f-string format
    for state in states:
        print(f"One of the U.S. states is {state}.")
    print()

    # Repeats output in reverse order using different context string
    for state in reversed(states):
        print(f"A U.S. state you might visit is {state}.")
    print()
# Cite: Gaddis Python 6e Chapter 7, Pages 31-33, 36
# Cite: w3schools.com, Articles "Python Tuples," "Python reversed() Function"


# Calls main function to execute program.
if __name__ == "__main__":
    main()