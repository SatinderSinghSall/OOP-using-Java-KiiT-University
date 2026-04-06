// Program to demonstrate NullPointerException

public class NullPointerExample {
    public static void main(String[] args) {

        // Declaring a String but not initializing it (null reference)
        String str = null;

        try {
            // Trying to call method on null object
            System.out.println("Length of string: " + str.length());
        } 
        catch (NullPointerException e) {
            // This block runs when null object is accessed
            System.out.println("Error: Cannot perform operation on null object!");
        }
    }
}
