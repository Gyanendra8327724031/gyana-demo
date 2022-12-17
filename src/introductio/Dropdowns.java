package introductio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.cssSelector("div[data-testid='one-way-radio-button']")).click();
		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).sendKeys("delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Rajiv Gandhi International Airport']")).click();
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
			
	 for (int i = 1;i<5;i++)
	 {
		
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	 }	
	 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	 //driver.findElement(By.xpath("//div[text()='Students']")).click();
	 driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	 
	 
	}

}
