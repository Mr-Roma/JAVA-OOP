package oop.week_3;

public class Booking {
    private Doctor doctor;
    private Patient patient;
    private String day;

    // Constructor
    public Booking(Doctor doctor, Patient patient, String day) {
        this.doctor = doctor;
        this.patient = patient;
        this.day = day;
    }

    // Getters
    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDay() {
        return day;
    }

    // Setters
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
