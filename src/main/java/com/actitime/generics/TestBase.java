package com.actitime.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	 public TestBase()  {
			
		try {
			 prop= new Properties();
			 FileInputStream 	fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\actitime\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (IOException e) {
				e.printStackTrace();
			
		}
		
		
		
	}
@BeforeClass
public void setup(){
	String url=prop.getProperty("url");
	driver= new FirefoxDriver();
	driver.get(url);
}

//@BeforeMethod
//public void openurl(){
//	String url=prop.getProperty("url");
//	driver.get(url);
//}
@AfterClass
public void closeBrowser(){
	driver.close();
}
}
