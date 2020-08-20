import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.Automationpractice.Base.TestBase;

public class signUpPage extends TestBase {
	
	
	Loginpage login;
	
	@FindBy(xpath="//input[@id='email_create']") WebElement createaccount;
	@FindBy(xpath="//button[contains(.,'Create an account')]") WebElement button;
	
	
	@FindBy(xpath="//input[@id='id_gender1']") WebElement mrradiobutton;
	@FindBy(xpath="//input[@id='customer_firstname']") WebElement firstname;
	@FindBy(xpath="//input[@id='customer_lastname']") WebElement lastname;
	@FindBy(xpath="//input[@id='passwd']") WebElement password;
	@FindBy(xpath="//select[@id='days']") WebElement days;
	@FindBy(xpath="//select[@id='months']") WebElement months;
	@FindBy(xpath="//select[@id='years']") WebElement years;
	@FindBy(xpath="//input[@id='firstname']") WebElement first;
	
	@FindBy(xpath="//input[@id='lastname']") WebElement last;
	@FindBy(xpath="//input[@id='address1']") WebElement address ;
	@FindBy(xpath="//input[@id='city']") WebElement city;
	@FindBy(xpath="//select[@id='id_state']//option") List<WebElement> selectState ;
	@FindBy(xpath="//select[@id='id_country']") WebElement country ; 
	
	@FindBy(xpath="//input[@id='phone_mobile']") WebElement mobile ;
	@FindBy(xpath="//input[@id='alias']") WebElement addReference ;
	@FindBy(xpath="//button[@id='submitAccount']") WebElement Registerbutton ;
	@FindBy(xpath="//input[@id='postcode']") WebElement zipcode ;
	
	@FindBy(xpath="//ol[contains(.,'An account using this email address has already been registered. Please enter a valid password or request a new one.')]") WebElement alert ;
	
	@FindBy(xpath="//input[@id='email']") WebElement loginemail;
	@FindBy(xpath="//input[@id='passwd']") WebElement loginpass;
	@FindBy(xpath="//button[@id='SubmitLogin']") WebElement loginbutton;
	
	
	
	
	
	public signUpPage()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public HomeDashboardPage signUpDetails(String zip, String email, String fname, String lname,String paa, String add, String city1, String mo,String addref) throws Exception
	{
	
		
		createaccount.sendKeys(email);
		button.click();
		
/*		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
*/		/*Boolean text = alert.isDisplayed();
		if(Boolean.TRUE)
		{
			System.out.println("Login Successful");
			login = new Loginpage();
			login.loginDetails(prop.getProperty("Email"), prop.getProperty("password"));
		}*/
		
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					
					if(mrradiobutton.isDisplayed())
					{
						System.out.println("Able to click on radio button");
						mrradiobutton.click();
					}
					
					firstname.sendKeys(fname);
					lastname.sendKeys(lname);
					password.sendKeys(paa);
					
				
					Select select = new Select(days);
					select.selectByIndex(10);
					
					Select select1 = new Select(months);
					select.selectByIndex(5);
					
					Select select3 = new Select(years);
					select.selectByIndex(1);
					
					
					first.sendKeys(fname);
					last.sendKeys(lname);
					address.sendKeys(add);
					city.sendKeys(city1);
					
					Thread.sleep(3000);
					
					int size1 = selectState.size();
							for(int i=0;i<size1;i++)
							{
								String text1 = selectState.get(i).getText();
								if(text1.equals("Alaska"))
								{
									selectState.get(i).click();
								}
								
							}
				
				
					Select select5 = new Select(country);
					select.selectByIndex(0);
					
					
					zipcode.sendKeys(zip);
					
					mobile.sendKeys(mo);
					addReference.sendKeys(addref);
					
					
					Registerbutton.click();
					Thread.sleep(5000);
					
			
		return new HomeDashboardPage();
				
	}

}
