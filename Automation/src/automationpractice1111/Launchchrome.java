package automationpractice1111;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium4488\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
	}
}


