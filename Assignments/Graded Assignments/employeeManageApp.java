import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class employeeManageApp {

    public static final String FILE_NAME = "output.csv";
    public static final String HEADER_ROW = "Employee ID,Employee Name,Department,Salary";

    public static void main(String[] args) throws IOException {
        // Generate employee data
        List<Employee> employees = generateEmployeeData();

        // Write data to CSV file
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            writeHeaderRow(fileWriter);
            writeEmployeeData(fileWriter, employees);
        }

        // Read data from CSV file and verify
        List<Employee> verifiedEmployees = readEmployeeData(FILE_NAME);
        System.out.println("Verified employees: " + verifiedEmployees);
    }

    public static List<Employee> generateEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Employee employee = new Employee(i, "Employee " + i, "Department " + i, i * 1000);
            employees.add(employee);
        }
        return employees;
    }

    public static void writeHeaderRow(FileWriter fileWriter) throws IOException {
        fileWriter.write(HEADER_ROW);
        fileWriter.write("\n");
    }

    public static void writeEmployeeData(FileWriter fileWriter, List<Employee> employees) throws IOException {
        for (Employee employee : employees) {
            fileWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getDepartment() + "," + employee.getSalary());
            fileWriter.write("\n");
        }
    }

    public static List<Employee> readEmployeeData(String fileName) throws IOException {
        List<Employee> employees = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employeeData = line.split(",");
                Employee employee = new Employee(Integer.parseInt(employeeData[0]), employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]));
                employees.add(employee);
            }
        }
        return employees;
    }
}

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


