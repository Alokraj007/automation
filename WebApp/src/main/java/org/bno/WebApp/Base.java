package org.bno.WebApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	@SuppressWarnings("deprecation")
	public WebDriver initilizeBrowser() throws IOException {
				
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\alok\\WebApp\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
	                "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.edge.driver",
	                "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     	return driver;
	}

}
