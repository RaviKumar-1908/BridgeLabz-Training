//creating ProfitAndLoss class to find Profit and profit percentage
class ProfitAndLoss
{
    public static void main(String[] args)
    {
        // Taking a variable to store cost price
        int costPrice  = 129;
    
        // Taking a variable to store selling price
        double sellingPrice  = 191;
    
        //Taking a variable to store profit
        double profit = sellingPrice - costPrice;

        //taking a variable to store profit percentage
        double profitPercentage = (profit/costPrice)*100;

        //Displaying result 
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
         System.out.println("The Profit is INR " + profit + " and Profit Percentage is INR " + profitPercentage);
    }
}