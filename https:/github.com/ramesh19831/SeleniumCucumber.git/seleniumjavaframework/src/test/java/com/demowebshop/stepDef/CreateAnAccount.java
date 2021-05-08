package com.demowebshop.stepDef;

import org.testng.Assert;

import com.demowebshop.pages.RegisterPage;
import com.demowebshop.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAnAccount extends TestBase{

	RegisterPage registerPage;
	@Given("^I want navigates to demo web shop Url \"([^\"]*)\"$")
	public void i_want_navigates_to_demo_web_shop_Url(String arg1) throws Throwable {
		
		try {
			invoke();
			 registerPage = new RegisterPage(driver);
			 test = extent.startTest("TC01_VerifyDemowebShopRegisterWithValidData");
		} catch (Exception e) {
			e.printStackTrace();
		}
		    
	}

	@Then("^User verify  Title of the home Page \"([^\"]*)\"$")
	public void user_verify_Title_of_the_home_Page(String arg1) throws Throwable {
		String actualTitle = registerPage.getTitle();
		Assert.assertEquals(actualTitle, arg1);
	    
	}

	@When("^I Click  Register link$")
	public void i_Click_Register_link() throws Throwable {
	    registerPage.clickRegisterLink();
	    
	}

	@Then("^I verify  title of register page \"([^\"]*)\"$")
	public void i_verify_title_of_register_page(String arg1) throws Throwable {
		String regTitle= registerPage.getTitle();
		Assert.assertEquals(regTitle, arg1);
	    
	}

	@Then("^I verify  register lable \"([^\"]*)\"$")
	public void i_verify_register_lable(String arg1) throws Throwable {
	    
	    String reglbl = registerPage.getRegisterLabletext();
	    Assert.assertEquals(reglbl, arg1);
	}

	@When("^I Click  Gender Radio button \"([^\"]*)\"$")
	public void i_Click_Gender_Radio_button(String arg1) throws Throwable {
	    registerPage.clickGenderMale();
	    
	}

	@When("^I Enter  FirstName \"([^\"]*)\"$")
	public void i_Enter_FirstName(String arg1) throws Throwable {
	    registerPage.EnterFirstName(arg1);
	    
	}

	@When("^I Enter  LastName \"([^\"]*)\"$")
	public void i_Enter_LastName(String arg1) throws Throwable {
	    
	    registerPage.EnterLastName(arg1);
	}

	@When("^I Enter  Email \"([^\"]*)\"$")
	public void i_Enter_Email(String arg1) throws Throwable {
	    registerPage.EnterEmail();
	    
	}

	@When("^I Enter  Password \"([^\"]*)\"$")
	public void i_Enter_Password(String arg1) throws Throwable {
	    
	    registerPage.EnterPassword(arg1);
	}

	@When("^I Enter  Confirm Password \"([^\"]*)\"$")
	public void i_Enter_Confirm_Password(String arg1) throws Throwable {
	    
	    registerPage.EnterConfirmPassword(arg1);
	}

	@When("^I Click  register button$")
	public void i_Click_register_button() throws Throwable {
	    
	    registerPage.clickRegisterbtn();
	}

	@Then("^I Verify  successfulll message \"([^\"]*)\"$")
	public void i_Verify_successfulll_message(String arg1) throws Throwable {
	    String actualtext = registerPage.getRegisterSuccessmsg();
	    Assert.assertEquals(actualtext, arg1);
		extent.flush();
		extent.endTest(test);
		driver.close();
		driver.quit();
	}

}
