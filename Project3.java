package day8;
import java.util.Scanner;

class Student {
    int studentNo;
    String name;
    int age;
    double grade;

    public Student(int studentNo, String name, int age, double grade) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + studentNo +
               ", Name: " + name +
               ", Age: " + age +
               ", Grade: " + grade;
    }
}

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;

        while (true) {
            System.out.println("\n1. Add new student");
            System.out.println("2. View student");
            System.out.println("3. Search student by ID");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = readInt(scanner);

            switch (choice) {
                case 1:
                    if (student != null) {
                        System.out.println("A student already exists.");
                    } else {
                        System.out.print("Enter ID number: ");
                        int id = readInt(scanner);
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = readInt(scanner);
                        System.out.print("Enter student grade: ");
                        double grade = readDouble(scanner);
                        student = new Student(id, name, age, grade);
                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    if (student == null) {
                        System.out.println("No student available.");
                    } else {
                        System.out.println("Student details:");
                        System.out.println(student);
                    }
                    break;

                case 3:
                    if (student == null) {
                        System.out.println("No student available.");
                    } else {
                        System.out.print("Enter ID to search: ");
                        int searchId = readInt(scanner);
                        if (student.studentNo == searchId) {
                            System.out.println("Student found: " + student);
                        } else {
                            System.out.println("Student not found.");
                        }
                    }
                    break;

                case 4:
                    if (student == null) {
                        System.out.println("No student available to delete.");
                    } else {
                        System.out.print("Enter ID to delete: ");
                        int deleteId = readInt(scanner);
                        if (student.studentNo == deleteId) {
                            student = null;
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1–5.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Please try again: ");
            }
        }
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid decimal. Please try again: ");
            }
        }
    }
}
