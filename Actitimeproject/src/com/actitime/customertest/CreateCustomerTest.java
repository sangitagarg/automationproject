package com.actitime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileLibClass;
import com.actitime.objectrepo.ActiveProjAndCustomer;
import com.actitime.objectrepo.CreateCustomer;
import com.actitime.objectrepo.Home;
import com.actitime.objectrepo.OpenTask;

public class CreateCustomerTest extends BaseClass {
@Test
public void createcustomertest() throws Throwable{
	String Customername=FileLibClass.getexceldata("sheet1", 1, 2);
	Home hp=PageFactory.initElements(driver, Home.class);
	hp.getTaskimg().click();
	OpenTask op=PageFactory.initElements(driver, OpenTask.class);
	op.getProjectandcustomer().click();
	ActiveProjAndCustomer apc=PageFactory.initElements(driver, ActiveProjAndCustomer.class);
	apc.getCreatenewcustomerbtn().click();
	CreateCustomer cc=PageFactory.initElements(driver, CreateCustomer.class);
	cc.createcustomer(Customername);
	String actmsg=apc.getCustomersucessmsg().getText();
	boolean stat=actmsg.contains("successfully created");
	Assert.assertTrue(stat);
}
}
