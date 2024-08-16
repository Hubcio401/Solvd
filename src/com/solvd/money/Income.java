package com.solvd.money;

import com.solvd.employees.Managers;

public class Income {

    public int losses = 0;
    public int profit = 0;

    public int losses(Managers man){

        losses = man.workersCosts() + man.getPaycheck();
        System.out.print("We lost: ");
        return losses;

    }

    public int profit(Managers man){

        profit = man.getProfit();
        System.out.print("We earn: ");
        return profit;
    }


}
