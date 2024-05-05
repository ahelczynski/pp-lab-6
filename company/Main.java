package company;


import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Ostoja", 4500.0, 1);
        Worker worker2 = new Worker("Adam Hełczyński", 4000.0, 2);
        Worker worker3 = new Worker("Adam Ostoja-Hełczyński", 3200.0, 3);
        Worker worker4 = new Worker("Ostoja-Hełczyński", 3800.0, 4);

        Manager manager = new Manager("Jan Kowalski", 8500.0, 5);

        System.out.println("Worker " + worker1.getName() + " salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker " + worker2.getName() + " salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker " + worker3.getName() + " salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker " + worker4.getName() + " salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager " + manager.getName() + " salary: " + manager.getSalary());
        manager.work();
    }
}
