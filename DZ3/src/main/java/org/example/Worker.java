package org.example;

public abstract class Worker {

    String name;
    String property;

    double salary;

    public Worker(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: "+name +"; "+"Salary based on "+ property +" rate"+"; "+ "Salary per month: "+salary);
    }
}
