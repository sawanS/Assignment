import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Automationpractice.Base.TestBase;

public class signUpTest extends TestBase {

	
	signUpPage signup;
	
	public signUpTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{	
		initialization();// calling initilization method from the Login class
		signup = new signUpPage();
		signup.scroll();
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
