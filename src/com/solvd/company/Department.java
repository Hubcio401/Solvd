package com.solvd.company;

import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.money.Expense;
import com.solvd.resource.Client;

import java.util.Arrays;
import java.util.Objects;

public class Department {

    private String departmentName;
    private Manager manager = new Manager();
    private Worker workersList[] = new Worker[2];
    private Client clientsList[] = new Client[2];
    private Expense expense = new Expense();


    public void checkCosts(){
        System.out.println(expense.costs(workersList,manager));
    }

    public void checkProfit(){
        System.out.println(expense.profit(clientsList));
    }



    public Department(String departmentName) {
        this.departmentName = departmentName;
    }



    public void hireWorker(int id_worker, Worker worker){

        this.workersList[id_worker] = worker;

    }

    public void hireManager(Manager manager){
        this.manager = manager;
    }
    public Manager printManager(){
        return manager;
    }

    public void checkManagerPaycheck(){
        System.out.println(manager.getPaycheck());
    }


    public void addClient(int id_client, String name, String surname, String address, int phoneNumber, int price){

        clientsList[id_client] = new Client(id_client,name,surname,address,phoneNumber,price);

    }

    public void printClients(){

        for(int i = 0; i< clientsList.length; i++){
            System.out.println(clientsList[i]);
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) && Objects.equals(manager, that.manager) && Arrays.equals(workersList, that.workersList) && Arrays.equals(clientsList, that.clientsList) && Objects.equals(expense, that.expense);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(departmentName, manager, expense);
        result = 31 * result + Arrays.hashCode(workersList);
        result = 31 * result + Arrays.hashCode(clientsList);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", manager=" + manager +
                ", workersList=" + Arrays.toString(workersList) +
                ", clientsList=" + Arrays.toString(clientsList) +
                '}';
    }
}
