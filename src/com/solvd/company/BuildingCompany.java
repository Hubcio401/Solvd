package com.solvd.company;


import com.solvd.Exceptions.CompanyName;
import com.solvd.Exceptions.FullWarehouse;
import com.solvd.resource.Warehouse;
import com.solvd.shops.Shop;

import java.util.*;


public class BuildingCompany {

    public String officeName;
    public String officeAddress;
    private Shop shop = new Shop();
    private Department departmentsList[] = new Department[1];
    private Warehouse warehouse = new Warehouse();

    static{
        System.out.println("Additional info: ");
        System.out.println("We start working at 8 AM ");
        System.out.println("--------------------------------------------------");
    }

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


    public void checkWarehouseInventory(){
        warehouse.checkInventory();
    }

    public void checkShopInventory(){
        shop.checkInventory();
    }

    public void createShop(Shop shop){
        this.shop = shop;
    }

    public void getWarehouse(){

        System.out.println("We have: " + warehouse.getBagsOfCement() + " bags of cement " + warehouse.getWood() + " woods " + warehouse.getGlass() + " glass in our warehouse");

    }

    public void setWarehouse( int cement, int wood, int glass){
        if (cement > 30){
            throw new FullWarehouse("Too much bags of cement in warehouse");
        }
        else{
            warehouse.setBagsOfCement(cement);
        }
        if (wood > 30){
            throw new FullWarehouse("Too much bags of wood in warehouse");
        }
        else{
            warehouse.setWood(wood);
        }
        if (glass > 30){
            throw new FullWarehouse("Too much bags of glass in warehouse");
        }
        else{
            warehouse.setGlass(glass);
        }
    }

    public void changeComapnyName(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("What is new company name? ");
            String compName = scan.nextLine();

            if (Character.isUpperCase(compName.charAt(0))==false){
                throw new CompanyName("Company name should start from big letter!");
            }
            else{
                officeName = compName;
            }
        }
        catch (CompanyName ex){
            System.out.println(ex.getMessage());
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany company = (BuildingCompany) o;
        return Objects.equals(officeName, company.officeName) && Objects.equals(officeAddress, company.officeAddress) && Objects.equals(shop, company.shop) && Arrays.equals(departmentsList, company.departmentsList) && Objects.equals(warehouse, company.warehouse);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(officeName, officeAddress, warehouse);
        result = 31 * result + Objects.hash(shop);
        result = 31 * result + Arrays.hashCode(departmentsList);
        return result;
    }

    @Override
    public String toString() {
        return "BuildingCompany{" +
                "officeName='" + officeName + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", shopList=" + shop +
                ", departmentsList=" + Arrays.toString(departmentsList) +
                ", warehouse=" + warehouse +
                '}';
    }
}
