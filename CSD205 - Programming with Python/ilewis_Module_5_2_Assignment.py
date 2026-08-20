# Ian Lewis
# 06/22/24
# Module 5_2 Assignment

# The purpose of this program is to collect data from the user,
# write the information into a new file, and display the contents.

# ** Saw class note regarding logic error, program utilizes "file_name" user input for .txt file **
# Additionally this program saves data as a separate text file
# named from user input.


# Function prompts user to enter information sequentially.
def user_info():
    # Styling preference to break up input prompts from termnial commands.
    print()
    file_name = input("Enter file name: ")
    user_name = input("Enter your name: ")
    street_address = input("Enter your street address: ")
    phone_number = input("Enter your phone number: ")

    return file_name, user_name, street_address, phone_number
# Cite: Gaddis Python 6e Chapter 6, Pages 4-7

# Function writes user information to new file.
def write_to_file(file_name, user_name, street_address, phone_number):
    with open(file_name, 'a') as file:
        file.write(f"{user_name},{street_address},{phone_number}\n")
# Cite: Gaddis Python 6e Chapter 6, Pages 10-15, 20-23

# Function reads and displays contents of new file.
def read_and_display_file(file_name):
    with open(file_name, 'r') as file:
        contents = file.read()
    # Styling preference to break up file contents from input prompts.
    print()
    print("File contents: ")
    print(contents)
# Cite: Gaddis Python 6e Chapter 6, Pages 10-15, 20-23 

def main():
    file_name, user_name, street_address, phone_number = user_info()

    # Writes user info to new file.
    write_to_file(file_name, user_name, street_address, phone_number)
    
    # Reads and displays contents of new file.
    read_and_display_file(file_name)
    
    # ** Saw class note regarding logic error, program utilizes "file_name" user input for .txt file **
    # Saves data to new text file named from user input: "<file_name>_data.txt"
    file_name = f"{file_name}_data.txt"
    with open(file_name, 'w') as file:
        file.write(f"{user_name},{street_address},{phone_number}\n")
# Cite: Gaddis Python 6e Chapter 6, Pages 7, 10-15, 20-23


# Calls main function to execute program.
if __name__ == "__main__":
    main()