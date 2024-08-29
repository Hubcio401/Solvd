package com.solvd.company;


import com.solvd.money.Expense;
import com.solvd.resource.Warehouse;

import java.util.Arrays;
import java.util.Objects;

public class BuildingCompany {

    public String officeName;
    public String officeAddress;
    private Shop shopList[] = new Shop[1];
    private Department departmentsList[] = new Department[1];

    public static int buildingmaintenance = 100;


    public BuildingCompany(String officeName, String officeAddress) {
        this.officeName = officeName;
        this.officeAddress = officeAddress;
    }

    public BuildingCompany(Department[] departmentsList) {
        this.departmentsList = departmentsList;
    }


    public void printAllClients(Department department){
        department.printClients();
    }

    public void printDepartmentNames(){
        for(int i = 0; i<departmentsList.length;i++){
            System.out.println(departmentsList[i].getDepartmentName());
        }
    }

    public void createShop(String name, int bricks, int cement, int tools){
        shopList[0].name = name;
        shopList[0].setBricks(bricks);
        shopList[0].setCement(cement);
        shopList[0].setTools(tools);
    }

    public void createShopService(String name, String surname){
        shopList[0].createShopServiece(name,surname);
    }

    public void sendBricks(int bricks){
        shopList[0].sendBricks(bricks);
    }



    public void getWarehouse(Warehouse st){

        System.out.println("We have: " + st.getBagsOfCement() + " bags of cement " + st.getWood() + " woods " + st.getGlass() + " glass in our warehouse");

    }

    public void setWarehouse(Warehouse st, int cement, int wood, int glass){
        st.setBagsOfCement(cement);
        st.setWood(wood);
        st.setGlass(glass);
    }

    public void addStore(String name, int bricks, int cement, int tools){

        shopList[0] = new Shop(name,bricks,cement,tools);

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
