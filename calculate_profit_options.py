import locale
locale.setlocale(locale.LC_ALL, 'en_US.UTF-8')

# https://tinyurl.com/y59xv8rj
# https://www.online-python.com/
# https://tinyurl.com/mrxwyyz8

def calculateProfitForBuyCallOrPutInTheMoney():
    # Input values for the call or put option
    strikePrice = float(input("Type the strike price:"))
    
    futurePrice = float(input("Type the future hoped price:"))

    premiumPaidPerContract = float(input("Type the premium paid per contract:"))

    numberOfContractsBought = float(input("Type the number of contracts bought:"))

    # Calculate profit per contract
    profitPerContract = abs(futurePrice - strikePrice) - premiumPaidPerContract

    # Calculate total profit: profit per contract multiplied by the number of contracts bought
    totalProfit = profitPerContract * numberOfContractsBought

    return totalProfit


while(True):
    profit = calculateProfitForBuyCallOrPutInTheMoney()
    print(f"\nTotal profit: {profit:.2f}\n")
