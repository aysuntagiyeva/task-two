package com.company;

public class Microscope {
    private String includingMicroscope;
    private double magnifyingPower;

    public Microscope(String includingMicroscope, double magnifyingPower) {
        this.includingMicroscope = includingMicroscope;
        this.magnifyingPower = magnifyingPower;
    }

    public String getIncludingMicroscope() {
        return includingMicroscope;
    }

    public double getMagnifyingPower() {
        return magnifyingPower;
    }

    public void magnifyObject() {
        System.out.println("Object is visible.");
    }
}
