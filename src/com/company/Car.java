package com.company;

public class Car extends Transport {
    private String typeBody;

    Car(String name, int wheels, int maxSpeed, String typeBody) {
        super(name, wheels, maxSpeed);
        this.typeBody = typeBody;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", wheels=" + getWheels() +
                ", maxSpeed=" + getMaxSpeed() +
                ", typeBody=" + getTypeBody() +
                '}';
    }
}
