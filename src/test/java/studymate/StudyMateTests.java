package studymate;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.StudyMateAdminPage;
import pages.StudyMateLoginPage;
import utilities.Driver;
import utilities.Flow;

public class StudyMateTests {
    StudyMateLoginPage smlp = new StudyMateLoginPage();
    StudyMateAdminPage smap = new StudyMateAdminPage();

    @Test
    public void test(){
        Driver.getDriver().get("https://codewise.studymate.us/");
        smlp.login("studymate@gmail.com", "123123");
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://codewise.studymate.us/");
        smlp.login("test@test.com", "Random");
    }

    @Test
    public void languageTest(){
        Driver.getDriver().get("https://codewise.studymate.us/");
        smlp.languageDropdown.click();
        Flow.wait(1500);
        for (WebElement option: smlp.languageOptions){
            System.out.println(option.getText());
        }
    }

    @Test
    public void logoutTest(){
        Driver.getDriver().get("https://codewise.studymate.us/");
        smlp.login("studymate@gmail.com", "123123");
        Flow.wait(3000);
        smap.logout();
    }


}
