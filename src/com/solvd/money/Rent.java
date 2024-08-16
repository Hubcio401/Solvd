package com.solvd.money;

public class Rent {

    public int diggercost = 100;
    public int shovel = 20;


    public Rent(int diggercost, int shover) {
        this.diggercost = diggercost;
        this.shovel = shover;
    }

    public void rentDigger(){

        System.out.println("Digger cost us: " + diggercost);

    }

    public void rentShovel(){

        System.out.println("Shovel cost us: " + shovel);
    }

    public int summaryCost(int dig, int shov){
        return dig + shov;
    }

    public double summaryCost(double dig, double shov){
        return dig + shov;
    }

}
