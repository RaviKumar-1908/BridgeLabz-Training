// creating a class FeeDiscount to find discounted amount and final fee
class FeeDiscount {
    public static void main(String[] args) {

        // Taking a variable to store course fee
        int fee = 125000;

        // Taking a variable to store discount percentage
        int discountPercent = 10;

        // Calculating discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculating final fee after discount
        int finalFee = fee - discount;

        // Displaying the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
