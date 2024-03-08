package org.baseclasss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	static WebDriver driver;
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLaunch(String bname) {
	if(bname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
	else if (bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	}
	return driver;	
}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	public static void sendKeys(WebElement as,String value) {
		as.sendKeys(value);
	}
	public static void buttonClick(WebElement as) {
		as.click();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	public static void close() {
	driver.close();
}
	
}	
	
	
	
	
	