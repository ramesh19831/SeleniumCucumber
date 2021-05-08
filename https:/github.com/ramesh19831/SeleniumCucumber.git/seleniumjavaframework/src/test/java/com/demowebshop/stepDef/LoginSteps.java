package com.demowebshop.stepDef;

import org.testng.Assert;

import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.RegisterPage;
import com.demowebshop.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {

	RegisterPage registerPage;
	LoginPage loginPage;
	
	@Given("^User should be able to navigate to site url$")
	public void user_should_be_able_to_navigate_to_site_url() throws Throwable {
	  try {
		
		  invoke();
		  registerPage = new RegisterPage(driver);
		  loginPage = new LoginPage(driver);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	   
	}

	@Then("^I Verify the title of the home page \"([^\"]*)\"$")
	public void i_Verify_the_title_of_the_home_page(String arg1) throws Throwable {
		String actualTitle = registerPage.getTitle();
		Assert.assertEquals(actualTitle, arg1);
		
	}

	@When("^I Click on Login link$")
	public void i_Click_on_Login_link() throws Throwable {
	  
		loginPage.clickLogin();
	   
	}


@Then("^I Verify the login page Title$")
public void i_Verify_the_login_page_Title() throws Throwable {
   String title = driver.getTitle();
   Assert.assertEquals(title, "Demo Web Shop. Login");
 
}

@When("^I click login button$")
public void i_click_login_button() throws Throwable {
	loginPage.clickLogin();
 
}

@Then("^I verify the login error messages \"([^\"]*)\"$")
public void i_verify_the_login_error_messages(String arg1) throws Throwable {
   
 
}

@Then("^I Verify the error message  \"([^\"]*)\"$")
public void i_Verify_the_error_message(String arg1) throws Throwable {
   
 
}

@When("^I Enter email address in Email \"([^\"]*)\"$")
public void i_Enter_email_address_in_Email(String email) throws Throwable {
   
 loginPage.EnterEmailAddress(email);
}

@When("^I Enter the password in pwd \"([^\"]*)\"$")
public void i_Enter_the_password_in_pwd(String pwd) throws Throwable {
   
 loginPage.EnterPassword(pwd);
}

@Then("^I verify User is successfully loggedin$")
public void i_verify_User_is_successfully_loggedin() throws Throwable {
   
 loginPage.clickLoginButton();
}



}
