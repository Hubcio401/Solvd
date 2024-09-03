package com.solvd;

import com.solvd.company.BuildingCompany;
import com.solvd.company.Department;
import com.solvd.company.Shop;
import com.solvd.date.ClientsDate;
import com.solvd.date.MyDate;
import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.money.Expense;
import com.solvd.resource.Client;
import com.solvd.resource.Warehouse;
import com.solvd.service.Production;
import com.solvd.service.ShopService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //BUBBLE SORT

//        int arra[] = {2,1,5,8,3};
//
//
//        int size = args.length;
//        int array[] = new int [size];
//        for (int k=0;k<args.length;k++){
//
//            array[k] = Integer.parseInt((args[k]));
//        }
//
//        bubble_sort(array);
//        for(int j=0;j<array.length;j++){
//            System.out.println(array[j]);
//        }
//    }
//
//    static void bubble_sort(int[] arr){
//
//        int tmp;
//
//        for(int i=0;i<arr.length;i++){
//            for(int j = i+1; j<arr.length;j++){
//                if(arr[i] > arr[j]){
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//    }



        BuildingCompany company = new BuildingCompany("Hubert industries", "ul. krzywa 123");
        Department dep = new Department("Main department");

        company.createDepartment(dep);
        company.printDepartmentNames();

        Warehouse warehouse = new Warehouse(10,15,20);
        Production production = new Production();
        warehouse.createProduction(production);
        warehouse.produceWood();
        production.checkProduction();

        company.createWarehouse(warehouse);

        company.getWarehouse();

        Shop shop = new Shop("Shop name", 20,20,20);

        company.createShop(shop);

        ShopService shopService = new ShopService("Stephen" , "Sanchez");
        shop.createShopServiece(shopService);
        shop.sendBricks(10);

        Manager man = new Manager("Vito", "Corleone",200,40);

        dep.addClient(0,"Anthony", "Soprano", "Krakow", 25751263, 1000);
        dep.addClient(1,"Maria", "Adamczyk", "Warsaw", 1245456, 2700);
        dep.printClients();

        Worker workerOne = new Worker("Damian","Nowak", 122);
        Worker workerTwo = new Worker("Agata","Malone", 168);

        dep.hireWorker(0,workerOne);
        dep.hireWorker(1,workerTwo);

        dep.hireManager(man);
        dep.checkManagerPaycheck();
        System.out.println(dep.printManager());

        dep.checkProfit();
        dep.checkCosts();

        company.printAllClients();

        Expense.checkBuildingMaintenance();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new Date (dd/mm/yyyy): ");
        String newDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateToChange = LocalDate.parse(newDate,formatter);

        Client clientOne = new Client(1,"Ewelina", "Jackson","boston", 525321, 5000);
        MyDate clientOneDate = new ClientsDate();
        clientOneDate.setNewDate(clientOne,dateToChange);
        clientOneDate.printDate(clientOne);

        System.out.println(clientOneDate.sayHello());


    }
}
