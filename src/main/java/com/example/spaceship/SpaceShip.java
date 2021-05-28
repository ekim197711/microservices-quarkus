package com.example.spaceship;

public class SpaceShip {
    private String captain;
    private int fuel;

    public SpaceShip(String captain, int fuel) {
        this.captain = captain;
        this.fuel = fuel;
    }

    public SpaceShip() {
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
