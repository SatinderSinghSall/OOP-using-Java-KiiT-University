// Exception for invalid day

class InvalidDayException extends Exception {
    InvalidDayException(String msg) {
        super(msg);
    }
}

// Exception for invalid month
class InvalidMonthException extends Exception {
    InvalidMonthException(String msg) {
        super(msg);
    }
}

class MyDate {
    int day, month, year;

    // Parameterized constructor
    MyDate(int d, int m, int y) 
            throws InvalidDayException, InvalidMonthException {

        // Validate month
        if (m < 1 || m > 12) {
            throw new InvalidMonthException("Invalid Month!");
        }

        // Validate day (simple check)
        if (d < 1 || d > 31) {
            throw new InvalidDayException("Invalid Day!");
        }

        this.day = d;
        this.month = m;
        this.year = y;
    }

    void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        try {
            // Taking values from command line
            int d = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            MyDate date = new MyDate(d, m, y);
            date.display();
            System.out.println("Valid Date");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
