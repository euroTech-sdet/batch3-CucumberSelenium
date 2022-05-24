package com.eurotechStudy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevelopersPage extends BasePage{

    @FindBy(xpath = "//h4[contains(text(),'Profiles')]")
    public WebElement developersHead;
}
