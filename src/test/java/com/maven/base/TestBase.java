package com.maven.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void OpenBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Executing on firefox browser");
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Executing on chrome browser");
		}else {
			System.out.println("Browser parameter not matched");
		}
	}
	
	public void navigateurl(String url) {		
		driver.get(url);
	}
	
	public void closebrowser() {
		driver.quit();
	}

}
