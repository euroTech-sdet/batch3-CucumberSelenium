package com.eurotechStudy.pages;

import com.eurotechStudy.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevelopersPage extends BasePage{

    @FindBy(xpath = "//h4[contains(text(),'Profiles')]")
    public WebElement developersHead;

    public void navigateToMenu(String menuType){
        Driver.get().findElement(By.xpath("//*[text()='"+menuType+"']")).click();
    }

    public String getHeadText(String text){
        return Driver.get().findElement(By.xpath("//section[@class='container']/*[contains(text(),'"+text+"')]")).getText();

    }
}
