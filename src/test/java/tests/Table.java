package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    @Test
    public void test(){
        Faker faker = new Faker();
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.address().fullAddress());

        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("check"));
        element.click();

        Assertions.assertTrue(element.isSelected());
        String s = element.getText();
        Assertions.assertTrue(s.isEmpty());
        Assertions.assertEquals("", s);
    }
}
