package com.solvd.company;


import com.solvd.Exceptions.CompanyNameException;
import com.solvd.Exceptions.FullWarehouseException;
import com.solvd.Main;
import com.solvd.resource.Warehouse;
import com.solvd.shops.Shop;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;


public class BuildingCompany {

    public String officeName;
    public String officeAddress;
    private Shop shop = new Shop();
    private HashMap<Integer,Department> departments = new HashMap<>();
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

    public void createDepartment(Department department) {
        this.departments.put(0,department);
    }



    public void createWarehouse(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public void printAllClients(int departmentID){
        departments.get(departmentID).printClients();
    }


    public void printDepartmentNames(){
        for(int i = 0; i<departments.size();i++){
            System.out.println(departments.get(i).getDepartmentName());
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
            throw new FullWarehouseException("Too much bags of cement in warehouse");
        }
        else{
            warehouse.setBagsOfCement(cement);
        }
        if (wood > 30){
            throw new FullWarehouseException("Too much bags of wood in warehouse");
        }
        else{
            warehouse.setWood(wood);
        }
        if (glass > 30){
            throw new FullWarehouseException("Too much bags of glass in warehouse");
        }
        else{
            warehouse.setGlass(glass);
        }
    }

    //    File rules = new File("C:\\Users\\Hubi\\Desktop\\test automation course\\building_company\\src\\main\\resources\\companyName.txt");

    ClassLoader classLoader = Main.class.getClassLoader();
    URL resource = classLoader.getResource("rules.txt");

    public void changeComapnyName()throws IOException {
        try {
            File companyTXT = new File(resource.getFile());
            Scanner scan = new Scanner(System.in);
            System.out.println("What is new company name? ");
            String compName = scan.nextLine();
            StringUtils.trim(compName);
            StringUtils.isBlank(compName);

            if (Character.isUpperCase(compName.charAt(0))==false){
                throw new CompanyNameException("Company name should start from big letter!");
            }
            else{
                officeName = compName;
                FileUtils.writeStringToFile(companyTXT,"Our new company name: ");
                FileUtils.writeStringToFile(companyTXT,compName);
            }
        }
        catch (CompanyNameException ex){
            System.out.println(ex.getMessage());
        }

    }

    URL resourcerules = classLoader.getResource("rules.txt");
    File rules = new File(resourcerules.getFile());

//    File rules = new File("C:\\Users\\Hubi\\Desktop\\test automation course\\building_company\\src\\main\\resources\\rules.txt");

    public void createRules() throws IOException{

        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Give rule in our company: ");
            String rule = scan.nextLine();
            StringUtils.defaultString(rule);
            StringUtils.upperCase(rule);
            FileUtils.writeStringToFile(rules,rule + System.lineSeparator(), "UTF-8", true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void printRules(){

        try {
            String rulesInfo = FileUtils.readFileToString(rules, "UTF-8");
            System.out.println(rulesInfo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany company = (BuildingCompany) o;
        return Objects.equals(officeName, company.officeName) && Objects.equals(officeAddress, company.officeAddress) && Objects.equals(shop, company.shop) && Objects.equals(warehouse, company.warehouse);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(officeName, officeAddress, warehouse);
        result = 31 * result + Objects.hash(shop);
        return result;
    }

    @Override
    public String toString() {
        return "BuildingCompany{" +
                "officeName='" + officeName + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", shopList=" + shop +
                ", warehouse=" + warehouse +
                '}';
    }
}
