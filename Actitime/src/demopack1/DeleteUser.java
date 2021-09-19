package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteUser {

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
		driver.findElement(By.xpath("//span[contains(text(),'Ankur')]")).click();
		driver.findElement(By.xpath("//div[text()='DELETE']")).click();
		driver.switchTo().alert().accept();
	}

}
