package com.solvd.shops;

import com.solvd.Exceptions.NoAddressException;
import com.solvd.interfaces.MaintainsInventory;
import com.solvd.resource.ShopClient;


import java.util.ArrayList;
import java.util.Objects;

public class Shop implements MaintainsInventory {

    public String name;
    private int bricks;
    private int cement;
    private int tools;
    private ArrayList<ShopClient> shopClients = new ArrayList<>();

    public Shop(String name, int bricks, int cement, int tools) {
        this.name = name;
        this.bricks = bricks;
        this.cement = cement;
        this.tools = tools;
    }

    public Shop(String name, int bricks, int cement) {
        this.name = name;
        this.bricks = bricks;
        this.cement = cement;
    }

    public Shop(String name, int bricks) {
        this.name = name;
        this.bricks = bricks;
    }

    public Shop() {
    }

    public void createShopClient(ShopClient shopClient){
        this.shopClients.add(shopClient);
    }

    public void sendToClient(int idWorker){
        if (shopClients.get(idWorker).getAddress()==null){
            throw new NoAddressException("We can't send purchases without address!");
        }
        else {
            System.out.println("Send purchases to " + shopClients.get(idWorker).getName() + " " + shopClients.get(idWorker).getSurname() + " on address " + shopClients.get(idWorker).getAddress());
        }
    }

    @Override
    public void checkInventory() {
        System.out.println("In shop we have: " + getBricks() + " bricks " + getCement() + " cement " + getTools() + " tools " );

    }

    public int getBricks() {
        return bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public int getCement() {
        return cement;
    }

    public void setCement(int cement) {
        this.cement = cement;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", bricks=" + bricks +
                ", cement=" + cement +
                ", tools=" + tools +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return bricks == shop.bricks && cement == shop.cement && tools == shop.tools && Objects.equals(name, shop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bricks, cement, tools);
    }
}
