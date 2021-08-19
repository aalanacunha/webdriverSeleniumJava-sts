package Tests;

import static org.junit.Assert.*;

import com.google.common.primitives.Bytes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionRowsTest {
    @Test
    public void testSelect() {
        //open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aalan\\drivers\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        //open website
        browser.get("http://the-internet.herokuapp.com/large");
        browser.manage().window().maximize();

        //WebElement SelectRow = browser.findElement(By.className("example"));

        //SelectRow.findElements(By.xpath("//div[@class='example']/h4[2]"));

        Select SelectRow = new Select(browser.findElement(By.xpath("//div[@class='example']/h4[2]")));
        SelectRow.selectByVisibleText ("Siblings");

    }
}