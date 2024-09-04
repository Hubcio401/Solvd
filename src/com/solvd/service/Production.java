package com.solvd.service;

import com.solvd.interfaces.DeliveryPlanning;

import java.util.Objects;

public class Production implements DeliveryPlanning {

    private int wood;
    private int glass;

    public Production() {
    }

    public Production(int wood, int glass) {
        this.wood = wood;
        this.glass = glass;
    }

    public int produceWood(){
        wood = wood +10;
        return 10;
    }

    public int produceGlass(){
        glass = glass +10;
        return 10;
    }

    public void checkProduction(){
        System.out.println("we already produce " + wood + " wood and " + glass + " glass");
    }

    @Override
    public void planDelivery() {
        System.out.println("We are planing delivery to our warehouse ");
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
        return "Production{" +
                "wood=" + wood +
                ", glass=" + glass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Production that = (Production) o;
        return wood == that.wood && glass == that.glass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wood, glass);
    }
}
