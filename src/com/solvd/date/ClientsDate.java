package com.solvd.date;

import com.solvd.resource.Client;

import java.time.LocalDate;

public class ClientsDate extends MyDate{


    @Override
    public void printDate(Client cli) {

        System.out.println(cli.getStartDate());

    }

    @Override
    public void setNewDate(Client cli, LocalDate newdate){

        cli.setStartDate(newdate);

    }

    @Override
    public String sayHello(){
        return "This method is called from child class";
    }

}
