package com.eurotechStudy.pages;

import com.eurotechStudy.utilities.BrowserUtils;
import com.eurotechStudy.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditProfilePage extends BasePage{

  @FindBy(xpath = "//input[@type='submit']")
    public WebElement profilSubmitButton_loc;

  public void selectModule_Method(String status, String type){
    WebElement selectMenu= Driver.get().findElement(By.xpath("//select[@name='"+status+"']"));
    Select select= new Select(selectMenu);
    select.selectByValue(type);
    BrowserUtils.waitFor(2);

  }

  public void addInfo_Method(String placeBox, String placeInput){
    WebElement placeHolder=Driver.get().findElement(By.name(placeBox));
    placeHolder.clear();
    placeHolder.sendKeys(placeInput);
  }



}
