package com.solvd.resource;

import com.solvd.money.Invoice;

import java.time.LocalDate;
import java.util.Objects;

public class Client {

    private int id_client;
    private LocalDate startDate ;
    private String name;
    private String surname;
    private String address;
    private int phoneNumber;
    public int price;
    private Invoice invoice = new Invoice();

    public Client(int id_client, String name, String surname, String address, int phoneNumber, int price) {
        startDate = LocalDate.now();
        this.id_client = id_client;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
