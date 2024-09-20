package com.solvd.resource;

public class ShopClient {

    private String name;
    private String surname;
    private String address;
    private int phoneNumber;

    public ShopClient() {

    }

    public ShopClient(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public ShopClient(String name, String surname, String address, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
