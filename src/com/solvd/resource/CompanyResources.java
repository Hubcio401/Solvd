package com.solvd.resource;

public class CompanyResources {

    public int cars = 0;
    public int diggers = 0;

    public CompanyResources(int cars) {
        this.cars = cars;
    }

    public CompanyResources(int cars, int diggers) {
        this.cars = cars;
        this.diggers = diggers;
    }
}
