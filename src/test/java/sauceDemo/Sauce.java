package sauceDemo;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //WebDriver driver = new ChromeDriver();

        //driver.get("https://google.com");

        Faker faker = new Faker();

        System.out.println(faker.book().title());
        System.out.println(faker.food().ingredient());

        System.out.println(faker.phoneNumber().cellPhone());
        String email = faker.internet().emailAddress();
        System.out.println(email);
    }

}
