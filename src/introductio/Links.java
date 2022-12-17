package introductio;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");
	
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver=driver.findElement(By.cssSelector("div.background-grey"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement footdriverrows = footerdriver.findElement(By.xpath("//div[@class='region region-content-middle-center']"));
		
		System.out.println(footdriverrows.findElements(By.tagName("a")).size());
		
		int i =0;
		for( i=0;i<footdriverrows.findElements(By.tagName("a")).size();i++)
		{
		String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		footdriverrows.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		Thread.sleep(5000L);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator(); // helps to move tabs
		
		while(it.hasNext())//says there is some window present or not
		
		{
			//it.next();//it prints window ID
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		}	


	}


	
