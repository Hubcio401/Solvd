package com.solvd.company;


import com.solvd.resource.Warehouse;
import com.solvd.service.ShopService;

import java.util.Arrays;
import java.util.Objects;

public class BuildingCompany {


    public String officeName;
    public String officeAddress;
    public Shop shopList[] = new Shop[1];

    public BuildingCompany(String officeName, String officeAddress) {
        this.officeName = officeName;
        this.officeAddress = officeAddress;
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

    public void sendBricks(ShopService stserv, int br){
        stserv.sendBr(shopList[0],br);
        System.out.println("to " + stserv.getClientName() + " " + stserv.getClientSurname());
    }

    public void sendTools(ShopService stserv, int to){
        stserv.sendTl(shopList[0],to);
        System.out.println("to " + stserv.getClientName() + " " + stserv.getClientSurname());
    }

    public void sendCement(ShopService stserv, int ce){
        stserv.sendCe(shopList[0],ce);
        System.out.print("to " + stserv.getClientName() + " " + stserv.getClientSurname());
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
