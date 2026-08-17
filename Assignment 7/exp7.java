
import java.text.ParseException;

//inheritance = where one class acquires the properties and methods of another class
/* 
class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }
}

public class exp7{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat(); //inherited method
        d.bark();
        Animal a = new Dog();
        a.eat();
        
    }
}
*/

//2. Multilevel inheritance - a class inherits from a class and another class inherits from it 
/* 
class Grandparent{
    void showGrandparent(){
        System.out.println("Grandparent class method");
    }

}
class Parent extends Grandparent{
    void showParent(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{
    void showChild(){
        System.out.println("child class method");

    }
}

public class exp7{ 
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }}
*/

//3. Heirarchical inheritance = multiple subclasses inherit from ONE single superclass
/* 
class Animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.err.println("cat meows");
    }
}

public class exp7{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
*/

//we use interface because we cant implement multiple inheritance
//interface = an interface is a blueprint of a class that contains abstract methods 
// key points - use the interface keyword, supports multiple inheritance, classes implement interfaces using the implemeents keyword
// this keyword points to the current object
/* 
interface Animal{
    void sound(); //abstract method
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
*/

