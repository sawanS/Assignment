import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.Automationpractice.Base.TestBase;

public class signUpTest extends TestBase {

	
	signUpPage signup;
	Loginpage login;
	HomeDashboardPage home;
	
	public signUpTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{	
		initialization();
		signup = new signUpPage();
		signup.scroll();
		//login.loginDetails(prop.getProperty("Email"), prop.getProperty("password"));

		
	}
	
	
	
	@Test()
	public void signUpdetailstest() throws Exception
	{
		signup.signUpDetails(prop.getProperty("Zipcode"), prop.getProperty("Email"), prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("password"), 
				prop.getProperty("address"), prop.getProperty("city"), prop.getProperty("MobilePhone"), prop.getProperty("ReferenceAddress"));
	
		
	
	}
	
	

	
	@AfterMethod
	public void closebrowser()
	{
	driver.quit();
	}
	
	
	
	
}
