import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Automationpractice.Base.TestBase;

public class LoginPageTest extends TestBase {
	
	Loginpage loginpage;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup1()
	{	
		initialization();// calling initilization method from the Login class
		loginpage = new Loginpage();
		loginpage.scroll();
	}
	
	@Test()
	public void logindetailstest() throws Exception
	{
		loginpage.loginDetails(prop.getProperty("Email"), prop.getProperty("password"));
		
	}


	
	
	@AfterMethod
	public void closebrowser()
	{
	driver.quit();
	}
	

}
