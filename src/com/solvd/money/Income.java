package com.solvd.money;

import com.solvd.company.Department;
import com.solvd.employees.Manager;

import java.util.Objects;

public class Income {

    public int costs = 0;
    public int profit = 0;
    public static int buildingmaintenance = 100;

    public void costs(Department dep, Manager man){

        costs = dep.workersCosts() + buildingmaintenance + dep.managerCosts(man);
        System.out.println("We lost: " + costs);

    }

    public void profit(Department dep){

        profit = dep.getProfit();
        System.out.println("We earn: " + profit);
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
        Income income = (Income) o;
        return costs == income.costs && profit == income.profit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costs, profit);
    }
}
