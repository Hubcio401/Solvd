package com.solvd.resource;

import com.solvd.interfaces.MaintainsInventory;


import java.util.Objects;

public final class Warehouse implements MaintainsInventory {

    private int bagsOfCement;
    private int wood;
    private int glass;

    public Warehouse() {
    }

    public Warehouse(int bagsOfCement, int wood, int glass) {
        this.bagsOfCement = bagsOfCement;
        this.wood = wood;
        this.glass = glass;
    }

    public Warehouse(int bagsOfCement, int wood) {
        this.bagsOfCement = bagsOfCement;
        this.wood = wood;
    }

    public Warehouse(int bagsOfCement) {
        this.bagsOfCement = bagsOfCement;
    }

    @Override
    public void checkInventory() {
        System.out.println("In warehouse we have: " + getBagsOfCement() + " bags of cement " + getWood() + " wood " + getGlass() + " glass ");
    }

    public int getBagsOfCement() {
        return bagsOfCement;
    }

    public void setBagsOfCement(int bagsOfCement) {
        this.bagsOfCement = bagsOfCement;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return bagsOfCement == warehouse.bagsOfCement && wood == warehouse.wood && glass == warehouse.glass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagsOfCement, wood, glass);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "bagsOfCement=" + bagsOfCement +
                ", wood=" + wood +
                ", glass=" + glass +
                '}';
    }
}
