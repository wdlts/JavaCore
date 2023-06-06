package org.example;

class WorkerFixedRate extends Worker {

    public WorkerFixedRate(String name, double salary) {
        super(name);
        this.salary = salary;
        property = "fixed";
    }
}
