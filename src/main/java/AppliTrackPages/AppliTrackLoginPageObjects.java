package AppliTrackPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.Operations;

public class AppliTrackLoginPageObjects extends Operations{
	public AppliTrackLoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(how = How.ID, using = "UserID")
	private WebElement userName;
	
	@FindBy(how = How.ID, using = "Password")
	private WebElement passWord;

	@FindBy(how = How.ID, using = "Login")
	private WebElement login;
	
	public void opensURL(String url) throws IOException 
	{
		openURL(url);
	}
	
	public void driverClose() 
	{
		driverQuit();
	}
	
	public void enterUsername(String username)
	{
		EnterText(userName,username);
	}
	
	public void enterPassword(String password) 
	{
		EnterText(passWord, password);
	}
	
	public void clicksLogin() throws InterruptedException
	{
		Clicks(login);
		waits(10000);
	}
	
	public void login(String username, String password) 
	{
		enterUsername(username);
		enterPassword(password);
	}
}
