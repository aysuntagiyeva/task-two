package com.company;

public class Main {
    public static void main(String[] args) {
        Magnet magnet = new Magnet("Ceramic", 1100);
        Microscope microscope = new Microscope("X-ray", 10);
        Laboratory laboratory = new Laboratory(microscope, magnet, "Quartz");

        laboratory.getMicroscope().magnifyObject();
        laboratory.getMagnet().attractsMetalObjects(1100);
    }
}
