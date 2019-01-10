package stepDefinition;

import java.util.List;
import AppliTrackPages.ApplicantDashboardPageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import helper.Properties;

public class ApplitrackSearchStepDefination {	
	ApplicantDashboardPageObjects applicantDashboardPageObjects;

	@When("^User entered Name to be searched on Applicant Name Search Box appearing on Activity and Statistics section of Applicant Dashboard$")
	public void user_entered_Name_to_be_searched_on_Applicant_Name_Search_Box_appearing_on_Activity_and_Statistics_section_of_Applicant_Dashboard(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> list = dt.asList(String.class);
		String applicantName =list.get(1);
		applicantDashboardPageObjects = new ApplicantDashboardPageObjects(Properties.driver);
		applicantDashboardPageObjects.searchByName(applicantName);
	}

	@When("^user entered VacancyID to be searched on Vacancy Search Box appearing on Activity and Statistics section of Applicant Dashboard$")
	public void user_entered_VacancyID_to_be_searched_on_Vacancy_Search_Box_appearing_on_Activity_and_Statistics_section_of_Applicant_Dashboard(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		String jobVacancy =list.get(1);
		applicantDashboardPageObjects = new ApplicantDashboardPageObjects(Properties.driver);
		applicantDashboardPageObjects.searchByVacancy(jobVacancy);
	}
	
	@When("^user entered Job category to be searched on Job Category Search Box appearing on Activity and Statistics section of Applicant Dashboard$")
	public void user_entered_Job_category_to_be_searched_on_Job_Category_Search_Box_appearing_on_Activity_and_Statistics_section_of_Applicant_Dashboard(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		String jobCategory =list.get(1);
		applicantDashboardPageObjects = new ApplicantDashboardPageObjects(Properties.driver);
		applicantDashboardPageObjects.searchByCategory(jobCategory);
	}
}