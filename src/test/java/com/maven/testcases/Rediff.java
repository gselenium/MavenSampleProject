package com.maven.testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.maven.base.TestBase;
public class Rediff extends TestBase{
	@Test
	@Parameters({"browser","url"})
	public void redifflogin(String url) {
		navigateurl(url);		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("Clicking on sign in link");
		closebrowser();
	}

}
