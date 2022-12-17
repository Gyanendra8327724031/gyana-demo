package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  WebElement text=driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		
		System.out.println(text.getCssValue("font-size"));
		String fontColor = text.getCssValue("color"); 
		  System.out.println("Font Color -> "+fontColor); 
		System.out.println(text.getCssValue("text-align"));
		System.out.println(text.getSize());
	}

}
