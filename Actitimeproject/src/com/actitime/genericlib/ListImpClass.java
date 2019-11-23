package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass {
	public class ListImpclass implements ITestListener{
		
		public void OnTestFailure(ITestResult result){
			String CurrentDate=new Date().toString().replace(";", "_").replace(" ", "_");
			String failedtestname=result.getMethod().getMethodName();
			System.out.println("===FAIL====="+failedtestname);
			EventFiringWebDriver eDriver= new EventFiringWebDriver(BaseClass.driver);
			File srcfile=eDriver.getScreenshotAs(OutputType.FILE);
			File dstfile=new File("./screenshot/"+failedtestname+"_"+CurrentDate+".png");
			try
			{
				FileUtils.copyFile(srcfile, dstfile);
			}
			catch(IOException e){
		}

}

		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
