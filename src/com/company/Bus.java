package com.company;

public class Bus extends Transport {
    private String specialization;

    Bus(String name, int wheels, int maxSpeed, String specialization) {
        super(name, wheels, maxSpeed);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + getName() + '\'' +
                ", wheels=" + getWheels() +
                ", maxSpeed=" + getMaxSpeed() +
                ", specialization=" + getSpecialization() +
                '}';
    }
}
