package exercises;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Multiple Windows")).click();
			driver.findElement(By.linkText("Click Here")).click();
			Set<String>windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			String parentId=it.next();
			String childId=it.next();
			driver.switchTo().window(childId);
			System.out.println(driver.findElement(By.cssSelector(".example")).getText());
			driver.switchTo().window(parentId);
			System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
			driver.quit();
			
	}

}
