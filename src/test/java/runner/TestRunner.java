package runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.Utilities;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:","json:target/cucumber.json"}, 
        glue = "stepDefinition", 
        features = "src/test/java/features/frontend/ApplitrackSearch.feature", 
        tags={"@tag1"},
         monochrome = true)
public class TestRunner extends Utilities{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));            
    }
	
	@BeforeClass
	public static void setup() {
		Utilities utilities = new Utilities();
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    String reportFolderName = utilities.timestamp();
	    File reportDirectory = new File(System.getProperty("user.dir") + "/target/cucumber-reports/" + "Extent Report_" +reportFolderName);
	    extentProperties.setReportPath(reportDirectory + "/report.html");
	}
}
