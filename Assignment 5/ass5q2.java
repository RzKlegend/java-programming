/*Create a Student Course Registration System using ArrayList to store the list of
courses registered by a student and StringBuffer to generate and display the registered
course list. The application should allow users to add, remove, and view registered
courses.  */

import java.util.ArrayList;



public class ass5q2 {

    public static void main(String[] args){
        ArrayList<String> Studentcourseregistrationsystem = new ArrayList<>();

        Studentcourseregistrationsystem.add("Discrete maths");
        Studentcourseregistrationsystem.add("Linear Algebra");
        Studentcourseregistrationsystem.add("Java");
        Studentcourseregistrationsystem.add("DSA");
        Studentcourseregistrationsystem.add("Python");

        StringBuffer sb = new StringBuffer();

        sb.append("Student Course Registration System\n");
        for(int i=0; i<Studentcourseregistrationsystem.size(); i++){
            sb.append(i+1).append(". ").append(Studentcourseregistrationsystem.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
