package com.solvd.employees;


import com.solvd.interfaces.FireAnEmployee;
import com.solvd.interfaces.IncomeTax;
import com.solvd.interfaces.Payable;

import java.util.Objects;

public class Manager implements IncomeTax, Payable, FireAnEmployee {

    private String name;
    private String surname;
    private int paycheck;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Manager(String name, String surname, int paycheck) {
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
    }

    public Manager(String name, String surname, int paycheck, int bonus) {
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
        this.bonus = bonus;
    }

    @Override
    public void fireEmployee() {
        System.out.println("We fired " + getName() + " " +  getSurname());
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int summaryPaycheck(int paycheck, int bonus){

        return paycheck + bonus;

    }

    public double summaryPaycheck(double paycheck, double bonus){

        return paycheck + bonus;
    }



    @Override
    public String toString() {
        return "Managers{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", paycheck=" + paycheck +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return paycheck == manager.paycheck && bonus == manager.bonus && Objects.equals(name, manager.name) && Objects.equals(surname, manager.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, paycheck, bonus);
        return result;
    }
}
