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

    @Override
    public String toString() {
        return "CompanyResources{" +
                "cars=" + cars +
                ", diggers=" + diggers +
                '}';
    }

    @Override
    public int hashCode(){
        return cars * 21 + diggers * 3;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj instanceof CompanyResources){
            CompanyResources otherCompanyResources = (CompanyResources) obj;
            return cars == otherCompanyResources.cars && diggers == otherCompanyResources.diggers;
        }
        return false;
    }

}
