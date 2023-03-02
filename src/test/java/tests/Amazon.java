package tests;

import org.junit.jupiter.api.Test;
import utilities.Driver;
import utilities.Flow;

public class Amazon {

    @Test
    public void test(){

        Driver.getDriver().get("https://amazon.com");
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getTitle());
        Driver.quitBrowser();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://etsy.com");
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getTitle());
        Flow.wait(1000);
        Driver.quitBrowser();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getTitle());
        Driver.quitBrowser();
    }

}
