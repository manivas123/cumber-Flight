package com.wibro;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightJavaMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/flight-booking");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		driver.findElement(By.id("email")).sendKeys("manivasgam29@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manivas69*");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		driver.findElement(By.xpath("//i[@class='fa fa-bell']")).click();
		driver.findElement(By.xpath("(//a[@class='trans_btn'])[1]")).click();

		driver.findElement(By.id("one-way-trip")).click();
		driver.findElement(By.id("left")).sendKeys("Chennai International Airport (MAA) - Chennai,India");
		driver.findElement(By.id("right")).sendKeys("Kempegowda International Airport (BLR) - Bengaluru,India");

		JavascriptExecutor java = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("departureDate"));
		java.executeScript("arguments[0].setAttribute('value','23-06-2024')", element);

		driver.findElement(By.id("passenger")).click();

		WebElement element2 = driver.findElement(By.id("adultsCount"));
		Select select = new Select(element2);
		select.selectByVisibleText("1");

		WebElement element3 = driver.findElement(By.id("childrenCount"));
		Select select1 = new Select(element3);
		select1.selectByIndex(3);

		WebElement element4 = driver.findElement(By.id("infantsCount"));
		Select select2 = new Select(element4);
		select2.selectByIndex(3);

		
		Thread.sleep(3000);
		JavascriptExecutor java1 = (JavascriptExecutor) driver;
		WebElement element5 = driver.findElement(By.xpath("(//input[@name='travelclass'])[1]"));
		java1.executeScript("arguments[0].click()", element5);
		
		
		driver.findElement(By.xpath("//label[@class='specialFare seniorCitizen font14  mb-0']")).click();
		driver.findElement(By.id("applyTravelers")).click();
        driver.findElement(By.id("search_flight")).click();
		
		
		
		
		

	}

}
