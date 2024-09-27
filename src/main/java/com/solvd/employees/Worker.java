package com.solvd.employees;

import com.solvd.interfaces.FireAnEmployee;
import com.solvd.interfaces.Report;

import java.time.LocalDate;
import java.util.Objects;

public class Worker extends Employee implements  FireAnEmployee, Report {

    public int id_worker;
    private LocalDate beginningOfContract;


    public Worker() {
    }

    public Worker(String name, String surname, int paycheck) {
        super(name,surname,paycheck);
        this.beginningOfContract = LocalDate.now();
    }

    public Worker(int id_worker, String name, String surname, int paycheck) {
        super(name,surname,paycheck);
        this.id_worker = id_worker;
        beginningOfContract = LocalDate.now();
    }

//    public Worker(String name, String surname) {
//        super(name,surname);
//    }

    @Override
    public void work() {
        System.out.println("I'm working as a worker");
    }


    public void paySalary() {
        System.out.println("We paid: " + super.getPaycheck() + " for: " + getName() + " " + getSurname());
    }


    public void fireEmployee() {
        System.out.println("We fired " + getName() + " " +  getSurname());
    }



    public void reportProblem(int problemNumber) {
        switch (problemNumber){
            case 1:
                System.out.println("Worker " + getName() + " " + getSurname() + rep1);
                break;
            case 2:
                System.out.println("Worker " + getName() + " " + getSurname() + rep2);
                break;
            case 3:
                System.out.println("Worker " + getName() + " " + getSurname() + rep3);
                break;
        }
    }


    @Override
    public String toString() {
        return "Workers{" +
                ", Name='" + super.getName() + '\'' +
                ", Surname='" + super.getSurname() + '\'' +
                ", paycheck=" + super.getPaycheck() +
                ", beginningOfContract=" + beginningOfContract +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id_worker == worker.id_worker && Objects.equals(beginningOfContract, worker.beginningOfContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_worker, beginningOfContract);
    }
}
