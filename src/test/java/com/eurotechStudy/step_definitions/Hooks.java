package com.eurotechStudy.step_definitions;

import com.eurotechStudy.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup() {

        System.out.println("--- This Statement comes from BEFORE ---");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        System.out.println("--- This Statement comes from AFTER ---");
        Driver.closeDriver();
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
