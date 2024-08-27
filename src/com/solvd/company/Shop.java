package com.solvd.company;

import java.util.Objects;

public class Shop {

    public String name;
    private int bricks;
    private int cement;
    private int tools;

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
