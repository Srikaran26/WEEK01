public class Level1q6 {
    public static void main(String[] args) {
        double fee = 125000.0;
        double discountPercent = 10.0;
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}