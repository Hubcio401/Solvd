package com.solvd.date;

import com.solvd.resource.Clients;

import java.time.LocalDate;


public abstract class MyDate {

    public abstract void printDate(Clients cli);

    public abstract void setNewDate(Clients cli, LocalDate newdate);

    public String sayHello(){
        return "This method is called from abstract class";
    }


}
