package oop.week_6;

public class tube extends circle implements hasVolume {
    private final double height;
    
    public tube(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    @Override
    public double getArea() {
        // Area of a tube (cylinder) = 2πr² + 2πrh
        return (2 * super.getArea()) + (2 * Math.PI * radius * height);
    }
    
    @Override
    public double getVolume() {
        return super.getArea() * height; // πr²h
    }
}
