package studymate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.StudyMateAdminPage;
import pages.StudyMateLoginPage;
import pages.StudyMateTeacherAnnouncementPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

import java.util.ArrayList;
import java.util.List;

public class StudyMateTests {
    StudyMateLoginPage smlp = new StudyMateLoginPage();
    StudyMateAdminPage smap = new StudyMateAdminPage();
    StudyMateTeacherAnnouncementPage teacherAnnouncementPage = new StudyMateTeacherAnnouncementPage();

    @AfterEach
    public void cleanUp(){
        Driver.quitBrowser();
    }

    @Test
    public void test(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.login(Config.getValue("studyMateLoginEmail"), Config.getValue("studyMateLoginPassword"));
    }

    @Test
    public void test2(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.login("test@test.com", "Random");
    }

    @Test
    public void languageTest(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.languageDropdown.click();
        Flow.wait(1500);
        for (WebElement option: smlp.languageOptions){
            System.out.println(option.getText());
        }
    }

    @Test
    public void logoutTest(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.login(Config.getValue("studyMateLoginEmail"), Config.getValue("studyMateLoginPassword"));
        Flow.wait(3000);
        smap.logout();
    }

    @Test
    public void announcementTest(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.login("esenniiazov@gmail.com", "123123");
        teacherAnnouncementPage.announcementMenu.click();

        System.out.println(teacherAnnouncementPage.getTotalAnnouncements());
        int beforeResult = teacherAnnouncementPage.getTotalAnnouncements();

        teacherAnnouncementPage.addAnnouncementBtn.click();
        teacherAnnouncementPage.announcementText.sendKeys("Today is a good day!");
        teacherAnnouncementPage.groupDropdown.click();
        teacherAnnouncementPage.groupsDropdownOptions.get(2).click();
        teacherAnnouncementPage.formAddBtn.click();
        Flow.wait(1000);
        System.out.println(teacherAnnouncementPage.getTotalAnnouncements());
        int afterResult = teacherAnnouncementPage.getTotalAnnouncements();

        Assertions.assertEquals(beforeResult+1, afterResult, "Announcement creation");
        String status = teacherAnnouncementPage.firstAnnouncementStatus.getText();

        Assertions.assertEquals("Hidden", status, "Default announcement status");
    }

    @Test
    public void announcementManagementOptions(){
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        smlp.login("esenniiazov@gmail.com", "123123");
        teacherAnnouncementPage.announcementMenu.click();
        teacherAnnouncementPage.getFirstAnnouncementOptionsBtn.click();
        Flow.wait(500);
        List<String> expectedOptions = new ArrayList<>();
        expectedOptions.add("Edit");
        expectedOptions.add("Publish");
        expectedOptions.add("Delete");

        Assertions.assertEquals(3, teacherAnnouncementPage.announcementOptions.size());

        for (WebElement option: teacherAnnouncementPage.announcementOptions){
            Assertions.assertTrue(expectedOptions.contains(option.getText()), "Announcement option failed: " + option.getText());
        }
    }

}
