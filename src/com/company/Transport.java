package com.company;

public abstract class Transport {
    private String name;
    private int wheels;
    private int maxSpeed;

    public Transport(String name, int wheels, int maxSpeed) {
        this.name = name;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
