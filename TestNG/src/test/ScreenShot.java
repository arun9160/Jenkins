package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void capturescreenshot(WebDriver driver, String screenshotname) {
		// TODO Auto-generated method stub
		// WebDriver driver;

		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("E:\\WorkSpace\\TestNG\\Screenshots\\" + screenshotname + ".png"));
			System.out.println("Screen shot taken");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
