package AppliTrackPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.Operations;

public class AppliTrackDashboardPageObjects extends Operations{
	
	public AppliTrackDashboardPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//LI[@class='activeContent']/../..//A[contains(text(),'Applicant')]")
	private WebElement applicantTab;
	
	public void clicksApplicantTab() throws InterruptedException 
	{
		Clicks(applicantTab);
		waits(6000);
	}	
}
