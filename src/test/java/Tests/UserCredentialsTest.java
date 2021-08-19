package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCredentialsTest {
    @Test
    public void testLogin(){
        //open browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aalan\\drivers\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        //open website
        browser.get("http://the-internet.herokuapp.com/login");
        browser.manage().window().maximize();

        //Click on id="username" Username and type tomsmith
        WebElement formLogin = browser.findElement(By.id("login"));

        formLogin.findElement(By.id("username"));

        WebElement username = browser.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        String userValidation = username.getText();
        //Validation
        if(userValidation.equalsIgnoreCase("tomsmith")) {
            System.out.println("Login Invalid");
        }else{
            System.out.print("login successful");
        }

        //Click on id="password" Password and type SuperSecretPassword!
        formLogin.findElement(By.id("password"));

        WebElement password = browser.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        String passwordValidation = password.getText();
        //Validation
        if(passwordValidation.equalsIgnoreCase("SuperSecretPassword!")) {
            System.out.println("Invalid Password");
        }else{
            System.out.print("Successful");
        }

        //Click button Login through xpath //button[@type='submit']
        formLogin.findElement(By.xpath("//button[@type='submit']")).click();

        //Close Chrome
        browser.quit();
    }


}

/*
try
        {
        WebElement email = driver.findElement(By.id("Email email.sendKeys("ENTER INCORRECT MAIL ID");
        WebElement password = driver.findElement(By.id("Passwd password.sendKeys("ENTER INCORRECT PASSWORD");
        WebElement button = driver.findElement(By.id("signIn button.click();

        WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
        String text = GmailText.getText();
        if(text.equals("Primary"))
        {
        System.out.println("----------Sucessfuln -------");
        }
        else
        {
        System.out.println("----------Loginure ----------");
        }

        }
        catch(Throwable e)
        {

        System.out.println("Errororrect Email and Password. \n-----------------------");
        System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
        }

        driver.findElement(By.id("Email")).clearlearing the Email field
        driver.findElement(By.id("Passwd")).clearlearing the Password field
		*/