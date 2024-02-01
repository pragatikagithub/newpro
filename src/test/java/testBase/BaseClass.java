package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void setup() throws IOException
	{

		//loading properties file
		p=new Properties();
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p.load(file);
		
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		 driver.get(p.getProperty("appURL3"));
		 driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();;
	}
}