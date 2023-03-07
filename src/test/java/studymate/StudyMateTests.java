package studymate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.StudyMateAdminPage;
import pages.StudyMateLoginPage;
import pages.StudyMateTeacherAnnouncementPage;
import utilities.Driver;
import utilities.Flow;

public class StudyMateTests {
    StudyMateLoginPage smlp = new StudyMateLoginPage();
    StudyMateAdminPage smap = new StudyMateAdminPage();
    StudyMateTeacherAnnouncementPage teacherAnnouncementPage = new StudyMateTeacherAnnouncementPage();

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

    @Test
    public void announcementTest(){
        Driver.getDriver().get("https://codewise.studymate.us/");
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
    }


}
