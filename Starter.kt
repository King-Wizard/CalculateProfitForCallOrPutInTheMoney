import kotlin.math.abs

fun calculateProfitForCallOrPutInTheMoney(): Double {
    // Input values for the call or put option
    println("Type the strike price:")
    val strikePrice = readLine()?.toDoubleOrNull()
    
    println("Type the future hoped price:")
    val futurePrice = readLine()?.toDoubleOrNull()
    
    println("Type the premium paid per contract:")
    val premiumPaidPerContract = readLine()?.toDoubleOrNull()
    
    println("Type the number of contracts bought:")
    val numberOfContractsBought = readLine()?.toDoubleOrNull()
    
    // Check that all inputs are valid
    if (strikePrice == null || futurePrice == null || premiumPaidPerContract == null || numberOfContractsBought == null) {
        println("Invalid input provided.")
        return 0.0
    }
    
    // Calculate the difference between the future price and the strike price
    val difference = futurePrice - strikePrice
    
    // Calculate profit per contract: absolute value of the difference minus the premium paid
    val profitPerContract = abs(difference) - premiumPaidPerContract
    
    // Calculate total profit: profit per contract multiplied by the number of contracts bought
    val totalProfit = profitPerContract * numberOfContractsBought
    
    return totalProfit
}

fun main() {
    val profit = calculateProfitForCallOrPutInTheMoney()
    println("\nTotal profit: $profit")
}
