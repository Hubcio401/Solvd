package com.solvd.resource;

import java.util.Objects;

public class Resources {

    private int sandInKG;
    private int bricks;

    public Resources(int sandInKG, int bricks) {
        this.sandInKG = sandInKG;
        this.bricks = bricks;
    }

    public Resources(){

    }


    public int getSandInKG() {
        return sandInKG;
    }

    public int getBricks() {
        return bricks;
    }

    public void setSandInKG(int sandInKG) {
        this.sandInKG = sandInKG;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    @Override
    public String toString(){
        return "KG of sand in stock: " + sandInKG
                + " and bricks in stock: " + bricks;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resources resources = (Resources) o;
        return sandInKG == resources.sandInKG && bricks == resources.bricks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sandInKG, bricks);
    }
}
