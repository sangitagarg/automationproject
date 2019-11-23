package com.actitime.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//div[text()='Tasks']/..")
	private WebElement taskimg;
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userimg;
	@FindBy(linkText="Logout")
	private WebElement logoutlink;
	public WebElement getTaskimg() {
		return taskimg;
	}
	public WebElement getUserimg() {
		return userimg;
	}
	public void logout()
	{
		logoutlink.click();
	}
	

}
