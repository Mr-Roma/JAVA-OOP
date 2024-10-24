package oop.week_3;

public class App3 {
    public static void main(String[] args) {
        // Create 3 Doctor objects
        Doctor dt1 = new Doctor("Maulana Malik", "Optometry");
        Doctor dt2 = new Doctor("Fahryan Tresno", "Orthodonty");
        Doctor dt3 = new Doctor("Priyagung Makmur", "Orolaryngology");

        // Create 3 Patient objects
        Patient pt1 = new Patient("Adi Bahri", 25);
        Patient pt2 = new Patient("Adam Rafif", 30);
        Patient pt3 = new Patient("Alif Taufiq", 40);

        // Create an array based on the Booking class with the number of array contents 5
        Booking[] bookings = new Booking[5];

        // Fill the array with booking data
        bookings[0] = new Booking(dt1, pt1, "Tuesday");
        bookings[1] = new Booking(dt2, pt1, "Thursday");
        bookings[2] = new Booking(dt2, pt2, "Tuesday");
        bookings[3] = new Booking(dt3, pt2, "Friday");
        bookings[4] = new Booking(dt1, pt3, "Monday");

        // Display all booking data using a loop
         for (int i = 0; i < bookings.length; i++) {
            System.out.println("Booking No." + (i + 1));
            System.out.println("Doctor Name: " + bookings[i].getDoctor().getName());
            System.out.println("Speciality: " + bookings[i].getDoctor().getSpeciality());
            System.out.println("Patient Name: " + bookings[i].getPatient().getName());
            System.out.println("Booking Day: " + bookings[i].getDay());
            System.out.println();  // Blank line between each booking
        }
    }
}
