package com.actitime.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {
	@FindBy(name="name")
	private WebElement customernameedt;
	@FindBy(name="createCustomerSubmit")
	private WebElement createcustomerbtn;
	@FindBy(name="description")
	private WebElement createdescedt;
	public WebElement getCustomernameedt() {
		return customernameedt;
	}
	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}
	public void createcustomer(String customername){
		customernameedt.sendKeys(customername);
		createcustomerbtn.click();
		}
	
}
