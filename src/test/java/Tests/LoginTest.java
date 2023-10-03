package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to("https://practicetestautomation.com/");

    }

    @Test
    public void verifyThatUserCanLogIn(){
        String username = "student";

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername(username);
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();
        Assert.assertTrue(profilePage.getMessage().isDisplayed());
        Assert.assertTrue(profilePage.getLogOut().isDisplayed());
    }

    @Test
    public void userCannotLogInWithEmptyUsername() {

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername(" ");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidUsername(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername("SomeUsername");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }
    @Test
    public void userCannotLogInWithEmptyPassword(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword(" ");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidPassword(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword("somePassword");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidCredentials(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername("someUser");
        loginPage.inputPassword("somePassword");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }

    @Test
    public void userCannotLogInWithEmptyCredentials(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername(" ");
        loginPage.inputPassword(" ");
        loginPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        Assert.assertTrue(loginPage.getError().isDisplayed());
    }


}
