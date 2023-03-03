package utilities;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UtilTester {

    @Test
    public void test(){
        Driver.getDriver().get("https://cashwise.us");
        Flow.wait(1000);
        Flow.scrollDown(1000);
        Flow.wait(1000);
        Flow.scrollUp(900);
    }
}
