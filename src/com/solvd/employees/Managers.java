package com.solvd.employees;

import com.solvd.resource.*;

import java.util.Arrays;
import java.util.Objects;

public class Managers {

    private String Name;
    private String Surname;
    private int paycheck;
    public Clients clientsList[] = new Clients[2];
    public Workers workersList[] = new Workers[2];
    private int bonus;

    public Managers() {
    }

    public Managers(String name, String surname) {
        Name = name;
        Surname = surname;
    }


    public Managers(String name, String surname, int paycheck) {
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
    }

    public Managers(String name, String surname, int paycheck, int bonus) {
        Name = name;
        Surname = surname;
        this.paycheck = paycheck;
        this.bonus = bonus;
    }

    public int summaryPaycheck(int paycheck, int bonus){

        return paycheck + bonus;

    }

    public double summaryPaycheck(double paycheck, double bonus){

        return paycheck + bonus;
    }

    public void addClient(int id_client, String name, String surname, String address, int phoneNumber, int price){

        clientsList[id_client] = new Clients(id_client,name,surname,address,phoneNumber,price);

    }

    public void printClients(){

        for(int i = 0;i<clientsList.length;i++){
            System.out.println(clientsList[i]);
        }
    }

    public void hireWorkers(int id_worker, String name, String surname, int paycheck){

        workersList[id_worker] = new Workers(id_worker,name,surname,paycheck);

    }

    public int workersCosts(){
        int costs = 0;
        for (int i = 0; i < workersList.length; i++){
            costs = costs + workersList[i].getPaycheck();
        }
        return costs;
    }

    public int getProfit(){
        int profit=0;
        for (int i = 0; i < clientsList.length; i++){
            profit = profit + clientsList[i].getPrice();
        }
        return profit;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(int paycheck) {
        this.paycheck = paycheck;
    }



    public void setResources(Resources res, int bricks, int sand){

        res.setBricks(bricks);
        res.setSandInKG(sand);

    }

    public void getResources(Resources res){

        System.out.println("In stock we have " + res.getBricks() + " bricks and " + res.getSandInKG() + " KG sand");

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", paycheck=" + paycheck +
                ", clientsList=" + Arrays.toString(clientsList) +
                ", workersList=" + Arrays.toString(workersList) +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Managers managers = (Managers) o;
        return paycheck == managers.paycheck && bonus == managers.bonus && Objects.equals(Name, managers.Name) && Objects.equals(Surname, managers.Surname) && Arrays.equals(clientsList, managers.clientsList) && Arrays.equals(workersList, managers.workersList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Name, Surname, paycheck, bonus);
        result = 31 * result + Arrays.hashCode(clientsList);
        result = 31 * result + Arrays.hashCode(workersList);
        return result;
    }
}
