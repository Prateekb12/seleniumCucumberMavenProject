#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@RnH
Feature: RnH - User want to search RnH user it on Applitrack application

	@tag1
  Scenario: Searching via "Applicant Name"-Validating search functionality on Applitrack application
    Given User has valid access to Applitrack application & entered correct Url to open the application
      | Url                             |
      | https://www.applitrack.com/dex/ |
    When User entered correct Userid and Password to login
      | UserId | Password |
      | tryout | tryout   |
    And User is navigated to Application dashboard page
    And user selected Applicants option from left hand panel to navigate to Applicant Dashboard page
    And User entered Name to be searched on Applicant Name Search Box appearing on Activity and Statistics section of Applicant Dashboard
      | Name |
      | John |
    And User selected desired option from the list and clicked on Search button
    Then Appropriate search details should be available on the page
    And user logsout
	
	@tag2
  Scenario: Searching on Application Dashboard via "Vacancy"-Validating search functionality on Applitrack application
    Given User has valid access to Applitrack application & entered correct Url to open the application
      | Url                             |
      | https://www.applitrack.com/dex/ |
    When User entered correct Userid and Password to login
      | UserId | Password |
      | tryout | tryout   |
    And User is navigated to Application dashboard page
    And user selected Applicants option from left hand panel to navigate to Applicant Dashboard page
    And user entered VacancyID to be searched on Vacancy Search Box appearing on Activity and Statistics section of Applicant Dashboard
      | Vacancy |
      | principal   |
    And User selected desired option from the list and clicked on Search button
    Then Appropriate search details should be available on the page
    And user logsout

	@tag3
  Scenario: Searching on Application Dashboard via "Job Category"-Validating search functionality on Applitrack application
    Given User has valid access to Applitrack application & entered correct Url to open the application
      | Url                             |
      | https://www.applitrack.com/dex/ |
    When User entered correct Userid and Password to login
      | UserId | Password |
      | tryout | tryout   |
    And User is navigated to Application dashboard page
    And user selected Applicants option from left hand panel to navigate to Applicant Dashboard page
    And user entered Job category to be searched on Job Category Search Box appearing on Activity and Statistics section of Applicant Dashboard
      | Job Category |
      | Tech         |
    And User selected desired option from the list and clicked on Search button
    Then Appropriate search details should be available on the page
    And user logsout

	@tag4
  Scenario: Searching on Application Dashboard via "Job Category" and "Vacancy ID"-Validating search functionality on Applitrack application
    Given User has valid access to Applitrack application & entered correct Url to open the application
      | Url                             |
      | https://www.applitrack.com/dex/ |
    When User entered correct Userid and Password to login
      | UserId | Password |
      | tryout | tryout   |
    And User is navigated to Application dashboard page
    And user selected Applicants option from left hand panel to navigate to Applicant Dashboard page
    And user entered VacancyID to be searched on Vacancy Search Box appearing on Activity and Statistics section of Applicant Dashboard
      | JVacancy |
      | principal    |
    And user entered Job category to be searched on Job Category Search Box appearing on Activity and Statistics section of Applicant Dashboard
      | Job Category |
      | Tech         |
    And User selected desired option from the list and clicked on Search button
    Then Appropriate search details should be available on the page
    And user logsout
