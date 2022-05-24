package com.eurotechStudy.step_definitions;

import com.eurotechStudy.pages.DashboardPage;
import com.eurotechStudy.pages.LoginPage;
import com.eurotechStudy.utilities.BrowserUtils;
import com.eurotechStudy.utilities.ConfigurationReader;
import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        String username=ConfigurationReader.get("usernameTeacher");
        String password=ConfigurationReader.get("passwordTeacher");
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);
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
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        loginPage.login(username, password);
        BrowserUtils.waitFor(2);

    }


    @Then("the user should be able to login and see message {string}")
    public void theUserShouldBeAbleToLoginAndSeeMessage(String name) {
//        DashboardPage dashboardPage = new DashboardPage();
//        String actualMessage=dashboardPage.welcomeMessage.getText();
//        Assert.assertTrue(actualMessage.contains(name));
        Assert.assertTrue(new DashboardPage().welcomeMessage.getText().contains(name));
    }

}
