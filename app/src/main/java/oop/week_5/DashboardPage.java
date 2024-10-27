package oop.week_5;

public class DashboardPage extends WebPage {
    public DashboardPage(String title) {
        super(title);
    }
    
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println(loggedUsername + " has successfully logged in to the dashboard page");
    }
    
    protected void showMainPage() {
        if (loggedUsername == null) {
            System.out.println("Access denied for guest user");
            System.out.println("##");
            System.out.println("Please log in first");
            System.out.println("##");
        } else {
            System.out.println("Dashboard Page - " + loggedUsername);
            System.out.println("##");
            System.out.println("Dashboard page explain");
            System.out.println("##");
        }
    }
}
