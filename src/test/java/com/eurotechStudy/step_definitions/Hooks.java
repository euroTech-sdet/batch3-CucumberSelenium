package com.eurotechStudy.step_definitions;

import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup() {

        System.out.println("--- This Statement comes from BEFORE ---");
    }

    @After
    public void tearDown() {

        Driver.closeDriver();
        System.out.println("--- This Statement comes from AFTER ---");
    }


    @Before("@db")
    public void setupDb() {

        System.out.println("*** - Connecting to Database - ***");
    }

    @After("@db")
    public void closeDb() {

        System.out.println("*** - Disconnecting Database - ***");
    }


}
