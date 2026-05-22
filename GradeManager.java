import java.util.ArrayList;

public class GradeManager {

    // Store Students
    private ArrayList<Student> students;

    // Constructor
    public GradeManager() {

        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(String name, int[] marks) {

        Student student = new Student(name);

        for (int mark : marks) {

            student.addMarks(mark);
        }

        students.add(student);

        System.out.println("Student Added Successfully!");
    }

    // View Students
    public void viewStudents() {

        if (students.size() == 0) {

            System.out.println("No Students Available!");

            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student s : students) {

            s.displayStudent();

            System.out.println("------------------------");
        }
    }

    // Display Average of All Students
    public void calculateAverage() {

        for (Student s : students) {

            System.out.println(
                s.getName() +
                " Average Marks : " +
                s.calculateAverage()
            );
        }
    }

    // Display Maximum Marks
    public void maximumMarks() {

        for (Student s : students) {

            System.out.println(
                s.getName() +
                " Maximum Marks : " +
                s.getMaximumMarks()
            );
        }
    }

    // Display Minimum Marks
    public void minimumMarks() {

        for (Student s : students) {

            System.out.println(
                s.getName() +
                " Minimum Marks : " +
                s.getMinimumMarks()
            );
        }
    }

    // Generate Reports
    public void generateReport() {

        for (Student s : students) {

            s.generateReport();
        }
    }
}
