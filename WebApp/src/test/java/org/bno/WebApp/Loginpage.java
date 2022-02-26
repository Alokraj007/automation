package org.bno.WebApp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Loginpage extends Base {
	
	@Test
	public void loginFormCheck() throws IOException, InterruptedException
	{
		driver = initilizeBrowser();
		driver.get(prop.getProperty("url")); 
		Cookie name = new Cookie("CookieInformationConsent", "%7B%22website_uuid%22%3A%22c1aa6f40-bbfe-4e2e-a82b-b8dcc3a0d380%22%2C%22timestamp%22%3A%222021-05-31T09%3A37%3A17.257Z%22%2C%22consent_url%22%3A%22https%3A%2F%2Fuat.bang-olufsen.com%2Fen%22%2C%22consent_website%22%3A%22beoecommercefrontenduat.azurewebsites.net%22%2C%22consent_domain%22%3A%22uat.bang-olufsen.com%22%2C%22user_uid%22%3A%22010b8f0e-6699-4014-9741-75c26eb0a988%22%2C%22consents_approved%22%3A%5B%22cookie_cat_necessary%22%2C%22cookie_cat_functional%22%2C%22cookie_cat_statistic%22%2C%22cookie_cat_marketing%22%2C%22cookie_cat_unclassified%22%5D%2C%22consents_denied%22%3A%5B%5D%2C%22user_agent%22%3A%22Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F90.0.4430.212%20Safari%2F537.36%22%7D");
		driver.manage().addCookie(name);
		driver.navigate().refresh();
		Assert.assertEquals(driver.getCurrentUrl(), "https://uat.bang-olufsen.com/en/us");
		HomePage hp = new HomePage(driver);
		hp.getlogInIconBtn().click();
		LoginPage lp = new LoginPage(driver);
		lp.getlogIn().sendKeys("alok.raj1@publicissapient.com");
		lp.getpassword().sendKeys("Tendulkar@1234");
		lp.getlogInBtn().click();
		String errmsg = lp.geterrorMsg().getText();
		Assert.assertEquals(errmsg, "We could not log you in. Please check that your email and password is correct");
		driver.close();		
		
	}
	
}
