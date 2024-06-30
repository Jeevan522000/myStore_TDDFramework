package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredUserAccount {

	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public registeredUserAccount(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(xpath = "//a[@title='View my customer account']") 
	WebElement userName;

	@FindBy(linkText = "Sign out")
	WebElement signOut;

	
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
	
	
	public String getUserName()
	{
		String text = userName.getText();

		return text;
	}
}

