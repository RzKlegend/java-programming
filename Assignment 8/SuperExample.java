/*package Assignment 8;

public class exp8 {
    
}
*/

//USE OF SUPER KEYWORD - the super keyword refers to the immediate parent class
//key points - access the parent class methods, invoke parent class constructors

/* 
class Parent{
    void display(){
        System.out.println("parent class method");
    }
}

class Child extends Parent{
    void display(){
        super.display();
        System.out.println("child class method");
    }
}

public class SuperExample{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
*/

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the parent's display method
        System.out.println("This is the child class.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        new Child(); // Create an instance of Child, which will call the Parent's display method
    }
}