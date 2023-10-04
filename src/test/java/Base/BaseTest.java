package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PracticePage;
import Pages.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    //Drivers
    public WebDriver driver;
    public WebDriverWait wait;

    //Pages
    public HomePage homePage;
    public LoginPage loginPage;
    public PracticePage practicePage;
    public ProfilePage profilePage;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();

        //Driver and waiter setup
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Page objects initialisation
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        practicePage = new PracticePage(driver, wait);
        profilePage = new ProfilePage(driver, wait);
        excelReader = new ExcelReader("src/test/java/TestData.xlsx");

    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}
