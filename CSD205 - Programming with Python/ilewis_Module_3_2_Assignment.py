# Ian Lewis
# 06/08/2024
# Module 3.2 Assignment

# The purpose of this program is to calculate how long it will take for
# an investment to double at a given interest rate.


def main():
    def calculate_years_to_double(principal_investment, annual_interest_rate):
        # Calculates how many years are required to double initial invest amount at given interest rate.
        investment_years = 0
        target_amount = principal_investment * 2
        current_amount = principal_investment
        
        while current_amount < target_amount:
            current_amount += current_amount * annual_interest_rate
            investment_years += 1
        
        return investment_years
        # Cite: Gaddis Python 6e Chapter 3, Pages 8-9
        # Cite: Gaddis Python 6e Chapter 4, Pages 11-13, 23

    # User inputs initial investment amount and annualized interest rate (as a decimal).
    initial_investment = float(input("Enter the initial investment amount: "))
    annualized_interest_rate = float(input("Enter the annualized interest rate (as a decimal): "))
    # Cite: Gaddis Python 6e Chapter 2, Page 28

    # Calculate the number of years to double investment.
    investment_years = calculate_years_to_double(initial_investment, annualized_interest_rate)
    # Cite: Gaddis Python 6e Chapter 2, Pages 15, 30, 54

    # Output the result of calculation.
    print(f"It will take {investment_years} years for the investment to double.")
    # Cite: Gaddis Python 6e Chapter 2, Pages 43-51, 54


# Call main function to execute program.
if __name__ == "__main__":
    main()