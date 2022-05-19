package com.eurotechStudy.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Opening the browser and the website");
    }

    @When("the user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        System.out.println("Entering teacher username and password");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        System.out.println("The user is logged in");
    }

    @When("the user enters student credentials")
    public void the_user_enters_student_credentials() {

        System.out.println("Entering student username and password");
    }

    @When("the user enters developer credentials")
    public void the_user_enters_developer_credentials() {

        System.out.println("Entering developer credentials");
    }


}
