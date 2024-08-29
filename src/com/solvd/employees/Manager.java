package com.solvd.employees;


import java.util.Objects;

public class Manager {

    private String Name;
    private String Surname;
    private int paycheck;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String surname) {
        Name = name;
        Surname = surname;
    }


    public Manager(String name, String surname, int paycheck) {
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
    }

    public Manager(String name, String surname, int paycheck, int bonus) {
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
        this.bonus = bonus;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
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
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", paycheck=" + paycheck +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return paycheck == manager.paycheck && bonus == manager.bonus && Objects.equals(Name, manager.Name) && Objects.equals(Surname, manager.Surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Name, Surname, paycheck, bonus);
        return result;
    }
}
