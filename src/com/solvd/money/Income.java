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

    @Override
    public String toString() {
        return "Income{" +
                "losses=" + losses +
                ", profit=" + profit +
                '}';
    }

    @Override
    public int hashCode(){
        return 17 * losses + 21 * profit;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if (obj instanceof Income) {
            Income otherIncome = (Income) obj;
            return losses == otherIncome.losses && profit == otherIncome.profit;
        }
        return false;
    }



}
