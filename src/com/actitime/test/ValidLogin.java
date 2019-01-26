package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.page.LoginPage;

import generic.BaseTest;

public class ValidLogin extends BaseTest {
	@Test
	public void testValidLogin() {
	LoginPage l = new LoginPage(driver);
	l.setUserName("admin");
	l.setPassword("manager");
	l.clickLogin();
	//verify home page is displayed
	//EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	//e.verifyTitle("actiTIME - Enter Time-Track");

	
}
}
