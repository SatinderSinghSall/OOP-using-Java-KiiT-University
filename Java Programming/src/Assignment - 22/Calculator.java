// Exception for few arguments

class FewArgumentsException extends Exception {
    FewArgumentsException(String msg) {
        super(msg);
    }
}

// Exception for invalid operator
class InvalidOperatorException extends Exception {
    InvalidOperatorException(String msg) {
        super(msg);
    }
}

// Exception for negative result
class NegativeResultException extends Exception {
    NegativeResultException(String msg) {
        super(msg);
    }
}

public class Calculator {
    public static void main(String[] args) {

        try {
            // Check number of arguments
            if (args.length < 3) {
                throw new FewArgumentsException("Less than 3 arguments!");
            }

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            char op = args[2].charAt(0);
            int result = 0;

            // Perform operation
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': result = a / b; break;
                default:
                    throw new InvalidOperatorException("Invalid operator!");
            }

            // Check negative result
            if (result < 0) {
                throw new NegativeResultException("Result is negative!");
            }

            System.out.println("Result = " + result);

        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
