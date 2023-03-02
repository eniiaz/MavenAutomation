package sauceDemo;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class Sauce {



    @Disabled("No ready yet")
    @DisplayName("This is for testing nothing")
    @Test
    public void test1(){
        System.out.println("Test 1");
        Assertions.assertEquals(5,4);
        Driver.getDriver().get("https://amazon.com");
    }

    @Test
    public void loginSauce(){
        System.out.println("Sauce Login");
    }

}
