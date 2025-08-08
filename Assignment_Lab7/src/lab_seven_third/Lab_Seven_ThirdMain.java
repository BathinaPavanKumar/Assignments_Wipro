package lab_seven_third;

import java.util.*;
import lab_seven_third.Lab_Seven_ThirdUtil.Lab_Seven_Three_Util;

public class Lab_Seven_ThirdMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Lab_Seven_Three_Util> employeeMap = new HashMap<>();
        Lab_Seven_ThirdUtil util = new Lab_Seven_ThirdUtil(); // outer class instance

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees by Insurance Scheme");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Display Sorted Employees by Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Insurance Scheme: ");
                    String insurance = sc.nextLine();

                    Lab_Seven_Three_Util emp = util.new Lab_Seven_Three_Util(id, name, salary, designation, insurance);
                    employeeMap.put(id, emp);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.print("Enter Insurance Scheme to filter: ");
                    sc.nextLine();
                    String scheme = sc.nextLine();
                    boolean found = false;
                    for (Lab_Seven_Three_Util e : employeeMap.values()) {
                        if (e.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No employee found with scheme: " + scheme);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();
                    if (employeeMap.remove(delId) != null) {
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 4:
                    List<Lab_Seven_Three_Util> sortedList = new ArrayList<>(employeeMap.values());
                    Collections.sort(sortedList); // uses compareTo
                    System.out.println("\n--- Employees Sorted by Salary ---");
                    for (Lab_Seven_Three_Util e : sortedList) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
