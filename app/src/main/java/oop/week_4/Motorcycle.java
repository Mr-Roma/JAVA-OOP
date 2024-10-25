package oop.week_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Motorcycle {
    protected String colorMotor;
    protected int tankSize;
    protected LocalDateTime gasRefillTime;

    public Motorcycle(String colorMotor) {
        this.colorMotor = colorMotor;
        this.tankSize = 3;
        this.gasRefillTime = null;
    }

    public void fillTankFull() {
        this.gasRefillTime = LocalDateTime.now();
    }

    public String checkFuelStatus() {
        if (gasRefillTime == null) {
            return "The fuel is empty, the motorcycle cannot ride.";
        }
        LocalDateTime emptyTime = gasRefillTime.plusHours(tankSize);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Fuel will run out at '" + emptyTime.format(formatter) + "'";
    }

    public String moving() {
        if (gasRefillTime == null) {
            return "The fuel is empty, the motorcycle cannot ride.";
        }
        return "The motorcycle is now moving";
    }
}


class HondaBaet extends Motorcycle {
    public HondaBaet(String colorMotor) {
        super(colorMotor);
        this.tankSize = 4;
    }
}

class YahamaMoi extends Motorcycle {
    public YahamaMoi(String colorMotor) {
        super(colorMotor);
        this.tankSize = 5;
    }
}


