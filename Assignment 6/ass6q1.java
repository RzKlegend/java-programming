class Vehicle {

    private String name = "Aston Martin";
    private int speed = 200;
    private String color = "Black";
    private double price = 1670000;

    // Inner Class
    class VehicleDetails {
        void display() {
            System.out.println("Vehicle Name : " + name);
            System.out.println("Speed        : " + speed + " km/h");
            System.out.println("Color        : " + color);
            System.out.println("Price        : ₹" + price);
        }
    }
}

// Parent Class
class Action {
    void perform() {
        System.out.println("Vehicle is moving...");
    }
}

public class ass6q1 {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // Inner Class Object
        Vehicle.VehicleDetails details = v.new VehicleDetails();

        System.out.println("Vehicle Details -");
        details.display();

        // Anonymous Class
        Action obj = new Action() {
            @Override
            void perform() {
                System.out.println("\nVehicle is starting...");
                System.out.println("Engine Started Successfully!");
                System.out.println("Drive Safe!");
            }
        };

        System.out.println("\nVehicle Action -");
        obj.perform();
    }
}
