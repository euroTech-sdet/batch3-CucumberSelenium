package com.eurotechStudy.step_definitions;

import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {


    @Before
    public void setup() {

        System.out.println("--- This Statement comes from BEFORE ---");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

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
