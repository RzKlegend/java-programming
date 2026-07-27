import  java.util.ArrayList;
public class arraylistexample {
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
