package exercises;

import java.awt.Window;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

         String [] requiredItems= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("password")).sendKeys("learning");
			driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6000));
			WebElement popup=driver.findElement(By.id("okayBtn"));
			wait.until(ExpectedConditions.visibilityOf(popup));
			popup.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
			System.out.println(driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).isEnabled());
			WebElement dropdown=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
			Select s =new Select(dropdown);
			s.selectByIndex(2);
			System.out.println(s.getFirstSelectedOption().getText());
			driver.findElement(By.cssSelector("input[type='checkbox']")).click();
			driver.findElement(By.id("signInBtn")).click();
			Thread.sleep(3000);
			List<WebElement> products=driver.findElements(By.cssSelector(".card-title"));
            for(int i=0;i<products.size();i++) 
            {
				String name=products.get(i).getText();
				System.out.println(name);
				List<String> itemrequiredList=Arrays.asList(requiredItems);
				
				if(itemrequiredList.contains(name)) {
					driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
				}
				
			}
            driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	}

	

}
