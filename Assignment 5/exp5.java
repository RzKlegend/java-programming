import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class exp5 {

    public static void main(String[] args) {
        System.out.println("Run the example classes individually.");
    }
}

class javacollection {
    public static void main(String[] args){
        int [] numbers = {10,20,30,40,50};

        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}

class arraylistexample {
    public static void main(String[] args){
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        fruits.add("Banana");

        System.out.println("Fruits:"  + fruits);
        fruits.remove("Banana");
        System.out.println("FRUITS NOW ARE:" + fruits);

        System.out.println("Size:"  + fruits.size());
        System.out.println("Contains apples:"  + fruits.contains("Apple"));

        fruits.remove("Pineapple");
        fruits.remove("Cherry");
        fruits.remove("Apple");
        System.out.println("FRUITS NOW ARE:" + fruits);
        
        /* Gives a compilation error : - 
        fruits.removeLast()
        System.out.println("FRUITS NOW ARE:" + fruits);
        */
    }
}

// vectors are similar to ArrayList but synchronized (thread-safe), we are not going to use threads for vectors here
// slower than ArrayList due to synchronization overhead

class vectors {
    public static void main(String[] args){
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(22);
        numbers.add(255);
        System.out.println("Vectors:" + numbers);
        numbers.remove(1);
        System.out.println("VECTORS NOW ARE "  +  numbers);
        System.out.println("Numbers size :" + numbers.size());
        System.out.println("Element at index 0: "  + numbers.get(0));
    }
}

// string in java is an *immutable* sequence of characters
// once created, its value cannot be changed

/* basically what it is doing here is:  Str1 --> Hello
after creating str2, str1 is only pointing to Java, the original value of Hello is not deleted or changed, just the str1 is pointing to str2 */

class strings {
    public static void main(String[] args){

        // creating string using literal
        String str1 = "Hello";

        // creating string using new keyword
        String str2 = new String("Java");
        System.out.println(str1);
        System.out.println(str2);
    }
}

// StringBuffer is mutable version of string
// used when frequent string modifications are required
// thread safe (synchronized)
// string is faster

class stringbuffer {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");

        sb.append("World");
        System.out.println("After append: " + sb);

        sb.insert(6,"java");
        System.out.println("After inserting: "  + sb);

        sb.replace(0,5,"Hi");
        System.out.println("after replacing: " + sb);

        sb.delete(2,5);
        System.out.println("after deleting " + sb);

        sb.reverse();
        System.out.println("after reversing: " + sb);
    }
}

// *string tokenizer* - used for splitting a string into tokens (words,numbers,etc)
// defined in java.util package (import java.util.StringTokenizer)
// faster than split() method of string class

class stringtokenizer {
    public static void main(String[] args){
        String str = "Java, python,c++,javascript";
        StringTokenizer st = new StringTokenizer(str, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}







