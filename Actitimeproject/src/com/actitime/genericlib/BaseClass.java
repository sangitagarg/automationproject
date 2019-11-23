package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepo.Home;
import com.actitime.objectrepo.Login;

public class BaseClass {
	/*Global Objects*/
	public static WebDriver driver;
    FileLibClass flib=new FileLibClass();
	@BeforeClass
	public void configBC() throws Throwable{
		System.out.println("Launch the Browser");
		/* Read Browser Name from properties file*/
		String BROWSERNAME=flib.getpropertyvalue("browser");
		if(BROWSERNAME.equals("firefox")){
			driver=new FirefoxDriver();
		}
		elseif(BROWSERNAME.equals("chrome"));
		{
			driver=new ChromeDriver();
		} elseif (BROWSERNAME.equals("ie"));{
			driver=new InternetExplorerDriver();
		} 
	}
	private void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	}
	@BeforeMethod
	public void configBM()throws Throwable{
		System.out.println("Login to Apllication");
		/* Read Url, Username, password from properties file*/
		String URL=flib.getpropertyvalue("url");
		String USERNAME=flib.getpropertyvalue("username");
		String PASSWORD=flib.getpropertyvalue("password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		/* Create an object Login POM class*/
		Login lp=PageFactory.initElements(driver, Login.class);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void configAM(){
		System.out.println("Logout");
		/* Create an Object Home POM class*/
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.logout();
	}
	@AfterClass
	public void configAC(){
		System.out.println("======CLOSE BROWSER======");
		driver.close();
	}
}
