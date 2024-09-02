package com.solvd.company;


import com.solvd.resource.Warehouse;

import java.util.Arrays;
import java.util.Objects;

public class BuildingCompany {

    public String officeName;
    public String officeAddress;
    private Shop shopList[] = new Shop[1];
    private Department departmentsList[] = new Department[1];
    private Warehouse warehouse = new Warehouse();

    public BuildingCompany(String officeName, String officeAddress) {
        this.officeName = officeName;
        this.officeAddress = officeAddress;
    }


    public void createDepartment(Department departmentsList) {
        this.departmentsList[0] = departmentsList;
    }


    public void createWarehouse(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public void printAllClients(){
        departmentsList[0].printClients();
    }

    public void printDepartmentNames(){
        for(int i = 0; i<departmentsList.length;i++){
            System.out.println(departmentsList[i].getDepartmentName());
        }
    }


    public void createShop(Shop shop){
        this.shopList[0] = shop;
    }

    public void getWarehouse(){

        System.out.println("We have: " + warehouse.getBagsOfCement() + " bags of cement " + warehouse.getWood() + " woods " + warehouse.getGlass() + " glass in our warehouse");

    }

    public void setWarehouse( int cement, int wood, int glass){
        warehouse.setBagsOfCement(cement);
        warehouse.setWood(wood);
        warehouse.setGlass(glass);
    }


    public void printStore(){
        for(int i = 0; i< shopList.length; i++){
            System.out.println(shopList[i]);
        }
    }


    @Override
    public String toString() {
        return
                "Office Name = '" + officeName + '\'' +
                ", Office Address='" + officeAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany company = (BuildingCompany) o;
        return Objects.equals(officeName, company.officeName) && Objects.equals(officeAddress, company.officeAddress) && Arrays.equals(shopList, company.shopList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(officeName, officeAddress);
        result = 31 * result + Arrays.hashCode(shopList);
        return result;
    }
}
