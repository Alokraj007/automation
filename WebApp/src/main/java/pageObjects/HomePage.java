package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	//*-----countrySelectorCheck--------//
	
	By countrySelector = By.id("lang-locale-display");
	
	By regionSelectorEurope = By.xpath("//ul[@class='country-region-list']/li  //button[text()='Europe']");
	
	By countryDanmarkLocaleEng = By.xpath("//*[text()='Danmark']/following-sibling::div/ul/li[2]");
	
	//-----countrySelectorCheck--------*//
	
	//*---------geth1title------------//
	
	By h1title = By.xpath("//*[text()='The portable sound edit']");
	
	//*---------geth1title------------//

	By logInIconBtn = By.xpath("//*[@class='profile-btn-wrapper']");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement countrySelector()
	{
		return driver.findElement(countrySelector);
	}
	
	public WebElement regionSelectorEurope()
	{
		return driver.findElement(regionSelectorEurope);
	}
	
	public WebElement countryDanmarkLocaleEng()
	{
		return driver.findElement(countryDanmarkLocaleEng);
	}
	
	public WebElement geth1title()
	{
		return driver.findElement(h1title);
	}
	public WebElement getlogInIconBtn()
	{
		return driver.findElement(logInIconBtn);
	}
	
}
