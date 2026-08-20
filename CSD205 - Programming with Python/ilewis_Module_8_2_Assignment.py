# Ian Lewis
# 07/13/24
# Module 8_2 Assignment

# The purpose of this program is to utilize a dictionary to store stocks by their
# ticker symbols and pull the values of said stock when ticker symbol is input. 

# The program will return an error message if the ticker is not found in the dictionary.


def main():
    # Dictionary of stocks with correlating prices
    stocks = {
        'AAPL': 230.54,
        'AMZN': 194.49,
        'DIS': 97.13,
        'GOOGL': 186.62,
        'META': 498.12,
        'MSFT': 453.70,
        'NFLX': 647.60,
        'SHOP': 64.89,
        'TGT': 152.85,
        'TSM': 187.35
    }

    # Asks user to enter a ticker symbol
    print()
    ticker_symbol = input("Enter a ticker symbol: ").upper()
    print()

    # Searches for ticker symbol in dictionary
    if ticker_symbol in stocks:
        print(f"The price of {ticker_symbol} is ${stocks[ticker_symbol]:.2f}")
    else:
        print("Ticker symbol not found.")
    print()
# Cite: Gaddis Python 6e Chapter 9, Pages 3-4, 13, 17-19, 21,
# Cite: w3schools.com, Articles "Python Dictionaries," "Python - Access Dictionary Items,"
# "Python Dictionary Methods," "Python If ... Else,"


if __name__ == "__main__":
    main()
