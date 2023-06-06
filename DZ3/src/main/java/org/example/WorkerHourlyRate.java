package org.example;

class WorkerHourlyRate extends Worker {

    public WorkerHourlyRate(String name, double salary) {
        super(name);
        this.salary = (20.8*8)*salary;
        property = "hourly";
    }
}
