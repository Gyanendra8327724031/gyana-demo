package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		  Thread.sleep(1000);

		  Actions act = new Actions(driver);

		  driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
		  driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
		  driver.findElement(By.id("wp-submit")).click();
		  Thread.sleep(1000);

		  WebElement logoutOption = driver.findElement(By.xpath("//a[text()='Howdy, ']"));

		  act.moveToElement(logoutOption).perform();

		  driver.findElement(By.xpath("//a[@class='ab-item'][text()='Log Out']")).click();

		 Thread.sleep(2000);
		  driver.close();

		 }

		

	

}
