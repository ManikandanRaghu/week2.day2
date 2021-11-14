package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
			
		//Click on Create Account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Fill the form
		driver.findElement(By.name("firstname")).sendKeys("Mike");
		driver.findElement(By.name("lastname")).sendKeys("Madison");
		driver.findElement(By.id("u_6_g_g3")).sendKeys("9856472130");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@321");

		//Selecting Date of Birth
		WebElement drp1 = driver.findElement(By.id("day"));
		Select day = new Select(drp1);
		day.selectByVisibleText("4");
		WebElement drp2 = driver.findElement(By.id("month"));
		Select month = new Select(drp2);
		month.selectByVisibleText("Jul");
		WebElement drp3 = driver.findElement(By.id("year"));
		Select year = new Select(drp3);
		year.selectByVisibleText("2003");
		
		//Select Gender
		driver.findElement(By.id("u_6_3_mO")).click();
		
		//Click on Sign up button
		driver.findElement(By.id("u_6_s_uR")).click();
		
		//Display Text
		String fname = driver.findElement(By.id("u_6_b_ZP")).getText();
		System.out.println("Entered First name is: "+fname);
		String lname = driver.findElement(By.id("u_6_d_gU")).getText();
		System.out.println("Entered Last name is: "+lname);
		String mob = driver.findElement(By.id("u_6_g_g3")).getText();
		System.out.println("Entered Mobile nunber is: "+mob);
		System.out.println("Entered DOB is: "+day+"/"+month+"/"+year);
		System.out.println("Entered Gender is: Male");
		
		driver.close();

	}

}
