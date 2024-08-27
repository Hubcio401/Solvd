package com.solvd.company;

import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.resource.Client;

import java.util.Arrays;

public class Department {

    public Worker workersList[] = new Worker[2];
    public Client clientsList[] = new Client[2];


    public void hireWorkers(int id_worker, String name, String surname, int paycheck){

        workersList[id_worker] = new Worker(id_worker,name,surname,paycheck);

    }

    public int workersCosts(){
        int costs = 0;
        for (int i = 0; i < workersList.length; i++){
            costs = costs + workersList[i].getPaycheck();
        }
        return costs;
    }

    public int managerCosts(Manager man){
        int mancosts = 0;
        mancosts = man.getPaycheck() + man.getBonus();
        return mancosts;
    }

    public int getProfit(){
        int profit=0;
        for (int i = 0; i < clientsList.length; i++){
            profit = profit + clientsList[i].getPrice();
        }
        return profit;
    }

    public void addClient(int id_client, String name, String surname, String address, int phoneNumber, int price){

        clientsList[id_client] = new Client(id_client,name,surname,address,phoneNumber,price);

    }

    public void printClients(){

        for(int i = 0; i< clientsList.length; i++){
            System.out.println(clientsList[i]);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "workersList=" + Arrays.toString(workersList) +
                ", clientsList=" + Arrays.toString(clientsList) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Arrays.equals(workersList, that.workersList) && Arrays.equals(clientsList, that.clientsList);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(workersList);
        result = 31 * result + Arrays.hashCode(clientsList);
        return result;
    }
}
