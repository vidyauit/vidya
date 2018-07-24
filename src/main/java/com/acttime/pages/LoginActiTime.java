package com.acttime.pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.ReadExellDaaata;
import com.actitime.generics.TestBase;

public class LoginActiTime extends TestBase {
@FindBy(xpath="//input[@name='username']")
WebElement userName;
@FindBy(xpath="//input[@name='pwd']")
WebElement pwd;
@FindBy(xpath="//input[@type='submit']")
WebElement submit;
@FindBy(xpath="//div[@id='container']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td[6]/a")
WebElement clickOnProjCust;
@FindBy(xpath="//input[@value='Add New Customer']")
WebElement addCustomer;
@FindBy(xpath="//input[@name='name']")
WebElement customerName;
@FindBy(xpath="//input[@name='createCustomerSubmit']")
WebElement createCustomer;
public LoginActiTime(){
	PageFactory.initElements(driver, this);
}
public void loginActiTime(){
	String user=prop.getProperty("userName");
	System.out.println(user);
	String pwds=prop.getProperty("password");
	System.out.println(pwds);
	userName.sendKeys(user);
	pwd.sendKeys(pwds);
	submit.click();
//	clickOnProjCust.click();
//	addCustomer.click();
//	customerName.sendKeys("Ramesh");
//	createCustomer.click();
//		
}
public void createCustomer() throws InvalidFormatException, IOException, Throwable{
	ReadExellDaaata readdata= new ReadExellDaaata();
	
	clickOnProjCust.click();
	for(int i=0;i<5;i++){
	addCustomer.click();
	 String usedata = readdata.excelFileRead();
	 System.out.println(usedata);
	customerName.sendKeys(usedata);
	createCustomer.click();
	}
}

}
