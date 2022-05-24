package com.eurotechStudy.step_definitions;

import com.eurotechStudy.pages.DashboardPage;
import com.eurotechStudy.pages.DevelopersPage;
import com.eurotechStudy.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Given("the user sees welcome text")
    public void the_user_sees_welcome_text() {

        System.out.println("User sees welcome text");
    }

    @When("the user navigates to Developers menu")
    public void the_user_navigates_to_Developers_menu() {

        new DashboardPage().developers.click();

    }

    @Then("the user should be able to see the header of the menu")
    public void the_user_should_be_able_to_see_the_header_of_the_menu() {

        String expectedText="Filter Profiles by Skill or by Location";
      //  BrowserUtils.verifyElementDisplayed(new DevelopersPage().developersHead);
        System.out.println("The user can see the header");
        String actualText=new DevelopersPage().developersHead.getText();
        Assert.assertEquals("Verify head text",expectedText,actualText);

    }

    @When("the user navigates to All Posts menu")
    public void the_user_navigates_to_All_Posts_menu() {

        System.out.println("Navigating to All Posts");
    }

    @When("the user navigates to My Account menu")
    public void the_user_navigates_to_My_Account_menu() {

        System.out.println("Navigating to My Account");
    }

    @And("the user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuType) {
        BrowserUtils.waitFor(2);
        new DevelopersPage().navigateToMenu(menuType);
    }

    @Then("the user should be able to see header as {string}")
    public void theUserShouldBeAbleToSeeHeaderAs(String headerText) {

        BrowserUtils.waitFor(2);
        String actualText=new DevelopersPage().getHeadText(headerText);
        Assert.assertEquals(headerText,actualText);
    }
}
