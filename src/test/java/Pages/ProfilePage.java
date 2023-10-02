package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

   public WebDriver driver;
    public WebDriverWait wait;

    public WebElement message;
    public WebDriver logOut;

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebDriver getLogOut() {
        return logOut;
    }

    //*****************************************

    public void slickOnLogoutButton(){

    }

    public String messateText(){
        return getMessage().getText();
    }


}
