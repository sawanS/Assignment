import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Automationpractice.Base.TestBase;

public class Loginpage extends TestBase {
	
	public static Loginpage login;
	
	@FindBy(xpath="//input[@id='email']") WebElement loginemail;
	@FindBy(xpath="//input[@id='passwd']") WebElement loginpass;
	@FindBy(xpath="//button[@id='SubmitLogin']") WebElement loginbutton;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this); 
		

	}
	
	public HomeDashboardPage loginDetails(String un, String pass) throws Exception
	{
		loginemail.sendKeys(un);
		loginpass.sendKeys(pass);
		loginbutton.click();
		
		Thread.sleep(3000);
		return new HomeDashboardPage();
		
		//return new HomeDashboardPage();
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
