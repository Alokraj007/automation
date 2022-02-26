package org.bno.WebApp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class Homepage extends Base {
	
	@Test
	public void countrySelectorCheck() throws IOException
	{
		driver = initilizeBrowser();
		driver.get("https://uat.bang-olufsen.com/en/us"); 
		Cookie name = new Cookie("CookieInformationConsent", "%7B%22website_uuid%22%3A%22c1aa6f40-bbfe-4e2e-a82b-b8dcc3a0d380%22%2C%22timestamp%22%3A%222021-05-31T09%3A37%3A17.257Z%22%2C%22consent_url%22%3A%22https%3A%2F%2Fuat.bang-olufsen.com%2Fen%22%2C%22consent_website%22%3A%22beoecommercefrontenduat.azurewebsites.net%22%2C%22consent_domain%22%3A%22uat.bang-olufsen.com%22%2C%22user_uid%22%3A%22010b8f0e-6699-4014-9741-75c26eb0a988%22%2C%22consents_approved%22%3A%5B%22cookie_cat_necessary%22%2C%22cookie_cat_functional%22%2C%22cookie_cat_statistic%22%2C%22cookie_cat_marketing%22%2C%22cookie_cat_unclassified%22%5D%2C%22consents_denied%22%3A%5B%5D%2C%22user_agent%22%3A%22Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F90.0.4430.212%20Safari%2F537.36%22%7D");
		driver.manage().addCookie(name);
		driver.navigate().refresh();
		Assert.assertEquals(driver.getCurrentUrl(), "https://uat.bang-olufsen.com/en/us");
		//System.out.println(driver.getCurrentUrl());
		/*
		driver.findElement(By.id("lang-locale-display")).click();
		*/
		HomePage hp = new HomePage(driver);	
		hp.countrySelector().click();
		hp.regionSelectorEurope().click();
		//Thread.sleep(5000);
		hp.countryDanmarkLocaleEng().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://uat.bang-olufsen.com/en/dk");
		//System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
	}
	
	@Test
	public void geth1title() throws IOException 
	{
		driver = initilizeBrowser();
		driver.get("https://uat.bang-olufsen.com/en/us"); 
		Cookie name = new Cookie("CookieInformationConsent", "%7B%22website_uuid%22%3A%22c1aa6f40-bbfe-4e2e-a82b-b8dcc3a0d380%22%2C%22timestamp%22%3A%222021-05-31T09%3A37%3A17.257Z%22%2C%22consent_url%22%3A%22https%3A%2F%2Fuat.bang-olufsen.com%2Fen%22%2C%22consent_website%22%3A%22beoecommercefrontenduat.azurewebsites.net%22%2C%22consent_domain%22%3A%22uat.bang-olufsen.com%22%2C%22user_uid%22%3A%22010b8f0e-6699-4014-9741-75c26eb0a988%22%2C%22consents_approved%22%3A%5B%22cookie_cat_necessary%22%2C%22cookie_cat_functional%22%2C%22cookie_cat_statistic%22%2C%22cookie_cat_marketing%22%2C%22cookie_cat_unclassified%22%5D%2C%22consents_denied%22%3A%5B%5D%2C%22user_agent%22%3A%22Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F90.0.4430.212%20Safari%2F537.36%22%7D");
		driver.manage().addCookie(name);
		driver.navigate().refresh();
		Assert.assertEquals(driver.getCurrentUrl(), "https://uat.bang-olufsen.com/en/us");
		HomePage hp = new HomePage(driver);
		Assert.assertEquals(hp.geth1title().getText(), "The portable sound edit");
		Assert.assertTrue(hp.geth1title().isDisplayed());
		driver.close();
			
	}
	
}
