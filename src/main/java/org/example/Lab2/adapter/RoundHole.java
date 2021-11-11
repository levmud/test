package org.example.Lab2.adapter;

public class RoundHole {
    private int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public boolean fits(RoundStick stick) {
        return this.getRadius() >= stick.getRadius();
    }
}
