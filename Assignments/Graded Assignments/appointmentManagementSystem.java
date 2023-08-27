import java.util.*;

class Visitor {
    String name;
    int age;
    String phoneNumber;
    private String appointmentDate;
    private String appointmentTime;

    public Visitor(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = "";
        this.appointmentTime = "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointment(String date, String time) {
        appointmentDate = date;
        appointmentTime = time;
    }

    public void cancelAppointment() {
        appointmentDate = "";
        appointmentTime = "";
    }
}

class Clinic {
    private List<Visitor> visitors;
    private Map<String, List<String>> appointmentSchedule;

    public Clinic() {
        visitors = new ArrayList<>();
        appointmentSchedule = new HashMap<>();
    }

    public void addVisitor(String name, int age, String phoneNumber) {
        Visitor visitor = new Visitor(name, age, phoneNumber);
        visitors.add(visitor);
    }

    public Visitor findVisitorByName(String name) {
        for (Visitor visitor : visitors) {
            if (visitor.getName().equalsIgnoreCase(name)) {
                return visitor;
            }
        }
        return null;
    }

    public void editVisitorDetails(String name, int age, String phoneNumber) {
        Visitor visitor = findVisitorByName(name);
        if (visitor != null) {
            visitor.name = name;
            visitor.age = age;
            visitor.phoneNumber = phoneNumber;
        }
    }

    public void viewAppointmentSchedule(String date) {
        List<String> appointments = appointmentSchedule.getOrDefault(date, new ArrayList<>());
        System.out.println("Appointment Schedule for " + date + ":");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public void bookAppointment(String name, String date, String time) {
        Visitor visitor = findVisitorByName(name);
        if (visitor != null) {
            String appointmentDetails = "Visitor " + name + "'s appointment on " + date + " at " + time + " has been booked.";
            List<String> appointments = appointmentSchedule.getOrDefault(date, new ArrayList<>());
            appointments.add(appointmentDetails);
            appointmentSchedule.put(date, appointments);
            visitor.setAppointment(date, time);
        }
    }

    public void cancelAppointment(String name) {
        Visitor visitor = findVisitorByName(name);
        if (visitor != null) {
            String appointmentDate = visitor.getAppointmentDate();
            if (!appointmentDate.isEmpty()) {
                List<String> appointments = appointmentSchedule.get(appointmentDate);
                if (appointments != null) {
                    String appointmentDetails = "Visitor " + name + "'s appointment on " + appointmentDate + " at " + visitor.getAppointmentTime() + " has been canceled.";
                    appointments.remove(appointmentDetails);
                }
                visitor.cancelAppointment();
            }
        }
    }
}

public class appointmentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinic clinic = new Clinic();

        while (true) {
            System.out.println("\nWelcome to the Small Clinic Appointment Management System\n");
            System.out.println("1. View Visitors List");
            System.out.println("2. Add New Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");
            System.out.print("\nPlease enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    View Visitors List
                    Implement your code here
                    break;
                case 2:
                    Add New Visitor
                    Implement your code here
                    break;
                case 3:
                    Edit Visitor Details
                    Implement your code here
                    break;
                case 4:
                    View Appointment Schedule for a Day
                    Implement your code here
                    break;
                case 5:
                    Book an Appointment
                    Implement your code here
                    break;
                case 6:
                    Edit/Cancel Appointment
                    Implement your code here
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}