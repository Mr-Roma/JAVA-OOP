package oop.week_7;

import java.util.HashMap;

public class LoginFailedException extends Exception {
    private static HashMap<Integer, Integer> failedCount = new HashMap<>();
    private int userid;
    
    public LoginFailedException(String msg, int userid) {
        super(msg);
        this.userid = userid;
        
        if (!containsKey(userid)) {
            failedCount.put(userid, 1);
        } else {
            // If userid already exists, increment its value
            int currentCount = failedCount.get(userid);
            failedCount.put(userid, currentCount + 1);
        }
    }
    
    // Method to check if userid exists in failedCount
    public static boolean containsKey(int userid) {
        return failedCount.containsKey(userid);
    }
    
    // Method to add or update userid and count in failedCount
    public static void put(int userid) {
        if (!containsKey(userid)) {
            failedCount.put(userid, 1);
        } else {
            failedCount.put(userid, failedCount.get(userid) + 1);
        }
    }
    
    // Method to get the failed count for a userid
    public static int get(int userid) {
        return failedCount.getOrDefault(userid, 0);
    }
    
    // Method that takes userid as input and returns number of failed logins
    public int getFailedCount() {
        return get(userid);
    }
    
    @Override
    public String getMessage() {
        return "Login for user " + userid + " failed, has failed to login " + getFailedCount() + " time" + 
               (getFailedCount() > 1 ? "s" : "") + ".";
    }
}