package com.solvd.employees;

import java.time.LocalDate;

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
}
