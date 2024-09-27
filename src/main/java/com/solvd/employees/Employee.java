package com.solvd.employees;

import com.solvd.interfaces.Payable;

import java.util.Objects;

public abstract class Employee implements Payable {

    private String name;
    private String surname;
    private int paycheck;

    public Employee(String name,String surname,int paycheck){
        this.name = name;
        this.surname = surname;
        this.paycheck = paycheck;
    }

    public Employee() {
    }

    public abstract void work();

    @Override
    public void paySalary() {
        System.out.println("We paid: " + paycheck + " for: " + name + " " + surname);
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
        Employee employee = (Employee) o;
        return paycheck == employee.paycheck && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, paycheck);
    }
}
