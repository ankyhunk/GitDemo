package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class CreateCustomer extends BaseClass{
	@Test
	public void testCreateCustomer() {
		driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();

		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("ankur");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("this is test desc");
		driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
		System.out.println("Hello");
	}
}
