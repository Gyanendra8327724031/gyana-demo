package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("checkBoxOption2")).click();
			String option=driver.findElement(By.cssSelector("label[for='benz']")).getText();
			 WebElement dropdowns=driver.findElement(By.id("dropdown-class-example"));
			Select dropdown=new Select(dropdowns);
		    dropdown.selectByVisibleText(option);
		    driver.findElement(By.id("name")).sendKeys(option);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.close();
			
			

	}

}
