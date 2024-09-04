package com.solvd.employees;

import com.solvd.interfaces.FireAnEmployee;
import com.solvd.interfaces.IncomeTax;
import com.solvd.interfaces.Payable;

import java.time.LocalDate;

public class Worker implements IncomeTax, Payable, FireAnEmployee {

    public int id_worker;
    private String name;
    private String surname;
    private int paycheck;
    private LocalDate beginningOfContract;


    public Worker() {
    }

    public Worker(String name, String surname, int paycheck) {
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
        this.beginningOfContract = LocalDate.now();
    }

    public Worker(int id_worker, String name, String surname, int paycheck) {
        this.id_worker = id_worker;
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
        beginningOfContract = LocalDate.now();
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public double calculateWithTax() {
        double paycheckWithTax;
        paycheckWithTax = paycheck - (paycheck * incomeTax);
        return paycheckWithTax;
    }

    @Override
    public void paySalary() {
        System.out.println("We paid " + calculateWithTax());
    }

    @Override
    public void fireEmployee() {
        System.out.println("We fired " + getName() + " " +  getSurname());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id_worker=" + id_worker +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", paycheck=" + paycheck +
                ", beginningOfContract=" + beginningOfContract +
                '}';
    }

    @Override
    public int hashCode(){
        return 3 * name.hashCode() + 7 * surname.hashCode() * paycheck;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(obj instanceof Worker){
            Worker otherWorker = (Worker) obj;
            return id_worker == otherWorker.id_worker &&
                    name.equals(otherWorker.name) &&
                    surname.equals(otherWorker.surname) &&
                    paycheck == otherWorker.paycheck &&
                    beginningOfContract.equals(otherWorker.beginningOfContract);

        }
        return false;
    }


}
