package com.sample.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Mvn_Project/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		String ph = search.getAttribute("placeholder");
		System.out.println(ph);
		search.sendKeys("learn Automatiion Online");
		WebElement btn = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		btn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement te = driver.findElement(By.xpath("//yt-formatted-string[text()='Cucumber framework | 17 Adding login logic under before annotation | Tamil']"));
		Actions mou = new Actions(driver);
		mou.moveToElement(te).perform();
		mou.click(te).perform();
		
		
		
		
		
		
		
		
		
		
	}
	
}
