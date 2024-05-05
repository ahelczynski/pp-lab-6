package company;

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1", 3000.0, 1, "2020-01-01", "Developer");
        Worker worker2 = new Worker("Worker2", 3200.0, 2, "2020-02-01", "Developer");
        Worker worker3 = new Worker("Worker3", 3200.0, 2, "2020-03-01", "Tester"); // Same ID as worker2
        Manager manager = new Manager("Manager1", 5000.0, 5, "2019-05-01", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        // Display hash codes
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        // Test equals method
        System.out.println("Comparing " + worker3.getName() + " to other employees:");
        for (Employee emp : employees) {
            System.out.println(worker3.getName() + " equals " + emp.getName() + "? " + worker3.equals(emp));
        }
    }
}