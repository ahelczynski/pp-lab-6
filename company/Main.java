package company;

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1", 3000.0, 1, "2020-01-01", "Developer");
        Worker worker2 = new Worker("Worker2", 3200.0, 2, "2020-02-01", "Developer");
        Worker worker3 = new Worker("Worker3", 3300.0, 2, "2020-03-01", "Tester");  
        Worker worker4 = new Worker("Worker4", 3400.0, 4, "2020-04-01", "Tester");
        Worker worker5 = new Worker("Worker5", 3500.0, 4, "2020-04-01", "Tester"); 
        Manager manager1 = new Manager("Manager1", 5000.0, 5, "2019-05-01", "Project Manager");
        Manager manager2 = new Manager("Manager2", 5100.0, 5, "2019-06-01", "Project Manager"); 

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        Map<Integer, Integer> idCount = new HashMap<>();

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();

            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }

            idCount.put(emp.hashCode(), idCount.getOrDefault(emp.hashCode(), 0) + 1);
        }

        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich Manager: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich Worker: " + totalWorkerSalary);

        System.out.println("Pracownicy z zduplikowanymi ID:");
        for (Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("ID " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }
}