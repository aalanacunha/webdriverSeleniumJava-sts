package Tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//@RunWith(DataDrivenTestRunner);
//@DataLoader(filePaths = "UserCredentialsTest.csv");
public class UserCredentialsTest {
    private WebDriver browser;

    @Before
    public void setUp() {
        //open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aalan\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();

        //open website
        browser.get("http://the-internet.herokuapp.com/login");
        browser.manage().window().maximize();
    }

    @Test
    public void testLogin() {

        /* Given I visit "http://the-internet.herokuapp.com/login"
           When I enter "Tomsmith" in the "Login" field
           And I enter "SuperSecretPassword" in the "password" field
           And I press the "login" button
           Then I should see the "welcome" page
        */

        //Click on id="username" Username and type tomsmith
        WebElement formLogin = browser.findElement(By.id("login"));

        formLogin.findElement(By.id("username"));

        WebElement username = browser.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        String userValidation = username.getText();
        //Validation
        if (userValidation.equalsIgnoreCase("tomsmith")) {
            System.out.println("Login Invalid");
        } else {
            System.out.print("login successful");
        }

        //Click on id="password" Password and type SuperSecretPassword!
        formLogin.findElement(By.id("password"));

        WebElement password = browser.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        String passwordValidation = password.getText();
        //Validation
        if (passwordValidation.equalsIgnoreCase("SuperSecretPassword!")) {
            System.out.println("Invalid Password");
        } else {
            System.out.print("Successful");
        }

        //Click button Login through xpath //button[@type='submit']
        formLogin.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @After
    public void tearDown() {
        //Close Chrome
        browser.quit();
    }
}