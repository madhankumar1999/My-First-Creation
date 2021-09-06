package ebayyyy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaysearch {
	public static void main(String[]args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","E:\\selenium4488\\chrome\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("_nkw")).sendKeys("reebok shoes");
     driver.findElement(By.cssSelector("[type='submit']")).click();
	 Thread.sleep(1000);
	 String search=driver.findElement(By.cssSelector("h1.srp-controls__count-heading")).getText();
	 System.out.println(search);
	 driver.close();
}
}