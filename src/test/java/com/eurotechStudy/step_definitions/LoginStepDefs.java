package com.eurotechStudy.step_definitions;

import com.eurotechStudy.pages.DashboardPage;
import com.eurotechStudy.pages.LoginPage;
import com.eurotechStudy.utilities.ConfigurationReader;
import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        String username=ConfigurationReader.get("usernameTeacher");
        String password=ConfigurationReader.get("passwordTeacher");
        LoginPage loginPage=  new LoginPage();
        loginPage.login(username,password);
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        DashboardPage dashboardPage = new DashboardPage();
        String expectedMessage="Welcome Eurotech";
        String actualMessage=dashboardPage.welcomeMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
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
