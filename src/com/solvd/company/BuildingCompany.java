package com.solvd.company;


import java.time.LocalDate;

public class BuildingCompany {

    public static LocalDate companyStart = LocalDate.of(2024, 8, 10);
    public static String owner = "Hubert Ziobro";
    public String officeName;
    public String officeAddress;

    public static String getOwner(){
        return "Owner: " + owner;
    }

    public static LocalDate getCompanyStart(){
        System.out.print("Company start: ");
        return companyStart;
    }


    public BuildingCompany(String officeName, String officeAddress) {
        this.officeName = officeName;
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return
                "Office Name = '" + officeName + '\'' +
                ", Office Address='" + officeAddress + '\'' +
                '}';
    }
}
