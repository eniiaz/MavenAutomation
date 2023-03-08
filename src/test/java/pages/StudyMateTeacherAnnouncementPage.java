package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StudyMateTeacherAnnouncementPage {

    public StudyMateTeacherAnnouncementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//header/button")
    public WebElement addAnnouncementBtn;

    @FindBy(xpath = "//textarea")
    public WebElement announcementText;

    @FindBy(id = "mui-component-select-groups")
    public WebElement groupDropdown;

    @FindBy(xpath = "(//ul)[6]/li")
    public List<WebElement> groupsDropdownOptions;

    @FindBy(xpath = "//form//button[1]")
    public WebElement formCancelBtn;

    @FindBy(xpath = "//form//button[2]")
    public WebElement formAddBtn;

    @FindBy(xpath = "//li[.='Announcements']")
    public WebElement announcementMenu;

    @FindBy(xpath = "//p[.='pagination.show']/../p[2]")
    public WebElement totalResult;

    @FindBy(xpath = "((//div/header)[2]/..//div/span)[1]")
    public WebElement firstAnnouncementStatus;

    @FindBy(xpath = "(//button)[2]")
    public WebElement getFirstAnnouncementOptionsBtn;

    @FindBy(xpath = "(//ul)[2]/li")
    public List<WebElement> announcementOptions;


    public int getTotalAnnouncements(){
        String totalResultStr = totalResult.getText();
        String totalNumberStr = totalResultStr.substring(totalResultStr.indexOf(" ")+1);
        int totalNumberInt = Integer.parseInt(totalNumberStr.trim());
        return totalNumberInt;
    }



}
