package seleniumAID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnterTextInTextBox {
	@Test
	public void enterText() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/TYSS/Desktop/SeleniumRepo/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("document.getElementById("identifierId").value='Ramyavarthini@gmail.com'");
		
		WebElement ele_un = driver.findElement(By.id("identifierId"));
		js.executeScript("arguments[0].value='Ramyavarthini@gmail.com'", ele_un);
		
		WebElement ele_nxt = driver.findElement(By.xpath("//span[text()='Next']"));
		js.executeScript("arguments[0].click()", ele_nxt);
		Reporter.log("Test");
		
//		driver.findElement(By.id("identifierId")).sendKeys("Ramyavarthini@gmail.com");
//		WebDriverWait wt = new WebDriverWait(driver,30);
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.findElement(By.name("password")).sendKeys("ishagopiram");
//		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		//driver.close();
	}

}
