public class multiplexceptions {
    public static void main(String[] args) {
        try {
            String str = null;

            //trying to call a method on a null object, which wil throw a null pointer exception
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //this block catches null pointer exceptions
            System.out.println("error: null pointer exception! object is null");
        }catch(Exception e){
            //this block catches any other excpetions
            System.out.println("some other error occured");
        }

        System.out.println("program continues adfter exception handling");
    }
}



// YOU ARE ABLE TO WRITE  TRY INSIDE TRY