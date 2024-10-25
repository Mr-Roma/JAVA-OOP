package oop.week_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App4 {
    public static void main(String[] args) {
        Motorcycle sp = new Motorcycle("Black");
        HondaBaet hb = new HondaBaet("Blue");
        YahamaMoi ym = new YahamaMoi("Red");

        System.out.println("Motorcycle Initial State:");
        System.out.println(sp.moving());

        System.out.println("\nHondaBaet Initial State:");
        System.out.println(hb.moving());

        System.out.println("\nYahamaMoi Initial State:");
        System.out.println(ym.moving());

        sp.fillTankFull();
        hb.fillTankFull();
        ym.fillTankFull();

        System.out.println("\nMotorcycle Latest Status:");
        System.out.println("Current time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(sp.moving());
        System.out.println(sp.checkFuelStatus());

        System.out.println("\nHondaBaet Latest Status:");
        System.out.println("Current time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(hb.moving());
        System.out.println(hb.checkFuelStatus());

        System.out.println("\nYahamaMoi Latest Status:");
        System.out.println("Current time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(ym.moving());
        System.out.println(ym.checkFuelStatus());
    }
}
