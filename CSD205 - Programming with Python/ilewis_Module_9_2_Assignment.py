# Ian Lewis
# 07/13/24
# Module 9_2 Assignment

# This program creates a student class that will calculate and display student cumulative GPA. 
# The program uses the methods of the student class to accomplish the following:
    # Prompt the user for the first and last name of the student.
    # Create a student object by passing the first and last name to the __init__ method.
    # Create a loop that prompts the user for the following: The credits and grade for each course the student has taken.
    # Once the user ends the loop, display the student’s cumulative GPA.


# Class for student, used to calculate cumulative GPA
class Student:
    # Creates a new student object from user input
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name
        self.courses = []

    # Adds course to student's record
    def add_course(self, credits, grade):
        self.courses.append((credits, grade))

    # Calculates cumulative GPA for student
    def calculate_gpa(self):
        total_credits = 0
        total_points = 0
        for credits, grade in self.courses:
            total_credits += credits
            total_points += credits * grade
        return total_points / total_credits if total_credits != 0 else 0

    # Displays student's cumulative GPA
    def display_gpa(self):
        gpa = self.calculate_gpa()
        print(f"{self.first_name} {self.last_name}'s cumulative GPA is: {gpa:.2f}")
# Cite: Gaddis Python 6e Chapter 9, Pages 9-18, 26-31,
# Cite: w3schools.com, Articles "Python Classes and Objects," "Python __init__() Function,"
# "Python While Loops," "Python For Break," "Python float() Function"
# Cite: Rutgers Newark Website, Article "How to Calculate Your Cumulative GPA"


def main():
    # Prompts user for student's first and last name
    print()
    first_name = input("Enter the student's first name: ")
    print()
    last_name = input("Enter the student's last name: ")

    # Creates a Student object
    student = Student(first_name, last_name)

    # Loop continuously prompts for course information until user enters "end"
    while True:
        print()
        credits = input("Enter the number of credits for the course (or type 'end' to finish): ")
        if credits.lower() == 'end':
            break
        credits = float(credits)
        print()
        grade = float(input("Enter the grade for the course: "))

        # Adds course to student's record
        student.add_course(credits, grade)

    # Displays cumulative GPA for student
    print()
    student.display_gpa()
# Cite: Gaddis Python 6e Chapter 9, Pages 9-18, 26-31,
# Cite: w3schools.com, Articles "Python Classes and Objects," "Python __init__() Function,"
# "Python While Loops," "Python For Break," "Python float() Function"
# Cite: Rutgers Newark Website, Article "How to Calculate Your Cumulative GPA"


if __name__ == "__main__":
    main()