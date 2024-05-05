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
        Worker worker3 = new Worker("Worker3", 3100.0, 3, "2020-03-01", "Tester");
        Worker worker4 = new Worker("Worker4", 3300.0, 4, "2020-04-01", "Tester");
        Manager manager = new Manager("Manager1", 5000.0, 5, "2019-05-01", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            emp.work();
            System.out.println("- " + emp.getName() + " (ID: " + emp.hashCode() + ", Position: " + emp.getPosition() + ", Hire date: " + emp.getHireDate() + ", Salary: " + emp.getSalary() + ")");
        }
    }
}
