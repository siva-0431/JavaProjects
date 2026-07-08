package Day3Project;

import java.util.Scanner;

public class EmployeeManagementSystem extends Employee {
    public static void main(String[] args) {
        Employee emp;
        emp= new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================== Employee Management System ====================");
        System.out.print("Employee ID   :");
        short id = scanner.nextShort();
        emp.setId(id);
        scanner.nextLine();

        System.out.print("Name          :");
        String name = scanner.nextLine();
        emp.setName(name);

        System.out.print("Age           :");
        byte age = scanner.nextByte();
        emp.setAge(age);
        scanner.nextLine();

        System.out.print("Gender        :");
        String gender = scanner.nextLine();
        emp.setGender(gender);

        System.out.print("Department    :");
        String department = scanner.nextLine();
        emp.setDepartment(department);

        System.out.print("Designation   :");
        String designation = scanner.nextLine();
        emp.setDesignation(designation);

        System.out.print("Salary        :");
        double salary = scanner.nextDouble();
        emp.setSalary(salary);
        scanner.nextLine();

        System.out.print("Email         :");
        String email = scanner.nextLine();
        emp.setEmail(email);

        System.out.print("Phone         :");
        long phone = scanner.nextLong();
        emp.setPhone(phone);
        scanner.nextLine();

        System.out.print("City          :");
        String city = scanner.nextLine();
        emp.setCity(city);

        scanner.close();

        System.out.println("====================================================================");
    }
}
