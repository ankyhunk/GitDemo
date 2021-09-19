package com.krn.actitime.users;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class DeleteUser extends BaseClass{
	@Test
	public void testDeleteUser() {
		driver.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ankur')]")).click();
		driver.findElement(By.xpath("//div[text()='DELETE']")).click();
		driver.switchTo().alert().accept();
	}
}
