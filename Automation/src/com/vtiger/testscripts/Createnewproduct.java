package com.vtiger.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.productt.Vtigerlogin;

public class Createnewproduct {
	public static void main(String[]args) throws IOException {
		Vtigerlogin vl=new Vtigerlogin();
		System.setProperty("webdriver.chrome.driver","E:\\selenium4488\\chrome\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(vl.getDataFromProperty("url"));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.name("user_name")).sendKeys(vl.getDataFromProperty("username"));
	    driver.findElement(By.name("user_password")).sendKeys(vl.getDataFromProperty("password"));
	    driver.findElement(By.id("submitButton")).click();
	    
	    driver.findElement(By.linkText("Products")).click();
	    driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
	    driver.findElement(By.name("productname")).sendKeys(vl.getdataFromExcel("Sheet1", 1, 1),Keys.ENTER);
	    
	}
	

}
