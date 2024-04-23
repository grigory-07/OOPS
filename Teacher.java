import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of teachers: ");
    int n = scanner.nextInt();
    scanner.nextLine();  // Consume newline

    Teacher[] teachers = new Teacher[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Enter details for teacher " + (i + 1) + ":");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Subjects Taught: ");
        String subjectsTaught = scanner.nextLine();

        teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
    }

    System.out.println("\nDetails of Teachers:");
    for (Teacher teacher : teachers) {
        teacher.display();
    }
}
}
