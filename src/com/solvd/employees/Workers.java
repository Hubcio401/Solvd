package com.solvd.employees;

import java.time.LocalDate;
import java.util.Objects;

public class Workers {

    public int id_worker;
    private String Name;
    private String Surname;
    private int paycheck = 0;
    public LocalDate beginningOfContract;

    public Workers() {
    }

    public Workers(int id_worker, String name, String surname, int paycheck) {
        this.id_worker = id_worker;
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
        beginningOfContract = LocalDate.now();
    }

    public Workers(String name, String surname) {
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
        if(obj instanceof Workers){
            Workers otherWorker = (Workers) obj;
            return id_worker == otherWorker.id_worker &&
                    Name.equals(otherWorker.Name) &&
                    Surname.equals(otherWorker.Surname) &&
                    paycheck == otherWorker.paycheck &&
                    beginningOfContract.equals(otherWorker.beginningOfContract);

        }
        return false;
    }


}
