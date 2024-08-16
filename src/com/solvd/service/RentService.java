package com.solvd.service;

import com.solvd.money.Rent;

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


}
