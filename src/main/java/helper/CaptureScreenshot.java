package helper;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;

public class CaptureScreenshot {
	
	public void takeSnapShot() throws IOException{
		
		Utilities utilities = new Utilities();
	    String screenshotFolderName = utilities.timestamp();
		
		TakesScreenshot scrShot = ((TakesScreenshot)Properties.driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\screenshots\\screenshot" + screenshotFolderName + ".jpg"));
	}
}
