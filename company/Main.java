package company;

import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1", 3000.0, 1);
        Worker worker2 = new Worker("Worker2", 3200.0, 2);
        Worker worker3 = new Worker("Worker3", 3100.0, 3);
        Worker worker4 = new Worker("Worker4", 3300.0, 4);
        Manager manager = new Manager("Manager1", 5000.0, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " earns " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + " earns " + manager.getSalary());
        manager.work();
    }
}
