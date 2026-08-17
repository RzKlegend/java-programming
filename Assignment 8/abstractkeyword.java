
// key points - an abstract class cannot be instantiated 
// an abstract method has no body and must be implemented in a subclass 

abstract class Shape{
    abstract void draw();

    void message(){
        System.out.println("this is a shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}


public class abstractkeyword {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.message();
    }
}
