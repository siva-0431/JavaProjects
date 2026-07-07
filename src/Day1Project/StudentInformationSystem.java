package Day1Project;

import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Student Name:");
        String name=scanner.nextLine();

        System.out.print("Enter Age:");
        int age=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Gender:");
        String gender=scanner.nextLine();

        System.out.print("Enter Mobile Number:");
        String number=scanner.nextLine();

        System.out.print("Enter Email Id:");
        String email=scanner.nextLine();

        System.out.print("Enter College Name:");
        String college=scanner.nextLine();

        System.out.print("Enter CGPA:");
        double cgpa=scanner.nextDouble();

        System.out.print("Enter Graduation Year:");
        int year=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Address:");
        String address=scanner.nextLine();

        System.out.println("==================== Student Information System ====================");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile Number: " + number);
        System.out.println("Email: " + email);
        System.out.println("College: " + college);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Year: " + year);
        System.out.println("Address: " + address);
        System.out.println("====================================================================");
        scanner.close();
    }
}
