package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("prathap");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("this is test desc");
		driver.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
	}


}

