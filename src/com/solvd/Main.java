package com.solvd;

import com.solvd.company.BuildingCompany;
import com.solvd.company.Department;
import com.solvd.money.PaymentService;
import com.solvd.resource.ShopClient;
import com.solvd.shops.Shop;
import com.solvd.employees.Cleaner;
import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.money.Expense;
import com.solvd.resource.Warehouse;


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

        Cleaner cleaner = new Cleaner("Wiktor", "Gortat");
        dep.hireCleaner(cleaner);
        dep.cleanBuilding();

        company.createDepartment(dep);
        company.printDepartmentNames();

        Warehouse warehouse = new Warehouse(10,15,20);

        company.createWarehouse(warehouse);

        company.getWarehouse();

        Shop shop = new Shop("Shop name", 10,15,20);

        company.createShop(shop);

        ShopClient shopClient = new ShopClient("Marcin", "Gortat", "Stanczyka");

        shop.createShopClient(0,shopClient);
        shop.sendToClient(0);


        Manager man = new Manager("Vito", "Corleone",200,40);

        dep.addClient(0,"Anthony", "Soprano", "Krakow", 25751263, 1000);
        dep.addClient(1,"Maria", "Adamczyk", "Warsaw", 1245456, 2700);
        dep.printClients();

        dep.createInvoice(124,0);

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

//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter new Date (dd/mm/yyyy): ");
//        String newDate = scan.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dateToChange = LocalDate.parse(newDate,formatter);
//
//        Client clientOne = new Client(1,"Ewelina", "Jackson","boston", 525321, 5000);
//        MyDate clientOneDate = new ClientsDate();
//        clientOneDate.setNewDate(clientOne,dateToChange);
//        clientOneDate.printDate(clientOne);
//
//        System.out.println(clientOneDate.sayHello());


        dep.fireManager();
        dep.printManager();

        dep.printWorkers();
        dep.fireWorker(0);
        dep.printWorkers();

        PaymentService paymentService = new PaymentService();

        paymentService.processPayment(man);
        paymentService.processPayment(workerOne);

        company.checkWarehouseInventory();
        company.checkShopInventory();

        man.reportProblem(2);

        company.changeComapnyName();

    }
}
