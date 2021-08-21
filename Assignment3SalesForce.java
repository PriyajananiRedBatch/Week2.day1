package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Kavitha");
		driver.findElement(By.name("UserLastName")).sendKeys("Raghunathan");
		driver.findElement(By.name("UserEmail")).sendKeys("kavitha@zohomail.com");
		
		WebElement drop1 = driver.findElement(By.name("UserTitle"));
		Select drpDown1 = new Select(drop1);
		drpDown1.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Intellect Incorp");
		
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDown2 = new Select(drop2);
		drpDown2.selectByIndex(2);
		
		driver.findElement(By.name("UserPhone")).sendKeys("8800090909");
		
		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select drpDown3 = new Select(drop3);
		drpDown3.selectByVisibleText("Germany");
		
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
		
		
		
		
		
	}

}
