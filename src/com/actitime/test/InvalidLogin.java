package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.page.LoginPage;

import generic.BaseTest;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testInvalidLogin() {
		LoginPage l = new LoginPage(driver);
				l.setUserName("Rahul");
				l.setPassword("Pandey");
				l.clickLogin();
				l.verifyErrMsgIsDisplayed();
	}
}
