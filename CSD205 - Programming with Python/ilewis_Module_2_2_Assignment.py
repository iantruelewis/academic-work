# Ian Lewis
# 07/28/2024
# Module 2_2 Assignment

# The purpose of this program is to calculate the total cost of
# installing fiber optic cable by a company called "Iocus Technologies."

# This program also calculates discounted cost per amount of cable ordered.


def main():
    # Displays welcome message for program.
    # Fictitious company name: "Iocus Technologies"
    print("Welcome to Iocus Technologies' Fiber Optics Installation Cost Calculator")
    # Cite: Gaddis Python 6e Chapter 2, Page 10

    # User inputs number of feet of fiber optic cable to be installed.
    number_of_feet = float(input("Enter the number of feet of fiber optic cable to be installed: "))
    # Cite: Gaddis Python 6e Chapter 2, Page 28

    # Multiply total cost as the number of feet by cost per foot using '.87' 
    # as default value for cost per foot if less than or equal to 100 feet.

    # Determine total cost based on number of feet user inputs.
    if number_of_feet > 500:
        cost_per_foot = 0.50
    elif number_of_feet > 250:
        cost_per_foot = 0.70
    elif number_of_feet > 100:
        cost_per_foot = 0.80
    else:
        # Default value if under or equal to 100 feet.
        cost_per_foot = 0.87
    # Cite: Gaddis Python 6e Chapter 3, Pages 7, 9, 16, 20-22

    total_cost = number_of_feet * cost_per_foot
    # Cite: Gaddis Python 6e Chapter 2, Pages 15, 30, 54

    # Display calculated information and company name (Iocus Technologies).
    company_name = "Iocus Technologies"
    print(f"\nCompany: {company_name}")
    print(f"Number of feet to be installed: {number_of_feet}")
    print(f"Cost per foot: ${cost_per_foot:.2f}")
    print(f"Total cost: ${total_cost:.2f}")
    # Cite: Gaddis Python 6e Chapter 2, Pages 43-51, 54


# Call main function to execute program.
if __name__ == "__main__":
    main()