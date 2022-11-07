package com.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static WebDriver driver=null;

	public static void browserLaunch() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\aa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Myntra_Search_Brand_NCA_SOK&gclid=EAIaIQobChMInZybhuv_-gIVwUQrCh3JSQoyEAAYASAAEgIZ_fD_BwE");
		Thread.sleep(3000);
		//WebElement findElement = driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[3]"));
		//findElement.click();
		driver.get("https://www.myntra.com/men-tshirts");
		
	}
		public static void productCount()
		{

//			System.setProperty("webdriver.chrome.driver","C:\\Users\\aa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//			driver=new ChromeDriver();
			List<WebElement> allproducts = driver.findElements(By.xpath("//li@class='product-base']"));
			int allproductnumbers  = allproducts.size();
			System.out.println(+allproductnumbers);
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			
			browserLaunch();
			productCount();
			
		}
		
		
}	
		
		
	

//http://rlogiacco.github.io/Natural/
	
//	http://cucumber.github.io/cucumber-eclipse/update-site