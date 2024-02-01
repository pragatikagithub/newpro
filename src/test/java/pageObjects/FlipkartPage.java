package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPage extends BasePage{

	public FlipkartPage(WebDriver driver)
	{
		super(driver);
	}
	


@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")  //For Search Product Test
WebElement txtSearchbox;

@FindBy(xpath="//button[@title='Search for Products, Brands and More']//*[name()='svg']") //For Search Product Test
WebElement btnSearch;



@FindBy(xpath="//div[contains(text(),'₹52,999')]")

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
