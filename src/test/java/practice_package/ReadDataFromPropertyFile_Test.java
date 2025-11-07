package practice_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromPropertyFile_Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data\\commondata.properties");
		
		Properties pLib = new Properties();
		pLib.load(fis);
		
		String BROWSER = pLib.getProperty("browser");
		String URL = pLib.getProperty("url");
		
		System.out.println(BROWSER+"   "+URL);
		
		
		WebDriver driver = null;
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}		
		
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
}
