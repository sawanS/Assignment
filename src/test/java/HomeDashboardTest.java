import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Automationpractice.Base.TestBase;

public class HomeDashboardTest extends TestBase {
	
	
	HomeDashboardPage homedashboard;
	Loginpage login;
	
	
	public HomeDashboardTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup2() throws Exception
	{	
		initialization();// calling initilization method from the Login class
		homedashboard = new HomeDashboardPage();
		login = new Loginpage();
		homedashboard = login.loginDetails(prop.getProperty("Email"), prop.getProperty("password"));
		
		//homedashboard.scroll();
	}
	
	@Test()
	public void dashboardDetailsTest() throws Exception
	{
		
		homedashboard.addToCart();
		homedashboard.verifyprice();
	}


	
	
	@AfterMethod
	public void closebrowser()
	{
	driver.quit();
	}
	
}
