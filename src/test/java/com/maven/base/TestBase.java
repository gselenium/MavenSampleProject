package com.maven.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public void OpenBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
			driver = new ChromeDriver();
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