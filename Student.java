import java.util.ArrayList;

public class Student {

    // Variables
    private String name;
    private ArrayList<Integer> marks;

    // Constructor
    public Student(String name) {

        this.name = name;
        marks = new ArrayList<>();
    }

    // Add Marks
    public void addMarks(int mark) {

        marks.add(mark);
    }

    // Get Student Name
    public String getName() {

        return name;
    }

    // Display Student Details
    public void displayStudent() {

        System.out.println("Student Name : " + name);
        System.out.println("Marks : " + marks);
    }

    // Calculate Average Marks
    public double calculateAverage() {

        if (marks.size() == 0) {

            return 0;
        }

        int sum = 0;

        for (int mark : marks) {

            sum += mark;
        }

        return (double) sum / marks.size();
    }

    // Find Maximum Marks
    public int getMaximumMarks() {

        if (marks.size() == 0) {

            return 0;
        }

        int max = marks.get(0);

        for (int mark : marks) {

            if (mark > max) {

                max = mark;
            }
        }

        return max;
    }

    // Find Minimum Marks
    public int getMinimumMarks() {

        if (marks.size() == 0) {

            return 0;
        }

        int min = marks.get(0);

        for (int mark : marks) {

            if (mark < min) {

                min = mark;
            }
        }

        return min;
    }

    // Generate Complete Report
    public void generateReport() {

        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Student Name     : " + name);
        System.out.println("Marks            : " + marks);
        System.out.println("Average Marks    : " + calculateAverage());
        System.out.println("Maximum Marks    : " + getMaximumMarks());
        System.out.println("Minimum Marks    : " + getMinimumMarks());
        System.out.println("====================================");
    }
}
