/*Create a To-Do List application using ArrayList to store tasks and StringBuffer to
display tasks.  */

import java.util.ArrayList;

public class ass5q1 {
    public static void main(String[] args){
        
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Learn java at home");
        todoList.add("eat subway");
        todoList.add("make a sandwhich at home");
        todoList.add("go to jim");

        StringBuffer sb = new StringBuffer();

        sb.append("My TO-DO List\n");
        for (int i=0;i<todoList.size();i++){
            sb.append(i + 1).append(". ").append(todoList.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
