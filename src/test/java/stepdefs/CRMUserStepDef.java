package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class CRMUserStepDef extends TestBase{
	LoginPage loginpage;
	
	@Before
	public void setup() {
		initialize();
		loginpage=new LoginPage();
	}
	
	
	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		String pageTitle=loginpage.getPageTitle();
		Assert.assertEquals("Cogmento CRM", pageTitle);
	    
	}
	
	  @When("User enters credentials") 
	  public void user_enters_credentials(DataTable userCreds) { 
		  List<Map<String,String>> user=userCreds.asMaps();
		 String strUser=user.get(0).get("username");
		 String strPwd=user.get(0).get("password");
		 loginpage.login(strUser, strPwd);
	  }
	 
	
	@Then("Should display home page")
	public void should_display_home_page() {
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		TestBase.driver.close();
	}

}
