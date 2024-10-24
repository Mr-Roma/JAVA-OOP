package oop.week_3;

public class Doctor {
    private String name;
    private String speciality;

    // Constructor
    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
