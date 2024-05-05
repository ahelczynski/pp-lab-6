package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {

    public Manager(String name, double salary, int id, String string, String string2) {
        super(name, salary, id, string, string2);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing…");
    }
}