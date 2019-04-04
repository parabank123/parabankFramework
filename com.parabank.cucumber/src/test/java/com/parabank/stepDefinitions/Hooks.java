package com.parabank.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.parabank.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {

  
  
  @BeforeClass
  public void setUp() {
    
    Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void tearDown(Scenario scenario) {
    // only takes a screenshot if the scenario fails
    if (scenario.isFailed()) {
      // taking a screenshot
      final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png");
    }
    Driver.getDriver().quit();;
    
    
  }
  
  
  
  
  
}