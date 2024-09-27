package com.solvd.employees;

import java.util.Objects;

public class Cleaner extends Employee{


    public Cleaner(String name, String surname, int paycheck) {
        super(name,surname,paycheck);
    }


    public Cleaner() {
    }

    @Override
    public void paySalary() {
        System.out.println("We paid: " + super.getPaycheck() + " for: " + getName() + " " + getSurname());
    }

    @Override
    public void work() {
        System.out.println("I'm working as a cleaner");
    }

    public void cleanBuilding(){
        System.out.println("Cleaning building ");
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cleaner cleaner = (Cleaner) o;
//        return paycheck == cleaner.paycheck && Objects.equals(name, cleaner.name) && Objects.equals(surname, cleaner.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, paycheck);
//    }
//
    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", paycheck=" + super.getPaycheck() +
                '}';
    }
}
