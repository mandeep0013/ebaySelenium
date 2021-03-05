package com.ebaySeleniumProject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ebayProject {
		
		public static void main(String[] args) throws InterruptedException {
		
			//public static void launchEbay(String searchString) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaur_\\Downloads\\chromedriver_win32\\chromedriver.exe");  
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.ebay.com");
				WebElement searchInput = driver.findElement(By.id("gh-ac"));
				WebElement searchButton = driver.findElement(By.id("gh-btn"));
				searchInput.sendKeys("iphone");
				searchButton.click();
				Thread.sleep(5000);
				driver.quit();	
		}
		
			
		public void search(String searchString) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kaur_\\Downloads\\chromedriver_win32\\chromedriver.exe");  
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com");
			
			WebElement searchInput = driver.findElement(By.id("gh-ac"));
			WebElement searchButton = driver.findElement(By.id("gh-btn"));
			searchInput.sendKeys(searchString);
			searchButton.click();
		}
				
		public void quit() {
			System.out.println("Quit");
		}
		

	
	}

