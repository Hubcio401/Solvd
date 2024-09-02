package com.solvd.money;

import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.resource.Client;

import java.util.Objects;

public class Expense {

    private int costs ;
    private int profit;
    private static int buildingmaintenance = 100;

    public Expense() {
    }

    public static void checkBuildingMaintenance(){
        System.out.println("Building Maintenance = " + buildingmaintenance);
    }

    public int costs(Worker arrW[], Manager man){

        for(int i=0;i < arrW.length;i++){
            costs = costs + arrW[i].getPaycheck();
        }
        costs = costs + man.getPaycheck() + man.getBonus() + buildingmaintenance;
        return costs;
    }

    public int profit(Client arrC[]){
        for (int i = 0; i < arrC.length; i++){
            profit = profit + arrC[i].getPrice();
        }
        return profit;
    }


    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Income{" +
                "costs=" + costs +
                ", profit=" + profit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return costs == expense.costs && profit == expense.profit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costs, profit);
    }
}
