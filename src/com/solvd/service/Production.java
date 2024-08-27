package com.solvd.service;

import java.util.Objects;

public class Production {

    public int wood;
    public int glass;

    public Production(int wood, int glass) {
        this.wood = wood;
        this.glass = glass;
    }

    public void produceWood(){
        wood = wood +10;
    }

    public void produceGlass(){
        wood = wood +10;
    }

    public int sendWood(){
        return wood;
    }

    public int sendGlass(){
        return glass;
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
