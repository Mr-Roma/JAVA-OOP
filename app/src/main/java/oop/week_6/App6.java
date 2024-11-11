package oop.week_6;

import java.util.ArrayList;

public class App6 {
    public static void displayShapeInfo(shape shape) {
        System.out.println("Luas: " + shape.getArea());
        
        if (shape instanceof hasVolume volumeShape) {
            System.out.println("Volume: " + volumeShape.getVolume());
        }
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        ArrayList<shape> shapes = new ArrayList<>();
        
        shapes.add(new rectangle(2.25, 4.0));
        shapes.add(new rectangle(4.0, 4.0));
        shapes.add(new circle(10.0));
        shapes.add(new cube(5.0));
        shapes.add(new tube(10.0, 5.0));
        
        for (shape shape : shapes) {
            displayShapeInfo(shape);
        }
    }
}
