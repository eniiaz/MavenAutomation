package utilities;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UtilTester {

    @Test
    public void test(){
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("Testing" + Keys.ENTER);
        // Driver.getDriver() => driver

    }
}
