package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{

	public ReviewPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"lithium-root\"]/main/div[4]/div/div/div[2]/div/form/div/div/input")  //For Search text
	WebElement txtSearchbox;

	@FindBy(xpath="//button[@title='Search']//*[name()='svg']") //click button
	WebElement btnSearch;
	
	@FindBy(xpath="//div[@class='location-meta-block']//span[normalize-space()='Club Mahindra Madikeri, Coorg']")
	WebElement txtLink;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]/div[1]/div[1]")
	WebElement reviewLink;
	
	public void enterText(String tName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(tName);
	}

	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
	
	public void clickText()  //For Search Product Test
	{
		txtLink.click();
	}
	
	public void clickReview()  //For Search Product Test
	{
		reviewLink.click();
	}
}
