package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("autocomplete")).sendKeys("un");
			
			Actions a =new Actions(driver);
			Thread.sleep(2000);
			//WebElement path=driver.findElement(By.id("ui-id-124"));
			WebElement path=driver.findElement(By.xpath("//div[text()='United Kingdom (UK)']"));
			a.moveToElement(path).build().perform();
			driver.findElement(By.xpath("//div[text()='United Kingdom (UK)']")).click();
	}

}
