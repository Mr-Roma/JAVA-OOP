package oop.week_6;

public class rectangle extends shape {
    protected double length;
    protected double width;
    
    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}
