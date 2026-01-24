// Minimum Currency Notes: (Command Line Argument)

public class CurrencyDenomination {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide amount as command line argument.");
            return;
        }

        int amount = Integer.parseInt(args[0]);
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Amount: Rs. " + amount);

        for (int note : notes) {
            int count = amount / note;
            amount = amount % note;

            if (count > 0) {
                System.out.println(note + " * " + count);
            }
        }
    }
}

