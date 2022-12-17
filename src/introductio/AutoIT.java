package introductio;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\New folder (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(1000);
		 Runtime.getRuntime().exec("C:\\Users\\gyane\\OneDrive\\Desktop\\FileUpload.exe");
		 
		
	}

}
