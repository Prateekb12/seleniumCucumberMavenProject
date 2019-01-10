package stepDefinition;

import java.util.List;
import java.util.Map;

import AppliTrackPages.AppliTrackLoginPageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import helper.Properties;

public class ApplitrackLoginLogoutStepDefination {
	
	AppliTrackLoginPageObjects appliTrackLoginPageObjects;
	
	@Given("^User has valid access to Applitrack application & entered correct Url to open the application$")
	public void user_has_valid_access_to_Applitrack_application_entered_correct_Url_to_open_the_application(DataTable dt) throws Throwable {
				
		List<String> list = dt.asList(String.class);
		String url =list.get(1);

		appliTrackLoginPageObjects = new AppliTrackLoginPageObjects(Properties.driver);
		appliTrackLoginPageObjects.opensURL(url);
	}
	
	@When("^User entered correct Userid and Password to login$")
	public void user_entered_correct_Userid_and_Password_to_login(DataTable dt) throws Throwable {
		List<Map<String,String>> list = dt.asMaps(String.class, String.class);
		
		appliTrackLoginPageObjects = new AppliTrackLoginPageObjects(Properties.driver);
		appliTrackLoginPageObjects.login(list.get(0).get("UserId"), list.get(0).get("Password"));		

	}
	
	@When("^User is navigated to Application dashboard page$")
	public void user_is_navigated_to_Application_dashboard_page() throws Throwable {
		appliTrackLoginPageObjects = new AppliTrackLoginPageObjects(Properties.driver);
		appliTrackLoginPageObjects.clicksLogin();
	}
	
	@When("^user logsout$")
	public void user_logsout() throws Throwable {
		appliTrackLoginPageObjects = new AppliTrackLoginPageObjects(Properties.driver);
		appliTrackLoginPageObjects.driverClose();
	}
}
