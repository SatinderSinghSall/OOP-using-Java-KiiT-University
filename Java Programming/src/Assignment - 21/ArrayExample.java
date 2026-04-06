// Program to demonstrate ArrayIndexOutOfBoundsException

public class ArrayExample {
    public static void main(String[] args) {

        // Creating an array of size 5
        int arr[] = {10, 20, 30, 40, 50};

        try {
            // Accessing an invalid index (greater than array size)
            System.out.println("Accessing element: " + arr[7]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // This block runs when invalid index is accessed
            System.out.println("Error: Index is out of bounds!");
        }
    }
}
