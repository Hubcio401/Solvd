package com.solvd.resource;

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

}
