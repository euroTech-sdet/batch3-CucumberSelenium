package com.eurotechStudy.step_definitions;

import com.eurotechStudy.pages.DevelopersPage;
import com.eurotechStudy.pages.EditProfilePage;
import com.eurotechStudy.utilities.BrowserUtils;
import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class EditProfileStepDefs {
        EditProfilePage editProfilePage=new EditProfilePage();
        DevelopersPage developersPage=new DevelopersPage();

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String module) {
        developersPage.navigateToMenu(module);
//        WebElement dashboardModule= Driver.get().findElement(By.xpath("//*[text()='"+module+"']"));
//        dashboardModule.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user select {string} {string}")
    public void the_user_select(String status, String type) {
        editProfilePage.selectModule_Method(status,type);


    }

    @When("the user add {string} {string}")
    public void the_user_add(String placeBox, String placeInput) {
        editProfilePage.addInfo_Method(placeBox,placeInput);


    }

    @Then("the user enters submit button")
    public void the_user_enters_submit_button() {
        editProfilePage.profilSubmitButton_loc.click();

    }


    @And("the user verify that following menu")
    public void theUserVerifyThatFollowingMenu(List<String> expectedList) {
        WebElement selectMenu= Driver.get().findElement(By.xpath("//select[@name='status']"));
        Select select= new Select(selectMenu);

        //elimizde list web element var
        List<WebElement> options = select.getOptions();

        //list string olmali, neden cunku expected objemiz de list string
        List<String> actualList= new ArrayList<>();

        for (WebElement option : options) {
            actualList.add(option.getText());
        }
        Assert.assertEquals(expectedList,BrowserUtils.getElementsText(options));

    }


}
