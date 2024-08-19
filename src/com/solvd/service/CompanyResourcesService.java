package com.solvd.service;

import com.solvd.resource.CompanyResources;

import java.util.Objects;

public class CompanyResourcesService {

    public String baseName;
    public String address;

    public CompanyResourcesService(String baseName, String address) {
        this.baseName = baseName;
        this.address = address;
    }

    public void getResources(CompanyResources res){

        System.out.println("Base name: " + baseName + " - address: " + address + " we have: " + res.cars + " cars and " + res.diggers + " diggers");

    }

    @Override
    public String toString() {
        return "CompanyResourcesService{" +
                "baseName='" + baseName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyResourcesService that = (CompanyResourcesService) o;
        return Objects.equals(baseName, that.baseName) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseName, address);
    }
}
