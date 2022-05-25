package com.eurotechStudy.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DashboardPageMenusStepDefs {


    @Then("the user should be able to see following menus")
    public void the_user_should_be_able_to_see_following_menus(List<String> menuOptions) {

        System.out.println("menuOptions.size() = " + menuOptions.size());

        System.out.println("menuOptions = " + menuOptions);

    }


}
