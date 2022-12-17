package introductio;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
        driver.findElement(By.cssSelector(".login-wrapper-footer-text")).click();
        driver.findElement(By.id("firstName")).sendKeys("Gyanendra");
        driver.findElement(By.id("lastName")).sendKeys("Dash");
        driver.findElement(By.id("userEmail")).sendKeys("gyanendra.prasad15@gmail.com"); 
        driver.findElement(By.id("userMobile")).sendKeys("9090326974");
        driver.findElement(By.id("userPassword")).sendKeys("Babana@326974");
        driver.findElement(By.id("confirmPassword")).sendKeys("Babana@326974");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.id("login")).click();
        
        
		}	


	}


	
