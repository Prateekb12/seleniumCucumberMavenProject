package stepDefinition;

import AppliTrackPages.AppliTrackDashboardPageObjects;
import AppliTrackPages.ApplicantDashboardPageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Properties;

public class ApplitrackCommonSteps {
		
	AppliTrackDashboardPageObjects appliTrackDashboardPageObjects;
	ApplicantDashboardPageObjects applicantDashboardPageObjects;
		
	@When("^user selected Applicants option from left hand panel to navigate to Applicant Dashboard page$")
	public void user_selected_Applicants_option_from_left_hand_panel_to_navigate_to_Applicant_Dashboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		appliTrackDashboardPageObjects = new AppliTrackDashboardPageObjects(Properties.driver);
		appliTrackDashboardPageObjects.clicksApplicantTab();
	}

	@When("^User selected desired option from the list and clicked on Search button$")
	public void user_selected_desired_option_from_the_list_and_clicked_on_Search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		applicantDashboardPageObjects = new ApplicantDashboardPageObjects(Properties.driver);
		applicantDashboardPageObjects.clicksSearch();
	}

	@Then("^Appropriate search details should be available on the page$")
	public void appropriate_search_details_should_be_available_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Reached Applicant Search Page");
	}
}
