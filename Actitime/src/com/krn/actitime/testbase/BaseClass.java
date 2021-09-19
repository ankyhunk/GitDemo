package com.krn.actitime.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
  @BeforeClass
  public void openBrowser() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com");
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  }
  @BeforeMethod
  public void login() {
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
  @AfterMethod
  public void logout() {
	  driver.findElement(By.id("logoutLink")).click();	
  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
