package com.company;

public class Scooter extends Transport {
    private int permissibleWeight;
    private int handleLength;

    Scooter(String name, int wheels, int maxSpeed, int permissibleWeight, int handleLength) {
        super(name, wheels, maxSpeed);
        this.permissibleWeight = permissibleWeight;
        this.handleLength = handleLength;
    }

    public int getPermissibleWeight() {
        return permissibleWeight;
    }

    public void setPermissibleWeight(int permissibleWeight) {
        this.permissibleWeight = permissibleWeight;
    }

    public int getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(int handleLength) {
        this.handleLength = handleLength;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "name='" + getName() + '\'' +
                ", wheels=" + getWheels() +
                ", maxSpeed=" + getMaxSpeed() +
                ", handleLength=" + getHandleLength() +
                ", permissibleWeight=" + getPermissibleWeight() +
                '}';
    }
}
