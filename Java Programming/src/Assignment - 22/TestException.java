// User-defined exception for vowel

class VowelException extends Exception {
    VowelException(String msg) {
        super(msg);
    }
}

// User-defined exception for blank space
class BlankException extends Exception {
    BlankException(String msg) {
        super(msg);
    }
}

// User-defined exception for exit character
class ExitException extends Exception {
    ExitException(String msg) {
        super(msg);
    }
}

public class TestException {
    public static void main(String[] args) {

        // Check if argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a character.");
            return;
        }

        char ch = args[0].charAt(0);

        try {
            // Check vowel
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                throw new VowelException("Vowel is not allowed!");
            }
            // Check blank space
            else if (ch == ' ') {
                throw new BlankException("Blank space is not allowed!");
            }
            // Check exit character
            else if (ch == 'X' || ch == 'x') {
                throw new ExitException("Program terminated!");
            }
            else {
                System.out.println("Valid character");
            }
        } 
        catch (VowelException | BlankException e) {
            System.out.println(e.getMessage());
        } 
        catch (ExitException e) {
            System.out.println(e.getMessage());
            System.exit(0); // terminate program
        }
    }
}
