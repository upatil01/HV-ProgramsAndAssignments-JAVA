import java.io.*;
import java.util.*;

public class empcomments {

    public static void main(String[] args) {
        String fileName = "employees.csv";

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add new employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Find employee with highest salary");
            System.out.println("4. Find employee with lowest salary");
            System.out.println("5. Find youngest employee");
            System.out.println("6. Find oldest employee");
            // System.out.println("7. Find employees within age range");
            System.out.println("8. Calculate total salary of all employees");
            System.out.println("9. Calculate average age of employees");
            System.out.println("10. Calculate average salary of employees");
            System.out.println("11. Find employees above salary threshold");
            System.out.println("12. Update employee age");
            System.out.println("13. Update employee name");
            System.out.println("14. Remove employee by name");
            System.out.println("15. Remove employee by index");
            System.out.println("16. Sort employees by age");
            System.out.println("17. Sort employees by salary");
            System.out.println("18. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addNewEmployee(fileName, scanner);
                    break;
                case 2:
                    displayAllEmployees(fileName);
                    break;
                case 3:
                    findEmployeeWithHighestSalary(fileName);
                    break;
                case 4:
                    findEmployeeWithLowestSalary(fileName);
                    break;
                case 5:
                    findYoungestEmployee(fileName);
                    break;
                case 6:
                    findOldestEmployee(fileName);
                    break;
                case 7:
                    findEmployeesWithinAgeRange(fileName, scanner);
                    break;
                case 8:
                    calculateTotalSalary(fileName);
                    break;
                case 9:
                    calculateAverageAge(fileName);
                    break;
                case 10:
                    calculateAverageSalary(fileName);
                    break;
                case 11:
                    findEmployeesAboveSalaryThreshold(fileName, scanner);
                    break;
                case 12:
                    updateEmployeeAge(fileName, scanner);
                    break;
                case 13:
                    updateEmployeeName(fileName, scanner);
                    break;
                case 14:
                    removeEmployeeByName(fileName, scanner);
                    break;
                case 15:
                    removeEmployeeByIndex(fileName, scanner);
                    break;
                case 16:
                    sortEmployeesByAge(fileName);
                    break;
                case 17:
                    sortEmployeesBySalary(fileName);
                    break;
                case 18:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                 
            }
            public static void addNewEmployee(){
                System.out.println("Enter the name of the Employee : ");
                String employeesName = scanner.nextLine();
                System.out.println("Enter the Age of the Employee : ");
                int age = scanner.nextInt();
                System.out.println("Enter the Salary of the Employee : ");
                int salary = scanner.nextInt();

            }
        }
    }

}
