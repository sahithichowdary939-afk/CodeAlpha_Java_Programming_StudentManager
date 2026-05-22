import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeManager gm = new GradeManager();

        int choice;

        do {

            System.out.println("\n====== Student Grade Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Maximum Marks");
            System.out.println("5. Minimum Marks");
            System.out.println("6. Generate Report");
            System.out.println("7. Exit");
            System.out.println("=============================================");

            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name : ");

                    String name = sc.nextLine();

                    System.out.print("Enter Number of Subjects : ");

                    int n = sc.nextInt();

                    int[] marks = new int[n];

                    for (int i = 0; i < n; i++) {

                        System.out.print("Enter Mark " + (i + 1) + " : ");

                        marks[i] = sc.nextInt();
                    }

                    gm.addStudent(name, marks);

                    break;

                case 2:

                    gm.viewStudents();

                    break;

                case 3:

                    gm.calculateAverage();

                    break;

                case 4:

                    gm.maximumMarks();

                    break;

                case 5:

                    gm.minimumMarks();

                    break;

                case 6:

                    gm.generateReport();

                    break;

                case 7:

                    System.out.println("Program Exited Successfully!");

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
