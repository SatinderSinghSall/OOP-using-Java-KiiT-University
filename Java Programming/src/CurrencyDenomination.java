// Minimum Currency Notes: (Command Line Argument)

/*
   WAP in JAVA to input an amount in Rs through command line argument
  and find the minimum number of 2000, 500, 200, 100, 50, 20, 10, 5, 2
  and 1 Rs denominations will be needed to have that amount.
  Ex: Rs. 3868 => (2000*1) + (500*3) + (200*1) + (100*1) + (50*1) + (10*1)
  + (5*1) + (2*1) + (1*1) 
*/

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
