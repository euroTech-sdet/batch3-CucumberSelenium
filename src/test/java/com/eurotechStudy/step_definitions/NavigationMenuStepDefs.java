package com.eurotechStudy.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @Given("the user sees welcome text")
    public void the_user_sees_welcome_text() {

        System.out.println("User sees welcome text");
    }

    @When("the user navigates to Developers menu")
    public void the_user_navigates_to_Developers_menu() {

        System.out.println("Navigating to Developers menu");
    }

    @Then("the user should be able to see the header of the menu")
    public void the_user_should_be_able_to_see_the_header_of_the_menu() {

        System.out.println("The user can see the header");
    }

    @When("the user navigates to All Posts menu")
    public void the_user_navigates_to_All_Posts_menu() {

        System.out.println("Navigating to All Posts");
    }

    @When("the user navigates to My Account menu")
    public void the_user_navigates_to_My_Account_menu() {

        System.out.println("Navigating to My Account");
    }

}
