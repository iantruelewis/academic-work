# Ian Lewis
# 06/02/2024
# Module 1.3 Assignment: First Python Program

# The purpose of this program is to calculate the total cost of
# installing fiber optic cable by a company called "Iocus Technologies."


def main():
    # Displays welcome message for program.
    # Fictitious company name: "Iocus Technologies"
    print("Welcome to Iocus Technologies' Fiber Optics Installation Cost Calculator")
    # Cite: Gaddis Python 6e Chapter 2, Page 10

    # User inputs number of feet of fiber optic cable to be installed.
    number_of_feet = float(input("Enter the number of feet of fiber optic cable to be installed: "))
    # Cite: Gaddis Python 6e Chapter 2, Page 28

    # Multiply total cost as the number of feet by cost per foot using '.87' as value for cost per foot.
    cost_per_foot = 0.87
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