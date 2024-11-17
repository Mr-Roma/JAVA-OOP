package oop.week_7;

public class UserData {
    private int userid;
    private int password;
    private boolean isLoggedIn;
    
    public UserData(int userid, int password) {
        this.userid = userid;
        this.password = password;
        this.isLoggedIn = false;
    }
    
    public void login() throws LoginFailedException {
        // Check if userid and password have exactly 4 digits
        if (!hasExactlyFourDigits(userid) || !hasExactlyFourDigits(password)) {
            throw new LoginFailedException("UserID and password must be exactly 4 digits", userid);
        }
        
        // Check if sum equals 10,000
        if (userid + password == 10000) {
            isLoggedIn = true;
            System.out.println("Login successful for user " + userid);
        } else {
            isLoggedIn = false;
            throw new LoginFailedException("Login failed for user " + userid, userid);
        }
    }
    
    private boolean hasExactlyFourDigits(int number) {
        return number >= 1000 && number <= 9999;
    }
}
