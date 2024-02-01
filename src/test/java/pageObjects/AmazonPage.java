package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class AmazonPage extends BasePage{

	public AmazonPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")  //For Search Product Test
	WebElement txtSearchbox;

	@FindBy(xpath="//input[@id='nav-search-submit-button']") //For Search Product Test
	WebElement btnSearch;

	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/div[1]/a/span/span[2]/span[2]")
	
	WebElement PriceTag;

public void enterProductName(String pName)   //For Search Product Test
{
	txtSearchbox.sendKeys(pName);
}

public void clickSearch()  //For Search Product Test
{
	btnSearch.click();
}

public String checkPriceTag()
{
 return PriceTag.getText();
}
	

}
