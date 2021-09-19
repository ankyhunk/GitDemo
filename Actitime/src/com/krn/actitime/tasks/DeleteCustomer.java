package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class DeleteCustomer extends BaseClass {
	@Test
	public void testDeleteCustomer() {
		driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys("ankur");
		WebElement token=driver.findElement(By.xpath("//span[@class='highlightToken']"));
		Actions act=new Actions(driver);
		act.moveToElement(token).perform();		
		WebElement settings=driver.findElement(By.xpath("//span[text()='ankur']/../../..//div[@class='editButton']"));
		act.moveToElement(settings).perform();
		settings.click();
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	}
}
