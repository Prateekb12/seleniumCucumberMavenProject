package AppliTrackPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.Operations;

public class ApplicantDashboardPageObjects extends Operations {
	public ApplicantDashboardPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.ID, using = "SearchName")
	private WebElement name;
	
	@FindBy(how = How.ID, using = "token-input-SearchReqs")
	private WebElement vacancy;
	
	@FindBy(how = How.ID, using = "token-input-SearchJobCategories")
	private WebElement category;
	
	@FindBy(how = How.ID, using = "ButtonSubmitSearch")
	private WebElement search;
	
	public void searchByName(String applicantName) throws InterruptedException
	{
		EnterText(name, applicantName);
		waits(5000);
		KeyboardKey(name, "enter");
		waits(5000);
	}
	
	public void searchByVacancy(String jobVacancy) throws InterruptedException 
	{
		EnterText(vacancy, jobVacancy);
		waits(5000);
		KeyboardKey(vacancy, "enter");
		waits(7000);
	}
	
	public void searchByCategory(String jobCategory) throws InterruptedException 
	{
		EnterText(category, jobCategory);
		waits(7000);
		KeyboardKey(category, "enter");
		waits(5000);
	}
	
	public void clicksSearch() throws InterruptedException 
	{
		Clicks(search);
		waits(5000);
	}

}
