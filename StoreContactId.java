package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreContactId {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Find Contacts and search using name
		driver.findElement(By.linkText("Find Contacts")).click();
				
		
		//Clicking on Firstname tab using XPATH
		//driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name='firstName']")).sendKeys("Manikandan");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("Contact Id is: "+text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.close();
	}

}
