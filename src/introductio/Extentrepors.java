package introductio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrepors {
	 ExtentReports extent;
	@BeforeTest

	public void extentConfig() {
		
		
	   String path=System.getProperty("user.dir")+"\\reports\\index.html";
	   ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	   reporter.config().setReportName("Web Automation");
	   reporter.config().setDocumentTitle("Test Reasults");
	   
	   extent= new ExtentReports();
	   extent.attachReporter(reporter);
	   extent.setSystemInfo("Tester","Gyanendra");
	}
	
	@Test
	
	public void testdemo() {
		extent.createTest("test Demo");
        System.setProperty("webdriver.chrome.driver","C:\\New folder (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		extent.flush();
		
		
	}
}
