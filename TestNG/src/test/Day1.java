package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Day1 {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\TestNG\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

	@Test
	public void GoogleTitle() {

		String atitle = driver.getTitle();
		String etitle = "GOOELE";
		if(atitle==etitle) {
			
			System.out.println("Title is matched");
		}else {
			
			System.out.println("doesnot match");
		}

	}
	@Test
	public void getlogo() {
		
		WebElement ele = driver.findElement(By.id("logo.png"));
		if(ele.isDisplayed()) {
			
			System.out.println("visible");
		}else {
			
			System.out.println("not visible");
		}
	}

	@AfterMethod
	public void tyeardown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenShot.capturescreenshot(driver, result.getName());
		}

		
	}
	@AfterClass
	public void tear() {
		driver.close();
		
	}
}
