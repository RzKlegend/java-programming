/* Develop a Restaurant Billing Application where overloaded methods calculate bills
for dine-in, takeaway, and delivery orders, while static variables track total orders */




public class ass3q2 {

    
    private static int totalOrders = 0;

    // Overloading method for dine-in orders Base price + service charge)
    public static double calculateBill(double itemTotal, double serviceCharge) {
        totalOrders++;
        return itemTotal + serviceCharge;
    }

    // Overloading method for Takeaway orders (Base price + packaging charges)
    public static double calculateBill(double itemTotal, double packagingFee, boolean isTakeaway) {
        totalOrders++;
        return itemTotal + packagingFee;
    }

    // Overloading method for delivery orders (Base price+delivery charge+ distance charge)
    public static double calculateBill(double itemTotal, double deliveryFee, double distanceFee) {
        totalOrders++;
        return itemTotal+ deliveryFee + distanceFee;
    }

    //static method to getthe total orders count
    public static int getTotalOrders() {
        return totalOrders;
    }

    public static void main(String[] args) {
        //sample values
        // dine in rrder
        double dineInBill = calculateBill(500.0, 50.0);
        System.out.println("Dine-in Total: $" + dineInBill);

        // 2.takeaway Order
        double takeawayBill = calculateBill(350.0, 20.0, true);
        System.out.println("Takeaway Total: $" + takeawayBill);

        // 3.delivery Order
        double deliveryBill = calculateBill(800.0, 40.0, 30.0);
        System.out.println("Delivery Total: $" + deliveryBill);

        System.out.println("\nTotal Orders Processed: " + getTotalOrders());
    }
}