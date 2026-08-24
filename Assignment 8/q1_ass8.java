/*1.Create an Employee and Manager program where Manager accesses Employee details
using super keyword. */


// Parent class
class Employee{
    String name;
    int id;

    // Constructor
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    // To display employee details
    void display(){
        System.out.println("Name:-" + name);
        System.out.println("Id:-" + id);
    }
}

// Child class inheriting from parent class (employee)
class Manager extends Employee{
    String department;

    // Constructor
    Manager(String department, String name, int id){
        // Here we are using the super keyword to access the Employee constructor
        super(name,id);
        this.department = department;
    }

    // To display 
    void displayManagerDetails(){
        super.display();
        System.out.println("Department: " + department);
    }
}

public class q1_ass8{
    public static void main(String[] args) {
        // Creating the manager object
        Manager mgr = new Manager("CSE", "Akash", 910);

        // Displaying
        System.out.println("--Manager Details");
        mgr.displayManagerDetails();
    }
}

