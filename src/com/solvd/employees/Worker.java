package com.solvd.employees;

import java.time.LocalDate;

public class Worker {

    public int id_worker;
    private String Name;
    private String Surname;
    private int paycheck = 0;
    private LocalDate beginningOfContract;


    public Worker() {
    }

    public Worker(String name, String surname, int paycheck) {
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
        this.beginningOfContract = LocalDate.now();
    }

    public Worker(int id_worker, String name, String surname, int paycheck) {
        this.id_worker = id_worker;
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
        beginningOfContract = LocalDate.now();
    }

    public Worker(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id_worker=" + id_worker +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", paycheck=" + paycheck +
                ", beginningOfContract=" + beginningOfContract +
                '}';
    }

    @Override
    public int hashCode(){
        return 3 * Name.hashCode() + 7 * Surname.hashCode() * paycheck;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(obj instanceof Worker){
            Worker otherWorker = (Worker) obj;
            return id_worker == otherWorker.id_worker &&
                    Name.equals(otherWorker.Name) &&
                    Surname.equals(otherWorker.Surname) &&
                    paycheck == otherWorker.paycheck &&
                    beginningOfContract.equals(otherWorker.beginningOfContract);

        }
        return false;
    }


}
