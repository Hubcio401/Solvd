package com.solvd;

import com.solvd.company.BuildingCompany;
import com.solvd.date.ClientsDate;
import com.solvd.date.MyDate;
import com.solvd.employees.Managers;
import com.solvd.employees.Workers;
import com.solvd.money.Income;
import com.solvd.money.Rent;
import com.solvd.resource.Clients;
import com.solvd.resource.CompanyResources;
import com.solvd.resource.Resources;
import com.solvd.service.CompanyResourcesService;
import com.solvd.service.RentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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



        Managers man = new Managers("Vito", "Corleone",200,40);

        Resources res = new Resources(4,6);
        man.getResources(res);
        man.setResources(res,9,12);
        man.getResources(res);

        man.addClient(0,"Anthony", "Soprano", "Krakow", 25751263, 1000);
        man.addClient(1,"Maria", "Adamczyk", "Warsaw", 1245456, 2700);
        man.printClients();
        man.hireWorkers(0,"Hubert","Ziobro",50);
        man.hireWorkers(1,"Damina","Nowak",122);

        Income in = new Income();

        System.out.println(in.losses(man));
        System.out.println(in.profit(man));
        System.out.println(BuildingCompany.getCompanyStart());
        System.out.println(BuildingCompany.getOwner());

        Rent rent = new Rent(120,30);
        RentService rentService = new RentService("BuildersCompany","Berlin");
        rentService.rentDig(rent);
        rentService.rentShov(rent);

        CompanyResources compRes = new CompanyResources(3,1);
        CompanyResourcesService compResServ = new CompanyResourcesService("Dom","krakow - ul. stanczyka");
        compResServ.getResources(compRes);

        System.out.println("Summary rent costs: " + rent.summaryCost(10,2));
        System.out.println("Summary rent costs: " + rent.summaryCost(10.68,2.74));

        System.out.println("Summary paycheck costs: " + man.summaryPaycheck(200,10));
        System.out.println("Summary paycheck costs: " + man.summaryPaycheck(200.42,10.12));

        Clients clientOne = new Clients(2,"Mike","Wazowski","Wroclaw",1256323,5000);
        System.out.println(clientOne);

        Workers workerOne = new Workers(3,"Robin","Hood",300);
        System.out.println(workerOne.getName());

        BuildingCompany company = new BuildingCompany("Hubert industries", "ul. krzywa 123");
        System.out.println(company);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new Date (dd/mm/yyyy): ");
        String newDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateToChange = LocalDate.parse(newDate,formatter);

        MyDate clientOneDate = new ClientsDate();
        clientOneDate.setNewDate(clientOne,dateToChange);
        clientOneDate.printDate(clientOne);

        System.out.println(clientOneDate.sayHello());

    }
}
