package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.utilities.Driver;

public class RegisterPage {

	public RegisterPage(){
	
		   PageFactory.initElements(Driver.getDriver(), this);
		  }  
		  
		  @FindBy(id="customer.firstName")
		  public WebElement firstName;
		  
		  @FindBy(id="customer.lastName")
		  public WebElement lastName;
		  
		  
		  @FindBy(id="customer.address.street")
		  public WebElement address;
		  
		  
		  @FindBy(id="customer.address.city")
		  public WebElement city;
		  
		  
		  @FindBy(id="customer.address.state")
		  public WebElement state;
		  
		  @FindBy(name="customer.address.zipCode")
		  public WebElement zipCode;
		  
		  @FindBy(id="customer.phoneNumber")
		  public WebElement phoneNumber;
		  
		  @FindBy(id="customer.ssn")
		  public WebElement SSN;
		  
		  @FindBy(id="customer.username")
		  public WebElement userName;
		  
		  @FindBy(id="customer.password")
		  public WebElement password;
		  
		  @FindBy(id="repeatedPassword")
		  public WebElement passwordConfirm;
		  
		  @FindBy(xpath="//input[@value=\"Register\"]")
		  public WebElement registerButton;
	
	
}
