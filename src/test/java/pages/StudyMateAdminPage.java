package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Flow;

public class StudyMateAdminPage {

    public StudyMateAdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[.='Administrator']")
    public WebElement administratorUser;

    @FindBy(xpath = "(//ul)[6]/li")
    public WebElement logoutButton;

    @FindBy(xpath = "(//div/button)[5]")
    public WebElement logoutConfirmationPopup;

    public void logout(){
        administratorUser.click();
        Flow.wait(500);
        logoutButton.click();
        logoutConfirmationPopup.click();
    }
}







