package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to("");

    }

    @Test
    public void verifyThatUserCanLogIn(){

    }

}
