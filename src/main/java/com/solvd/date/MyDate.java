package com.solvd.date;

import com.solvd.resource.Client;

import java.time.LocalDate;


public abstract class MyDate {

    public abstract void printDate(Client cli);

    public abstract void setNewDate(Client cli, LocalDate newdate);

    public String sayHello(){
        return "This method is called from abstract class";
    }


}
