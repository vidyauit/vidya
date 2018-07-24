package com.actitime.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generics.TestBase;
import com.acttime.pages.LoginActiTime;

public class TC_01_LoginTest extends TestBase {
LoginActiTime loginactitime ;
public TC_01_LoginTest() {
	
}
@Test
public void loginTest() throws InvalidFormatException, IOException, Throwable{
	loginactitime = new LoginActiTime();
	loginactitime.loginActiTime();
	loginactitime.createCustomer();
	
}
//@Test
//public void createCustomer(){
//	//loginactitime = new LoginActiTime();
//	//loginactitime.loginActiTime();
//	loginactitime.createCustomer();
//}
}
