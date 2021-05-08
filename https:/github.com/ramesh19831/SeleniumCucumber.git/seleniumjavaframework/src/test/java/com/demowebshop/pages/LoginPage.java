package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demowebshop.testBase.TestBase;

public class LoginPage extends TestBase{

	WebDriver driver;
	
	//page Objects
	By loginlink = By.xpath("//*[@class='ico-login']");
	By loginbtn = By.cssSelector("input.button-1.login-button");
	By emailtxt = By.id("Email");
	By pwdtxt = By.id("Password");
	
	//names of elements
	String loginlinknm = "Login";
	String loginbuttonnm ="Login button";
	String emailnm = "Email address";
	String pwdnm = "Password";
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
	}

	
	public void clickLogin() {
		click(driver, loginlink, loginlinknm);
	}
	
	public void clickLoginButton() {
		click(driver, loginbtn, loginbuttonnm);
	}
	
	public void EnterEmailAddress(String email) {
		type(driver, emailtxt, email, emailnm);
	}
	
	public void EnterPassword(String password) {
		type(driver, pwdtxt, password, pwdnm);
	}
}
