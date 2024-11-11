package oop.week_6;

public class circle extends shape {
    protected double radius;
    
    public circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
