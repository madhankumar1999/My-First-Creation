package google;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Googlesearch {
	
		public static void main(String[]args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","E:\\selenium4488\\chrome\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("lionel messi");
	     driver.findElement(By.cssSelector("[name='btnK']")).click();
		 Thread.sleep(1000);
		 String search=driver.findElement(By.cssSelector("div#result-stats")).getText();
		 System.out.println(search);
		 driver.close();
		}
}
