package com.solvd.resource;

import java.time.LocalDate;
import java.util.Objects;

public class Client {

    int id_client;
    LocalDate startDate ;
    protected String name;
    protected String surname;
    private String address;
    private int phoneNumber;
    int price;

    public Client(int id_client, String name, String surname, String address, int phoneNumber, int price) {
        startDate = LocalDate.now();
        this.id_client = id_client;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }


    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString(){
        return "Name: %s , Surname: %s, Address: %s, Phone Number: %d ".formatted(name, surname, address, phoneNumber) + "Start date: " + startDate ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id_client == client.id_client && phoneNumber == client.phoneNumber && price == client.price && Objects.equals(startDate, client.startDate) && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_client, startDate, name, surname, address, phoneNumber, price);
    }
}
