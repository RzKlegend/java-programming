/*Develop a Vehicle Insurance System where child insurance classes access parent
vehicle information using the super keyword.  */

class VehicleInformation{
    String carName;
    int numberPlate;

    //constructor
    VehicleInformation(String carName, int numberPlate) {
        this.carName = carName;
        this.numberPlate = numberPlate;
    }

    // Display method to display the vehicle info
    void display(){
        System.out.println("Car name:- " + carName);
        System.out.println("Car number plate:- " + numberPlate);
    }
    
}

class Insurance extends VehicleInformation{
    String personName; // Name of person who is going to have the insurance
    int days; // Number of days the insurance is valid

    //creating the insurance constructor
    Insurance(String personName, int days, String carName, int numberPlate){
        super(carName, numberPlate);
        this.personName = personName;
        this.days = days;
    }

    // Display function for displaying the insurance details
    void displayInsuranceDetails(){
        super.display();
        System.out.println("Person name:- " + personName);
        System.out.println("Number of days insurance is valid:- " + days);

    }
}

public class q2_ass8 {
    public static void main(String[] args) {
        //Creating the manager object
        Insurance inr = new Insurance("Akash", 90, "Volkswagen", 9090);

        // Displaying the insurance details
        System.out.println("Insurance Details:");
        inr.displayInsuranceDetails();
    }
}
