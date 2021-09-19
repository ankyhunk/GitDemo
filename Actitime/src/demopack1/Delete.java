package demopack1;

import java.util.concurrent.TimeUnit;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete {

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
		driver.findElement(By.xpath("//input[@placeholder='Start typing name ...'][1]")).sendKeys("prathap");
		WebElement token=driver.findElement(By.xpath("//span[@class='highlightToken']"));
		Actions act=new Actions(driver);
		act.moveToElement(token).perform();		
		WebElement settings=driver.findElement(By.xpath("//span[text()='prathap']/../../..//div[@class='editButton']"));
		act.moveToElement(settings).perform();
		settings.click();
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();

	}

}
