package com.solvd.service;

import com.solvd.resource.CompanyResources;

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


}
