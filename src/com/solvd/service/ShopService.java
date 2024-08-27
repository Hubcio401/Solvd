package com.solvd.service;

import com.solvd.company.Shop;

import java.util.Objects;

public class ShopService {

    private String clientName;
    private String clientSurname;

    public ShopService(String clientName, String clientSurname) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
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

    public void checkResources(Shop s){
        System.out.println(s.getBricks() + " bricks");
        System.out.println(s.getTools() + " tools");
        System.out.println(s.getCement() + " bags of cement");

    }

    public void sendBr(Shop s, int bricks){
        if(s.getBricks()>bricks){
            System.out.println("We send " + bricks + " bricks");
            int bri = s.getBricks() - bricks;
            s.setBricks(bri);
        }
        else{
            System.out.println("We don't have enough bricks");
        }
    }
    public void sendTl(Shop s, int tools){
        if(s.getTools()>tools){
            System.out.println("We send " + tools + " tools");
            int to = s.getBricks() - tools;
            s.setTools(to);
        }
        else{
            System.out.println("We don't have enough tools");
        }
    }

    public void sendCe(Shop s, int cement){
        if(s.getCement()>cement){
            System.out.println("We send " + cement + " cement");
            int ce = s.getBricks() - cement;
            s.setCement(ce);
        }
        else{
            System.out.println("We don't have enough cement");
        }
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
