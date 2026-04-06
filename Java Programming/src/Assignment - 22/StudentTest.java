// Exception for invalid age

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

// Exception for invalid name
class InvalidNameException extends Exception {
    InvalidNameException(String msg) {
        super(msg);
    }
}

class Student {
    int roll;
    String name;
    int age;
    String course;

    // Parameterized constructor
    Student(int roll, String name, int age, String course) 
            throws InvalidAgeException, InvalidNameException {

        // Check age
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Age must be between 15 and 21");
        }

        // Check name (no digits or special chars)
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidNameException("Name contains invalid characters");
        }

        // Assign values
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(roll + " " + name + " " + age + " " + course);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student(1, "John", 18, "CS");
            s.display();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
