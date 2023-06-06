package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new WorkerHourlyRate("Ivan", 100);
        Worker worker2 = new WorkerFixedRate("John", 10000);
        Worker worker3 = new WorkerFixedRate("Vasya", 15000);
        Worker worker4 = new WorkerHourlyRate("Petya", 150);

        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);

        for (Worker worker : workers) {
            worker.display();
        }


    }
}