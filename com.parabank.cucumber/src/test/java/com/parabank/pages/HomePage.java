package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.utilities.Driver;


public class HomePage{

public HomePage(){
	   PageFactory.initElements(Driver.getDriver(), this);
	   
	  }  
	  
	  @FindBy(linkText="Register")
	  public WebElement register;
	  
	  @FindBy(xpath="//input[@name=\"username\"]")
	  public WebElement userName;
	  
	  @FindBy(xpath="//input[@name=\"password\"]")
	  public WebElement password;
	
	  @FindBy(xpath="//input[@value=\"Log In\"]")
	  public WebElement login;
	
	  

}
