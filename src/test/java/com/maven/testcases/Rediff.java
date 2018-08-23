package com.maven.testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.maven.base.TestBase;
public class Rediff extends TestBase{
	@Test
	public void redifflogin() {
		OpenBrowser("firefox");
		navigateurl("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
	}

}
