package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	//*-----loginform--------//
	
	@FindBy(id="loginForm-email") 
	WebElement logIn;
	
	@FindBy(id="loginForm-password") 
	WebElement password;
	
	@FindBy(xpath="//*[@data-sln-id='id_submit_button']") 
	WebElement logInBtn;
	
	@FindBy(xpath="//*[@class='login__error-msg']")
	WebElement errorMsg;
	
	//-----loginform--------*//
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getlogIn()
	{
		return logIn;
	}
	public WebElement getpassword()
	{
		return password;
	}
	public WebElement getlogInBtn()
	{
		return logInBtn;
	}
	
	public WebElement geterrorMsg()
	{
		return errorMsg;
	}
	
	
}
