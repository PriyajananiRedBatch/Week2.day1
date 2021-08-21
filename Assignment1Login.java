package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String title = "My Home | opentaps CRM" ;
		
		String homeTitle = driver.getTitle();
		
		if(title.equals(homeTitle)) {
			System.out.println("Yes, We have landed in the Home Page");
		}
		else
			System.out.println("Landing page is not correct");
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inswit"); 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Badri");
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDown1 = new Select(drop1);
		drpDown1.selectByIndex(2);
		
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDown2 = new Select(drop2);
		drpDown2.selectByVisibleText("Car and Driver");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("priya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("badri");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/18/85");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Prof");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("23999.75");
		
		WebElement drop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDown3 = new Select(drop3);
		drpDown3.selectByValue("INR");
		
		WebElement drop4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDown4 = new Select(drop4);
		drpDown4.selectByVisibleText("Computer Software");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
		
		WebElement drop5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDown5 = new Select(drop5);
		drpDown5.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("siccode1");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ticksymb1");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description to be entered here");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note to be input here");
		
		WebElement ccode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		ccode.clear();
		ccode.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988888999");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("999");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("trialmail@email.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Tanush");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attention");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address Line 1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address Line 2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDown6 = new Select(drop6);
		drpDown6.selectByVisibleText("California");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600078");
		
		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDown7 = new Select(drop7);
		drpDown7.selectByIndex(8);
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("444");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		
		//sectionHeaderTitle_leads
		
		String Title1 = "View Lead | opentaps CRM";
		
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		
		if(Title1.equals(Title2)) {
			System.out.println("The title of the page is: " + Title2);
		}
		else
			System.out.println("Title does not match. Wrong page.");
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println("The First Name extracted is: " + firstName);
	    
		
		
	}

}
