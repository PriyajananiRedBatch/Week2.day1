package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("priyajanani");
		driver.findElement(By.id("input-firstname")).sendKeys("Priya");
		driver.findElement(By.id("input-lastname")).sendKeys("Janani");
		driver.findElement(By.id("input-email")).sendKeys("priyajanai@yopmail.com");

		WebElement drop1 = driver.findElement(By.id("input-country"));
		Select drpDown1 = new Select(drop1);
		drpDown1.selectByVisibleText("India");

		driver.findElement(By.id("input-password")).sendKeys("Thisisgr8*");

	 }

}
