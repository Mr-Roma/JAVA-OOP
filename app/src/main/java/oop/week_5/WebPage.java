package oop.week_5;

public class WebPage {
    protected String webTitle;
    protected String loggedUsername;
    
    public WebPage(String title) {
        this.webTitle = title;
        this.loggedUsername = null;
    }
    
    public void showHeader() {
        System.out.println("##########################");
        System.out.println("#       " + webTitle + "       #");
        System.out.println("##########################");
    }
    
    public void showFooter() {
        System.out.println("##########################");
        System.out.println("#    Created by PraktikanName    #");
        System.out.println("##########################");
    }
    
    protected void showMainPage() {
        // This will be overridden by child classes
    }
    
    public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }
}
