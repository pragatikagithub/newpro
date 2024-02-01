package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonPage;
import pageObjects.FlipkartPage;


public class AssignTestcase1 
{
	public WebDriver driver;
	public Properties p;

	@Test
	 public void testProductPrice() throws IOException 
	{		
		//loading properties file
		p=new Properties(); 
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p.load(file);
		
		//open the amazonpage on browser
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("appURL1"));
		driver.manage().window().maximize();
		
		AmazonPage hm=new AmazonPage(driver);
		
		//hm.enterProductName("iApple iPhone 13 (Blue, 128 GB)");
		hm.enterProductName(p.getProperty("searchProductName"));
		hm.clickSearch();
		String amazonPrice=hm.checkPriceTag();
		System.out.println("The Price of iPhone on Amazon: "+amazonPrice);
		int amazon_iPhone=Integer.parseInt(amazonPrice.replace(",",""));
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//open the flipkartpage on browser
		driver.get(p.getProperty("appURL2")); 
		driver.manage().window().maximize();
		
		FlipkartPage fm=new FlipkartPage(driver);
		
		//fm.enterProductName("iApple iPhone 13 (Blue, 128 GB)");
		fm.enterProductName(p.getProperty("searchProductName"));
		fm.clickSearch();
		String flipkartPrice=fm.checkPriceTag();
		System.out.println("The Price of iPhone on Flipkart: " +flipkartPrice);
		int  flipkart_iPhone=Integer.parseInt(flipkartPrice.replace("₹","").replace(",",""));
		
		if(amazon_iPhone < flipkart_iPhone)
		{
			System.out.println("The Amazon iPhone price is less. ");
		}
		else
		{
			System.out.println("The Flipkart iPhone price is less.");
		}
		
		driver.quit();
	}
}
