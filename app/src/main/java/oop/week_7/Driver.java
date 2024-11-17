package oop.week_7;

public class Driver {
    public static void main(String[] args) {
        // First object with correct id and password (sum = 10000)
        UserData user1 = new UserData(1234, 8766);  // 1234 + 8766 = 10000
        
        // Second object with incorrect id and password
        UserData user2 = new UserData(1113, 5000);  // Sum != 10000
        
        // Test first object
        try {
            user1.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
        
        // Test second object first time
        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
        
        // Test second object second time
        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
