package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateUser {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Ankur");
		driver.findElement(By.xpath("//input[@id='createUserPanel_middleNameField']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("ankyhunk@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	}

}
