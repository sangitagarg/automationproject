package com.actitime.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjAndCustomer {
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createnewcustomerbtn;
	
	@FindBy(xpath="//input[@alue='Create New Project']")
	private WebElement createnewprojectbtn;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement customersucessmsg;
	public WebElement getCreatenewcustomerbtn() {
		return createnewcustomerbtn;
	}
	public WebElement getCreatenewprojectbtn() {
		return createnewprojectbtn;
	}
	public WebElement getCustomersucessmsg() {
		return customersucessmsg;
	}
	

}
