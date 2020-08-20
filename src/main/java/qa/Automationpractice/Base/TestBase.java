package qa.Automationpractice.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	

		public TestBase()
		{
			try{
				
				prop = new Properties();
				FileInputStream ip = new FileInputStream("F:\\New folder\\Selenium_Demo_Test\\src\\main\\java\\qa\\Automationpractice\\config\\config.properties");
				prop.load(ip);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}

		
		public void initialization()
		{
			
		String browserName = prop.getProperty("browser"); // getting the browsername from config.properties file
		
		// Intializing the chrome browser
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
		{
			System.out.println("No browser found");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		
		
		}
		
		public void scroll()
		{
			((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		}


}
