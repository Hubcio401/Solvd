package com.solvd.employees;

import java.util.Objects;

public class Cleaner extends Employee{

    private String name;
    private String surname;
    private int paycheck;

    public Cleaner(String name, String surname, int paycheck) {
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
    }

    public Cleaner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Cleaner() {
    }

    @Override
    public void paySalary() {
        System.out.println("We paid: " + paycheck + " for: " + getName() + " " + getSurname());
    }

    @Override
    public void work() {
        System.out.println("I'm working as a cleaner");
    }

    public void cleanBuilding(){
        System.out.println("Cleaning building ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cleaner cleaner = (Cleaner) o;
        return paycheck == cleaner.paycheck && Objects.equals(name, cleaner.name) && Objects.equals(surname, cleaner.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, paycheck);
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", paycheck=" + paycheck +
                '}';
    }
}
