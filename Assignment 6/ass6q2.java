class FoodOrder {
    private String item = "Chole Bhature";
    private double price = 670.0;
    private String deliveryTime = "60 minutes";
    // Inner class 
    class OrderDetails {
        void displayOrder() {
            System.out.println("Item: " + item);
            System.out.println("Price: Rs. " + price);
            System.out.println("Delivery Time: " + deliveryTime);
        }
    }
}
class DeliveryStatus {
    void updateStatus() {
        System.out.println("Order Placed");
    }
}
public class ass6q2 {
    public static void main(String[] args) {
        // Demonstrating Member Inner Class 
        FoodOrder order = new FoodOrder();
        FoodOrder.OrderDetails details = order.new OrderDetails();
        details.displayOrder();
        DeliveryStatus status = new DeliveryStatus() {
            void updateStatus() {
                System.out.println("Status Update: Dear customer, your food is out for delivery and arriving soon!");
            }
        };
        status.updateStatus();
    }
}
