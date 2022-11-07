package com.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File from=ts.getScreenshotAs(OutputType.FILE);
	File to=new File("C:\\Users\\aa\\eclipse-workspace\\Selenium\\Screenshot\\img.png");
	FileUtils.copyFile(from,to);
	}

}
