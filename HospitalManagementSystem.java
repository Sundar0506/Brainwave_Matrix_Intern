import java.util.*;

// Main class for the Hospital Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hospital Management System!");
        Hospital hospital = new Hospital();
        hospital.run();
    }
}

class Hospital {
    private PatientModule patientModule;
    private AppointmentModule appointmentModule;
    private EHRModule ehrModule;
    private BillingModule billingModule;
    private InventoryModule inventoryModule;
    private StaffModule staffModule;

    public Hospital() {
        patientModule = new PatientModule();
        appointmentModule = new AppointmentModule();
        ehrModule = new EHRModule();
        billingModule = new BillingModule();
        inventoryModule = new InventoryModule();
        staffModule = new StaffModule();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Patient Registration");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            System.out.println("6. Staff Management");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    patientModule.managePatients();
                    break;
                case 2:
                    appointmentModule.manageAppointments();
                    break;
                case 3:
                    ehrModule.manageEHRs();
                    break;
                case 4:
                    billingModule.manageBilling();
                    break;
                case 5:
                    inventoryModule.manageInventory();
                    break;
                case 6:
                    staffModule.manageStaff();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

// Module for Patient Registration
class PatientModule {
    public void managePatients() {
        System.out.println("Managing Patients...");
        // Add logic for patient registration and viewing patient records
    }
}

// Module for Appointment Scheduling
class AppointmentModule {
    public void manageAppointments() {
        System.out.println("Managing Appointments...");
        // Add logic for scheduling, rescheduling, and canceling appointments
    }
}

// Module for Electronic Health Records (EHR)
class EHRModule {
    public void manageEHRs() {
        System.out.println("Managing Electronic Health Records...");
        // Add logic for accessing and updating patient health records
    }
}

// Module for Billing and Invoicing
class BillingModule {
    public void manageBilling() {
        System.out.println("Managing Billing and Invoicing...");
        // Add logic for generating invoices and processing payments
    }
}

// Module for Inventory Management
class InventoryModule {
    public void manageInventory() {
        System.out.println("Managing Inventory...");
        // Add logic for tracking medical supplies and managing stock levels
    }
}

// Module for Staff Management
class StaffModule {
    public void manageStaff() {
        System.out.println("Managing Staff...");
        // Add logic for managing staff details and scheduling shifts
    }
}
