package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class SauceDemoProductPage {

    public SauceDemoProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "product_sort_container")
    public WebElement sortDropdown;

    public void selectSortDropdown(String visibleText){
        Select sort = new Select(sortDropdown);
        sort.selectByVisibleText(visibleText);
    }
}
