package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

    public Worker(String name, double salary, int id, String string, String string2) {
        super(name, salary, id, string, string2);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working…");
    }
}