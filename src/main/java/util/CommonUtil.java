package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class CommonUtil implements Constants{
	public WebDriver driver;
	@BeforeClass
	public void launchApplication(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
	}

}
