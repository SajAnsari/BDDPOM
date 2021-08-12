package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//WebDriver driver;
	//WebElements
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	//Actions
	public LoginPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	public String getPageTitle() {
		return TestBase.driver.getTitle();
	}
	
	public void login(String strUser, String strPwd) {
		uname.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}

}
