package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    //Drivers and waiters
    public WebDriver driver;
    public WebDriverWait wait;

    //Page elements
    WebElement usernameField;
    WebElement passwordField;
    WebElement submitButton;
    WebElement error;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getError() {
        return driver.findElement(By.id("error"));
    }

    @FindBy(linkText = "Log out")
    WebElement  logoutButton;


    //***************************************************

    public void inputUsername(String username){
        getUsernameField().clear();
        getUsernameField().sendKeys(username);
    }

    public void inputPassword(String password){
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }

    public void clickOnLogoutButton(){
        logoutButton.click();
    }

}
