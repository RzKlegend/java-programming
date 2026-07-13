/*Develop a Mobile Phone Inventory System using different constructors to initialize 
mobile details and create duplicate object records. */

public class ass2q2 {

    static class MobilePhone {
        private String brand;
        private String model;
        private double price;

        // Default constructor
        public MobilePhone() {
            this.brand = "random";
            this.model = "standard model";
            this.price = 0.0;
        }

        // Parameterized constructor
        public MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Copy constructor
        public MobilePhone(MobilePhone phone) {
            this.brand = phone.brand;
            this.model = phone.model;
            this.price = phone.price;
        }

        public void displayDetails() {
            System.out.println("Brand: " + brand + " | Model: " + model + " | Price: $" + price);
        }
    }

    public static void main(String[] args) {
        // Default constructor instance exaple
        MobilePhone phone1 = new MobilePhone();
        System.out.print("Default Phone: ");
        phone1.displayDetails();

        // Parameterized constructor instance
        MobilePhone phone2 = new MobilePhone("Samsung", "Samsung GALAXY S25 ULTRA", 799.99);
        System.out.print("Original Phone Record: ");
        phone2.displayDetails();

        // Copy constructor instance (creating duplicate record)
        MobilePhone phone3 = new MobilePhone(phone2);
        System.out.print("Duplicate Phone Record: ");
        phone3.displayDetails();
    }
}