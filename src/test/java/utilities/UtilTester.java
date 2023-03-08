package utilities;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilTester {

    @Test
    public void test() throws IOException {
        System.out.println(Config.getValue("study.mate.production"));
    }
}
