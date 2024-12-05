interface Student {
    int getRollNumber();
    String getName();
    String getClassName();
}

interface Department {
    int getAttendance();
}

class Exam implements Student, Department {
    private int rollNumber;
    private String name;
    private String className;
    private int attendance;

    public Exam(int rollNumber, String name, String className, int attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.className = className;
        this.attendance = attendance;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAttendance() {
        return attendance;
    }

    public boolean isEligible() {
        return attendance >= 75; // Example: Minimum attendance is 75%
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java Exam <rollNumber> <name> <className> <attendance>");
            return;
        }
        int rollNumber = Integer.parseInt(args[0]);
        String name = args[1];
        String className = args[2];
        int attendance = Integer.parseInt(args[3]);

        Exam exam = new Exam(rollNumber, name, className, attendance);

        System.out.println("Student Name: " + exam.getName());
        System.out.println("Class: " + exam.getClassName());
        System.out.println("Attendance: " + exam.getAttendance() + "%");
        if (exam.isEligible()) {
            System.out.println("The student is eligible for the exam.");
        } else {
            System.out.println("The student is not eligible for the exam.");
        }
    }
}
