package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void cleanUp(){
        driver.quit();
    }

    @Disabled
    @Test
    public void search(){
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Winter in Chicago" + Keys.ENTER);
    }

    @Test
    public void titleVerification(){
        driver.get("https://google.com");
        String expected = "Google";
        String title = driver.getTitle();
        if (title.equals(expected)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

    @Tag("search")
    @DisplayName("This test is for About link")
    @Test
    public void aboutPageVerification(){
        driver.get("https://google.com");
        driver.findElement(By.linkText("About")).click();
        String url = driver.getCurrentUrl();

        if (url.contains("about.google")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }

}
