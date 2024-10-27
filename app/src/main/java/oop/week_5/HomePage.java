package oop.week_5;

public class HomePage extends WebPage implements  Loginable{
    public HomePage(String title) {
        super(title);
    }
    
    public void login(String input) {
        this.loggedUsername = input;
        System.out.println("Welcome to the Home Page, " + loggedUsername + "!");
    }
    
    protected void showMainPage() {
        if (loggedUsername == null) {
            System.out.println("Welcome");
            System.out.println("##");
            System.out.println("This is general explanation of the home page");
            System.out.println("##");
        } else {
            System.out.println("Welcome, " + loggedUsername);
            System.out.println("##");
            System.out.println("This is specific explanation for home page");
            System.out.println("##");
        }
    }
}
