package com.solvd.resource;

import com.solvd.service.Production;

import java.time.LocalDate;
import java.util.Objects;

public class Warehouse {

    public int bagsOfCement = 0;
    public int wood = 0;
    public int glass = 0;
    LocalDate productionDate ;

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


    public void addWood(Production prod){
        prod.produceWood();
        wood = wood + prod.sendWood();
        productionDate = LocalDate.now();
        System.out.println("produce and add 10 woods to warehouse at " + productionDate);
    }

    public void addGlass(Production prod){
        prod.produceGlass();
        glass = glass + prod.sendGlass();
        productionDate = LocalDate.now();
        System.out.println("produce and add 10 glass to warehouse" + productionDate);
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
    public String toString() {
        return "Stock{" +
                "bagsOfCement=" + bagsOfCement +
                ", wood=" + wood +
                ", glass=" + glass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return bagsOfCement == warehouse.bagsOfCement && wood == warehouse.wood && glass == warehouse.glass && Objects.equals(productionDate, warehouse.productionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagsOfCement, wood, glass, productionDate);
    }
}
