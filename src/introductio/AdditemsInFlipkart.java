package introductio;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdditemsInFlipkart {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("gyanendra.prasad15@gmail.com");
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("balaramdash");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("754215");
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys(Keys.ENTER);
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@alt='Staples']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Atta & Flours']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Wheat Atta']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Wheat Atta']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Search grocery products']")).sendKeys("Biscuits");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.cssSelector("button[class='_2KpZ6l GX4Kov']")).click();
		 //int j =0;
		 
		 //String [] itemsneeded = {"Lotte Chocopie Cream Sandwich","BRITANNIA Gold Marie Biscuit"};
		
	   // List<WebElement> products = driver.findElements(By.xpath("//*[@class='_1MbXnE']"));
	   
	    
	    // for (int i=0;i<products.size();i++)
	
	     //{
	    	 
	   //  String name=products.get(i).getText();
	     
	    // List<String> itemsneededlist = Arrays.asList(itemsneeded);
	     
	     // if(itemsneededlist.contains(name))
	    	 
	    // {
	    
		//driver.findElements(By.xpath("//button[@class='_2KpZ6l GX4Kov']")).get(i).click();
		//Thread.sleep(1000);
	      // if (j==itemsneeded.length);
	     //  break;
	    // }
	     
	     }
	
	     }
	     
	//}

