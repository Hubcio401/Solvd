package com.solvd.employees;

import com.solvd.interfaces.Payable;

public abstract class Employee implements Payable {

    protected String name;
    protected String surname;
    protected int paycheck;

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
}
