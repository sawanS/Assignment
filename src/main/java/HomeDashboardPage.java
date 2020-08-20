import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.Automationpractice.Base.TestBase;

public class HomeDashboardPage extends TestBase {
	
	Loginpage login;
	HomeDashboardPage home;
	Actions action;
	
	@FindBy(xpath="//a[text()='Women']") WebElement womenlink ;
	@FindBy(xpath="//a[@title='Blouses']") WebElement blouselink ;
	@FindBy(xpath="//a[@class='product-name' and @itemprop='url']") WebElement block ;
	@FindBy(xpath="//span[text()='More']") WebElement morebutton ;
	@FindBy(xpath="//span//i[@class='icon-plus']") WebElement plusicon ;
	
	@FindBy(xpath="//span[text()='Add to cart']") WebElement addtocart ;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']") WebElement proceed ;
	@FindBy(xpath="//span[text()='$56.00' and @id='total_price']") WebElement price ;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']") WebElement proceedtocheckout ;
	@FindBy(xpath="//span[text()='Proceed to checkout']") WebElement proceedtocheckoutfinal ;
	@FindBy(xpath="//input[@type='checkbox']") WebElement terms ;
	@FindBy(xpath="//button[@type='submit' and @class='button btn btn-default standard-checkout button-medium']") WebElement fproceed ;
	
	@FindBy(xpath="//a[@class='bankwire']") WebElement payment ;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']") WebElement confirmorder ;
	@FindBy(xpath="//div//p//strong[@class='dark']") WebElement confirmationorder ;
	
	
	@FindBy(xpath="//span[text()='sawan sharma']") WebElement profile;
	@FindBy(xpath="//span[text()='Order history and details']") WebElement orderhistory;
	@FindBy(xpath="//td[@class='history_price']") WebElement historyprice;
	
	
	
	
	
	
	
	public HomeDashboardPage()
	{
		PageFactory.initElements(driver, this); 

	}

	
	public HomeDashboardPage addToCart() throws Exception
	
	
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		womenlink.isDisplayed();
			 action = new Actions(driver);
			action.moveToElement(womenlink).build().perform();
		
		
		
		
		blouselink.click();
		
		//home.scroll();
		
		action.moveToElement(block).build().perform();;
		morebutton.click();
		plusicon.click();
		addtocart.click();
		proceed.click();
		
		if(price.equals("$56.00"))
		{
			System.out.println("Price Validated");
		}
		else
		{
			System.out.println("Price is not matched");
		}
		
		proceedtocheckout.click();
		proceedtocheckoutfinal.click();
		terms.click();
		
		fproceed.click();
		payment.click();
		confirmorder.click();
		
		String text = confirmationorder.getText();
		if(text.contains("Your order on My Store is complete."))
		{
			System.out.println("Order is completed");
		}
		else
			
		{
			System.out.println("Order is incomplete");
		}
		
		return new HomeDashboardPage();
		
		
		
	}
	
	public void verifyprice()
	{
		profile.click();
		orderhistory.click();
		String text = historyprice.getText();
		
		if(text.equals("$56.00"))
		{
			System.out.println("Price is validated");
		}
		else
		{
			System.out.println("Price is not validated");
		}
	}
	
	
	
}
