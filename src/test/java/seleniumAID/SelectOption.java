package seleniumAID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectOption {
@Test
	public void verifyOption(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/TYSS/Desktop/SeleniumRepo/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.computerhope.com/jargon/r/radiobut.htm");
	//	driver.findElement(By.xpath("//input[@value='V3']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='V3']"));		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		
		
		
		
	}
}
