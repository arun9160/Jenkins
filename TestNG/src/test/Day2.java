package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"test"}, dataProvider="data")
	public void Login(String username, String password) {

		
		System.out.println(username);
		System.out.println(password);
	}
	@Test(groups= {"smoke"})
	public void GoogleTitle() {

	System.out.println("This is smoke group");

	}
	@Test(groups= {"Regression"})
	public void getlogo() {
		
		System.out.println("This is regression group");
	}
	@DataProvider
	public Object[][] data() {
		
		Object[][] obj = new Object[2][2];
		obj[0][0]="Firstuser";
		obj[0][1]="firstpassword";
		obj[1][0]="SecondUser";
		obj[1][1]="SecondPassword";
		
		return obj;
	}
	


	
}
