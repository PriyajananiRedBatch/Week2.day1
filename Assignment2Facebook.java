package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Veda");
		driver.findElement(By.name("lastname")).sendKeys("valli");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9980899909");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Itsgr8*");
		
		WebElement drop1 = driver.findElement(By.id("day"));
		Select drpDown1 = new Select(drop1);
		drpDown1.selectByVisibleText("7");
		
		WebElement drop2 = driver.findElement(By.id("month"));
		Select drpDown2 = new Select(drop2);
		drpDown2.selectByValue("4");
		
		WebElement drop3 = driver.findElement(By.id("year"));
		Select drpDown3 = new Select(drop3);
		drpDown3.selectByVisibleText("1980");
		
		//driver.findElement(By.xpath("//input[@name='sex']['1']")).click();
		
		driver.findElement(By.name("sex")).click();
		
		
	}

}
