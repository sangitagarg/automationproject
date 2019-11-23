package com.actitime.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectandcustomer;

	public WebElement getProjectandcustomer() {
		return projectandcustomer;
	}
	

}
