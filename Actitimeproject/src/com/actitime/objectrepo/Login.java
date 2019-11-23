package com.actitime.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
@FindBy(name="username")
private WebElement useredt;
@FindBy(name="pwd")
private WebElement passwordedt;
@FindBy(id="loginButton")
private WebElement loginbtn;
public WebElement getUseredt() {
	return useredt;
}
public WebElement getPasswordedt() {
	return passwordedt;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public void LoginToApp(String username, String password)
{
	useredt.sendKeys(username);
	passwordedt.sendKeys(password);
	loginbtn.click();
}
}
