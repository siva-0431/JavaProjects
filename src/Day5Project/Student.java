package Day5Project;

import java.util.Scanner;

public class Student {
    String studentName;
    int rollNumber;
    int javaMark;
    int sqlMark;
    int htmlMark;

    Scanner sc = new Scanner(System.in);

    public void input() {

        System.out.print("Enter Student Name : ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        rollNumber = sc.nextInt();

        System.out.print("Enter Java Mark : ");
        javaMark = sc.nextInt();

        System.out.print("Enter SQL Mark : ");
        sqlMark = sc.nextInt();

        System.out.print("Enter HTML Mark : ");
        htmlMark = sc.nextInt();
    }

    public int calculateTotal() {
        return javaMark + sqlMark + htmlMark;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String calculateResult() {

        if (javaMark >= 35 && sqlMark >= 35 && htmlMark >= 35) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public void displayResult() {

        System.out.println("\n========== STUDENT RESULT ==========");

        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Java Mark    : " + javaMark);
        System.out.println("SQL Mark     : " + sqlMark);
        System.out.println("HTML Mark    : " + htmlMark);

        System.out.println("------------------------------------");

        System.out.println("Total Marks  : " + calculateTotal());
        System.out.printf("Average      : %.2f%n", calculateAverage());
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("Result       : " + calculateResult());

        System.out.println("====================================");
    }
}
