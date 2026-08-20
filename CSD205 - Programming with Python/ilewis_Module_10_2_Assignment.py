# Ian Lewis
# 07/21/24
# Module 10_2 Assignment

# This program creates two classes, the Employee class and the ProductionWorker class that inherits 
# from the Employee class. The Employee class has four fields: the employee name, employee gender, 
# employee hourly pay rate, and the employee number. The ProductionWorker class extends the Employee class 
# and has one additional field: the shift number, such as day shift (1), swing shift (2), and graveyard (3). 
# Setters and getters (attribute managers) are written for all fields in both classes.

# This program also:
    # Writes a Main class that uses these classes.
    # Creates two instances of each class in the Main class. Setting all field values using setters and getters.
    # Sets the values in the code requiring no user input.
    # Uses these four class instances, and displays the information to the user of the application, 
        # making the output very readable and understandable.


class Employee:
    # Employee class information
    def __init__(self, name, gender, hourly_pay_rate, employee_number):
        self.__name = name
        self.__gender = gender
        self.__hourly_pay_rate = hourly_pay_rate
        self.__employee_number = employee_number

    # Setters
    def set_name(self, name):
        self.__name = name

    def set_gender(self, gender):
        self.__gender = gender

    def set_hourly_pay_rate(self, hourly_pay_rate):
        self.__hourly_pay_rate = hourly_pay_rate

    def set_employee_number(self, employee_number):
        self.__employee_number = employee_number

    # Getters
    def get_name(self):
        return self.__name

    def get_gender(self):
        return self.__gender

    def get_hourly_pay_rate(self):
        return self.__hourly_pay_rate

    def get_employee_number(self):
        return self.__employee_number
# Cite: Gaddis Python 6e Chapter 11, Pages 6-11, 15-17
# Cite: w3schools.com, Articles "Python Polymorphism," "Python Inheritance,"
# "Python setattr() Function," "Python getattr() Function,"


class ProductionWorker(Employee):
    # ProductionWorker class information
    def __init__(self, name, gender, hourly_pay_rate, employee_number, shift_number):
        super().__init__(name, gender, hourly_pay_rate, employee_number)
        self.__shift_number = shift_number
    
    # Setter for shift number
    def set_shift_number(self, shift_number):
        self.__shift_number = shift_number

    # Getter for shift number
    def get_shift_number(self):
        return self.__shift_number
# Cite: Gaddis Python 6e Chapter 11, Pages 6-11, 15-17
# Cite: w3schools.com, Articles "Python Polymorphism," "Python Inheritance,"
# "Python setattr() Function," "Python getattr() Function,"


class Main:
    def main():
        # Creates instances for Employee class
        employee1 = Employee("Lindsay Grant", "Female", 22.5, 1039)
        employee2 = Employee("Nathaniel Baskins", "Male", 17.5, 3702)

        # Creates instances for ProductionWorker class
        worker1 = ProductionWorker("Jarel Smith", "Male", 25.0, 2883, 1)
        worker2 = ProductionWorker("Stacey Platton", "Female", 27.0, 4082, 3)
        print()

        # Displays information for Employees
        print("Employee Information:")
        print()
        print(f"Name: {employee1.get_name()}")
        print(f"Gender: {employee1.get_gender()}")
        print(f"Hourly Pay Rate: ${employee1.get_hourly_pay_rate()}")
        print(f"Employee Number: {employee1.get_employee_number()}\n")

        print(f"Name: {employee2.get_name()}")
        print(f"Gender: {employee2.get_gender()}")
        print(f"Hourly Pay Rate: ${employee2.get_hourly_pay_rate()}")
        print(f"Employee Number: {employee2.get_employee_number()}\n")
        print()

        # Displays information for ProductionWorkers
        print("Production Worker Information:")
        print()
        print(f"Name: {worker1.get_name()}")
        print(f"Gender: {worker1.get_gender()}")
        print(f"Hourly Pay Rate: ${worker1.get_hourly_pay_rate()}")
        print(f"Employee Number: {worker1.get_employee_number()}")
        print(f"Shift Number: {worker1.get_shift_number()}\n")

        print(f"Name: {worker2.get_name()}")
        print(f"Gender: {worker2.get_gender()}")
        print(f"Hourly Pay Rate: ${worker2.get_hourly_pay_rate()}")
        print(f"Employee Number: {worker2.get_employee_number()}")
        print(f"Shift Number: {worker2.get_shift_number()}\n")
# Cite: Gaddis Python 6e Chapter 11, Pages 6-11, 15-17
# Cite: w3schools.com, Articles "Python Polymorphism," "Python Inheritance,"
# "Python setattr() Function," "Python getattr() Function,"


if __name__ == "__main__":
    Main.main()