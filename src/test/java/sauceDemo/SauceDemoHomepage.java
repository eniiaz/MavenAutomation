package sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SauceDemoHomepage {

    public SauceDemoHomepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortDropdown;


    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public void selectSortOption(String visibleText){
        Select sort = new Select(sortDropdown);
        sort.selectByVisibleText(visibleText);
    }


}
