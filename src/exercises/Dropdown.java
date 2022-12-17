package exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("gyanendra");
			driver.findElement(By.name("email")).sendKeys("gyanendra.prasad15@gmail.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("sanu");
			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
			System.out.println(driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).isEnabled());
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			
			WebElement staticDropdown=driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
			Select dropdown=new Select(staticDropdown);
			dropdown.selectByIndex(0);
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
			System.out.println(driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).isEnabled());
			driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("13-06-1993");
			driver.findElement(By.cssSelector("input[value='Submit']")).click();
			Thread.sleep(1000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			
			
			System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
			driver.close();
			
	}

}
