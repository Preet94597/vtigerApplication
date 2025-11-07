package practice_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromCmdLine_Test {

	@Test
	public void readDataFromCmdLine1_Test()
	{
		
		System.out.println("---- print ----");
		
		
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");

		System.out.println(URL);
		System.out.println(BROWSER);
		
		
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}


	@Test
	public void readDataFromCmdLine2_Test()
	{
		
		System.out.println("---- print 2----");
		
		
		
		
	}
	

	@Test
	public void readDataFromCmdLine3_Test()
	{
		
		System.out.println("---- print ----");
		
		
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");

		System.out.println(URL);
		System.out.println(BROWSER);
		
		
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}
	}

