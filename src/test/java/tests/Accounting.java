package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Accounting {

    @Test
    public void signUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://cashwise.us");

        WebElement signUp = driver.findElement(By.xpath("//button[2]"));

        signUp.click();

        List<WebElement> inputBoxes = driver.findElements(By.xpath("//form[@id='register-form-1']//input"));
        inputBoxes.get(0).sendKeys("codewise@test.com");
        inputBoxes.get(1).sendKeys("Password");
        inputBoxes.get(2).sendKeys("Password");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//form[@id='register-form-1']/..//button)[3]")).click();
    }
}
