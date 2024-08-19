package com.solvd.company;


import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof BuildingCompany){
            BuildingCompany otherObj = (BuildingCompany) obj;
            return officeName.equals(otherObj.officeName) &&
                    officeAddress.equals(otherObj.officeAddress);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * officeName.hashCode() + 31 * officeAddress.hashCode();
    }
}
