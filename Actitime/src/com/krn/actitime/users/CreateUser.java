package com.krn.actitime.users;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class CreateUser extends BaseClass{
	@Test
	public void testCreateUser() {
		driver.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Ankur");
		driver.findElement(By.xpath("//input[@id='createUserPanel_middleNameField']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("ankyhunk@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	}
}
