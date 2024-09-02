package com.solvd.service;


import java.util.Objects;

public class ShopService {

    private String clientName;
    private String clientSurname;

    public ShopService(String clientName, String clientSurname) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
    }

    public ShopService() {
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }


    public void sendBr(int bricks){
            System.out.println("We send " + bricks + " bricks");
    }


    @Override
    public String toString() {
        return "ShopService{" +
                "clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(clientName, that.clientName) && Objects.equals(clientSurname, that.clientSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientSurname);
    }
}
