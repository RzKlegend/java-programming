/*Develop a E-Commerce Product System where electronic, clothing, and grocery
products inherit common properties and implement product interfaces.  */

interface ProductInterfaces{
    void showDetails();
}

class BaseProduct{
    public String name;
    public double price;
}

class Electronic extends BaseProduct implements ProductInterfaces{
    public int warrantyMonths;

    public Electronic(String productName, double productPrice, int warranty){
        name = productName;
        price = productPrice;
        warrantyMonths = warranty;
    }
    public void showDetails(){
        System.out.println("Electronics: " + name + " | Price: " + price + " | Warranty: " + warrantyMonths);
    }
}

class Clothing extends BaseProduct implements ProductInterfaces{
    public String size;
    
    public Clothing(String productName, double productPrice, String productSize){
        name = productName;
        price = productPrice;
        size = productSize;
    }
    public void showDetails(){
        System.out.println("Clothing: " + name + " | Price of the clothing: " + price + " | Size of the clothing: " + size);
    }
}

class Grocery extends BaseProduct implements ProductInterfaces{
    public String expiryDate;
    
    public Grocery(String productName, double productPrice, String expiry){
        name = productName;
        price = productPrice;
        expiryDate = expiry;
    }
    public void showDetails(){
        System.out.println("Grocery: "  + name + " | Price of the grocery: " + price + " | Expiry date of the grocery: " + expiryDate);
    }
}

public class ass7_q2 {
    public static void main(String[] args) {
        Electronic laptop = new Electronic("Laptop", 899.99, 12);
        Clothing tshirt = new Clothing("T-Shirt", 20.00, "Medium");
        Grocery milk = new Grocery("Milk", 2.49, "Next week");

        laptop.showDetails();
        tshirt.showDetails();
        milk.showDetails();
    }
}