package exercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInaotherTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			System.out.println(driver.findElements(By.tagName("a")).size());
			WebElement footer=driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
			List<WebElement> linkfooter=footer.findElements(By.tagName("a"));
	
			for(int i=1;i<linkfooter.size();i++) {
				
				footer.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
				Thread.sleep(1000);
				
			}
			
			Set<String>windows=driver.getWindowHandles();
			Iterator<String> it =windows.iterator();
			String parentLink=it.next();
			String firstLink=it.next();
			String secondLink=it.next();
			String thirdLink=it.next();
			String fourthLink=it.next();
			System.out.println(driver.switchTo().window(parentLink).getTitle());
			System.out.println(driver.switchTo().window(firstLink).getTitle());
			System.out.println(driver.switchTo().window(secondLink).getTitle());
			System.out.println(driver.switchTo().window(thirdLink).getTitle());
			System.out.println(driver.switchTo().window(fourthLink).getTitle());
			
	}
}
