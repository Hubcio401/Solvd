package com.solvd.resource;

import com.solvd.service.Production;

import java.time.LocalDate;
import java.util.Objects;

public class Warehouse {

    private int bagsOfCement;
    private int wood;
    private int glass;
    private LocalDate productionDate;
    private Production production = new Production();

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

    public void createProduction(Production production){
        this.production = production;
    }

    //??
    public void produceWood(){
        wood = wood + production.produceWood();
        productionDate = LocalDate.now();
        System.out.println("At " + productionDate + " we produce wood");
        System.out.println("Now we have " + wood + " woods" );
    }


    public void produceGlass(){
        glass = glass + production.produceGlass();
        System.out.println("At " + productionDate + " we produce glass");
        System.out.println("Now we have " + glass + " glass" );
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
        return bagsOfCement == warehouse.bagsOfCement && wood == warehouse.wood && glass == warehouse.glass && Objects.equals(productionDate, warehouse.productionDate) && Objects.equals(production, warehouse.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagsOfCement, wood, glass, productionDate, production);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "bagsOfCement=" + bagsOfCement +
                ", wood=" + wood +
                ", glass=" + glass +
                ", productionDate=" + productionDate +
                '}';
    }
}
