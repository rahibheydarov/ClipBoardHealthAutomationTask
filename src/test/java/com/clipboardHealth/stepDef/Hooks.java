package com.clipboardHealth.stepDef;



import com.clipboardHealth.customUtils.BrowserUtils;
import com.clipboardHealth.customUtils.DriverUtil;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Driver;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before(value = "@login", order = 1)
    public void setupLoginScenario(){

    }

    @Before ("@db")
    public void setupScenario(){
        System.out.println("BEFORE--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        System.out.println("AFTER--Teardown steps are being applied...");
        BrowserUtils.sleep(2);
        DriverUtil.closeDriver();
    }

    @BeforeStep
    public void setupStep(){

    }

    @AfterStep
    public void afterStep(){

    }

}
