package introductio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
		
		int count = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']")).size();
		
		for(int i=0;i<count;i++)
			
		{
			String text=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']")).get(i).getText();
			
			if(text.equalsIgnoreCase("29"))
			{
				//Thread.sleep(1000);
			driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']")).get(i).click();
			break;
			
		}
	}
	
	}
}
