package com.solvd.service;

import com.solvd.money.Rent;

import java.util.Objects;

public class RentService {

    public String nameOfCompany;
    public String where;

    public RentService(String nameOfCompany, String where) {
        this.nameOfCompany = nameOfCompany;
        this.where = where;
    }

    public void rentDig(Rent rent){

        System.out.println(nameOfCompany + " rent digger to " + where);
        rent.rentDigger();

    }

    public void rentShov(Rent rent){

        System.out.println(nameOfCompany + " rent shovel to " + where);
        rent.rentShovel();

    }

    @Override
    public String toString() {
        return "RentService{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", where='" + where + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentService that = (RentService) o;
        return Objects.equals(nameOfCompany, that.nameOfCompany) && Objects.equals(where, that.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, where);
    }
}
