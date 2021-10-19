package com.company;

public class Motorcycle extends Transport {
    private int engineCapacity;

    Motorcycle(String name, int wheels, int maxSpeed, int engineCapacity) {
        super(name, wheels, maxSpeed);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + getName() + '\'' +
                ", wheels=" + getWheels() +
                ", maxSpeed=" + getMaxSpeed() +
                ", engineCapacity=" + getEngineCapacity() +
                '}';
    }
}
