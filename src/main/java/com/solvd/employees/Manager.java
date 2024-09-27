package com.solvd.employees;


import com.solvd.interfaces.FireAnEmployee;
import com.solvd.interfaces.Report;

import java.util.Objects;

public class Manager extends Employee implements FireAnEmployee, Report {

    private int bonus;

    public Manager() {


    }

    public Manager(String name, String surname, int paycheck) {
        super(name,surname,paycheck);
    }

    public Manager(String name, String surname, int paycheck, int bonus) {
        super(name,surname,paycheck);
        this.bonus = bonus;
    }


    public void paySalary() {
        System.out.println("We paid: " + summaryPaycheck(super.getPaycheck(),bonus) + " for: " + getName() + " " + getSurname());

    }

    @Override
    public void work() {
        System.out.println("I'm working as a manager");
    }


    public void fireEmployee() {
        System.out.println("We fired " + getName() + " " +  getSurname());
    }


    public void reportProblem(int problemNumber) {
        switch (problemNumber){
            case 1:
                System.out.println("Manager " + getName() + " " + getSurname() + rep1);
                break;
            case 2:
                System.out.println("Manager " + getName() + " " + getSurname() + rep2);
                break;
            case 3:
                System.out.println("Manager " + getName() + " " + getSurname() + rep3);
                break;
        }
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getPaycheck() {
//        return paycheck;
//    }
//
//    public void setPaycheck(int paycheck) {
//        this.paycheck = paycheck;
//    }

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
                "Name='" + super.getName() + '\'' +
                ", Surname='" + super.getSurname() + '\'' +
                ", paycheck=" + super.getPaycheck() +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return bonus == manager.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bonus);
    }
}
