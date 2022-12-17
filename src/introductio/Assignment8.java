package introductio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElement(By.cssSelector("table[class='table-display']")).getSize());
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,601)");
		WebElement tabledriver=driver.findElement(By.cssSelector("table[class='table-display']"));
		System.out.println(tabledriver.findElements(By.cssSelector("tr")).size());
		System.out.println(tabledriver.findElements(By.cssSelector("th")).size());
		System.out.println(tabledriver.findElement(By.cssSelector("tr:nth-child(3)")).getText());

	}

}
