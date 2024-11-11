package oop.week_6;

public class cube extends square implements hasVolume {
    public cube(double side) {
        super(side);
    }
    
    @Override
    public double getArea() {
        // Area of a cube is the sum of all 6 faces
        return 6 * super.getArea(); // 6 * (side * side)
    }
    
    @Override
    public double getVolume() {
        return length * length * length;  // cubic volume
    }
}
