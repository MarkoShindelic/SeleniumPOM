package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    //drivers
   public WebDriver driver;
    public WebDriverWait wait;

    //Page elements
    public WebElement message;
    public WebElement logOut;
    public String URL;



    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("post-title"));
    }

    public WebElement getLogOut() {
        return driver.findElement(By.linkText("Log out"));
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }


    //*****************************************

    public void clickOnLogoutButton(){
        getLogOut().click();
    }

    public String messageText(){
        return getMessage().getText();
    }


}
