/*Create a Student class using default and parameterized constructors to initialize student name
and roll number. */
public class ass2q1 {
    static class Student{
        private String name;
        private int rollNo;

        //default constructor
        public Student(){
            this.name = "akash";
            this.rollNo = 2260;
        }

        //parameterized constructor
        public Student (String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo;

        }
        public void displayInfo(){
            System.out.println("Student name=" + name + " Roll number:" + rollNo);
        }
    }

    public static void main(String[] args){
        Student student1 = new Student();
        System.out.print("Default Constructor Output: ");
        student1.displayInfo();

        //creating an object using parameterized constructor
        Student student2 = new Student("inra", 101);
        System.out.print("Parameterized Constructor Output: ");
        student2.displayInfo();
    }
}
