package com.solvd;

import com.solvd.company.BuildingCompany;
import com.solvd.company.Department;
import com.solvd.employees.Manager;
import com.solvd.employees.Worker;

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



        Manager man = new Manager("Vito", "Corleone",200,40);

        Department dep = new Department("Main department");

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

        BuildingCompany company = new BuildingCompany("Hubert industries", "ul. krzywa 123");
//        company.addStore("store",12,55,12);
//        company.printStore();
//        ShopService stserv = new ShopService("Simon", "Tem");
//        company.sendBricks(stserv,14);
//        company.printStore();
//        company.sendTools(stserv,3);
//        company.printStore();
//
//        Production p = new Production(0,0);
//        Warehouse war = new Warehouse(5,5,5);
//        war.addWood(p);
//
//        Shop stor = new Shop("store name",4,5,6);
//
//
//        System.out.println(company);
//        company.setWarehouse(war,4,6,9);
//        company.getWarehouse(war);
//
//        Client clientOne = new Client(1,"Ewelina", "Jackson","boston", 525321, 5000);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter new Date (dd/mm/yyyy): ");
//        String newDate = scan.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dateToChange = LocalDate.parse(newDate,formatter);
//
//        MyDate clientOneDate = new ClientsDate();
//        clientOneDate.setNewDate(clientOne,dateToChange);
//        clientOneDate.printDate(clientOne);
//
//        System.out.println(clientOneDate.sayHello());

        company.printAllClients(dep);

    }
}
