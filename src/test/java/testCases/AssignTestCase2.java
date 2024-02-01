package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.AmazonPage;
import pageObjects.ReviewPage;
import testBase.BaseClass;

public class AssignTestCase2 extends BaseClass{
	
	
	@Test
	void reviewPageTest()
	{		
		ReviewPage rp=new ReviewPage(driver);
		
		//search for "clube Mahindra"
		rp.enterText(p.getProperty("searchTextName"));
		rp.clickSearch();
		rp.clickText();
		rp.clickReview();
	}
}
