package helper;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Operations {
	
	static CaptureScreenshot screenshot;
	
	public Operations() {
		screenshot = new CaptureScreenshot();
	}
	
	//SET METHODS
	
    // Enter Text 
    public static void EnterText(WebElement element, String value)
    {
        element.sendKeys(value);
    }
    
    // Enter Keyboard's key 
    public static void KeyboardKey(WebElement element, String key)
    {
        switch (key.toLowerCase()) {
		case "enter":
			element.sendKeys(Keys.ENTER);
			break;
		case "down":
			element.sendKeys(Keys.ARROW_DOWN);
			break;
		case "left":
			element.sendKeys(Keys.ARROW_LEFT);
			break;
		case "right":
			element.sendKeys(Keys.ARROW_RIGHT);
			break;
		case "up":
			element.sendKeys(Keys.ARROW_UP);
			break;
		case "end":
			element.sendKeys(Keys.END);
			break;
		case "alt":
			element.sendKeys(Keys.ALT);
			break;
		case "pagedown":
			element.sendKeys(Keys.PAGE_DOWN);
			break;
		case "pageup":
			element.sendKeys(Keys.PAGE_UP);
			break;
		default:			
			break;
		}
    }

    // Click a Checkbox, Button , Option etc
    public static void Clicks(WebElement element)
    {
        element.click();
    }

    // Move To Element
    public static void MoveToElement(WebElement element)
    {
        Actions actions = new Actions(Properties.driver);
        actions.moveToElement(element);
        actions.perform();
    }
    
    // Selecting a drop down control
    public static void SelectDropDownByText(WebElement element, String value)
    {
        new Select(element).deselectByVisibleText(value);
    }

    // open URL
    public static void openURL(String url) throws IOException
    {		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		Properties.driver = new ChromeDriver();
	    Properties.driver.manage().window().maximize();
        Properties.driver.get(url);
        screenshot.takeSnapShot();
    }
    
    // closes driver
    public static void driverQuit()
    {		
        Properties.driver.quit();
    }

    //Clears
    public static void Clears(WebElement element)
    {
        element.clear();
    }

    //Explicit time wait
    public static void waits(int time) throws InterruptedException
    {
        Thread.sleep(time);
    }

    // JavaScript scroll to bottom
    public static void scrollToBottom()
    {
        JavascriptExecutor js = (JavascriptExecutor)Properties.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }

    // JavaScript scroll to postion            
    public static void scrollToPosition(int length, int width)
    {
    	JavascriptExecutor js = (JavascriptExecutor)Properties.driver;
        js.executeScript("window.scrollTo(length, width);");
    }
    
    //GET METHODS
    
    //Getting innertext of a Web Element
    public static String GetText(WebElement element)
    {
        return element.getText();
    }

    //Getting Value of a Web Element
    public static String GetValue(WebElement element)
    {
        return element.getAttribute("value");
    }

    //Getting first option from the drop down list
    public static String GetTextFromDDL(WebElement element)
    {
        return new Select(element).getAllSelectedOptions().get(0).getText();
    }
}
