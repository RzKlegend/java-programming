// java program to demonstrate inner class and anonymous class



//outer class
class Outer{
    private String message="hello from outer class";
    
    //inner class 
    class Inner{
        void display(){
                System.out.println("message:" + message);
        }
    }
}

//normal class
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

public class exp6 {
    public static void main(String[] args) {
        Outer obj =  new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();

        Animal a = new Animal(){
            void sound(){
                System.out.println("Dog barking");
            }
        };
        a.sound();
    }
}
// an inner class is always ended with a semicolon
//1. member inner class = member in a class, class declared inside a class, but outside a method, can access all members inclduing private
//2. local inner class = a class declared inside a method, constructor or a block, it can be used only within that method or a block
// local variables always declared inside a method
//4. anonymous inner class = a class without a name, declared and instantanized in a single statement. it is used for a one time use by extending a class or  implamenting a interface
//5. static nested class = a static class declared inside another class. since it is static, it cannot directly access the non static members of the outer class(technically it is a nested class rather than an inner class)
