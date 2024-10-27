package oop.week_5;

interface Loginable {
    void login(String input);
}

public class App5 {
    public static void main(String[] args) {
        // Test scenario
        HomePage homePage = new HomePage("Home Page");
        DashboardPage dashboardPage = new DashboardPage("Dashboard Page");
        
        // Before login
        System.out.println("=== Before Login ===");
        homePage.showMainPage();
        System.out.println("\n");
        dashboardPage.showMainPage();
        
        // After login
        System.out.println("\n=== After Login ===");
        homePage.login("Romario");
        dashboardPage.login("Romario");
        System.out.println("\n");
        homePage.showMainPage();
        System.out.println("\n");
        dashboardPage.showMainPage();
    }
}

