class Student2 {
    int rollNo;
    String name, course;
    double fees;

    // Default constructor
    Student() {
        rollNo = 0;
        name = "NA";
        course = "NA";
        fees = 0;
    }

    // Parameterized constructor
    Student(int r, String n, String c, double f) {
        rollNo = r;
        name = n;
        course = c;
        fees = f;
    }

    // Copy constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
        course = s.course;
        fees = s.fees;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Aman", "MCA", 50000);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
    }
}
