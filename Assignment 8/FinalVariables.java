

//A  final variable is a constant whose value cannot be changed after initialization
//it cannot be override by a subclass. it ensures method behavior remains same/constant.

class Parent{
    final void display(){
        System.out.println("final method in parent class");
    }
}

class Child extends Parent{
    //void display() {} - compilation error if attempted
}

public class FinalVariables{
    public static void main(String[] arg){
        Child c = new Child();
        c.display(); //calls the final method in parent class 
    }
}