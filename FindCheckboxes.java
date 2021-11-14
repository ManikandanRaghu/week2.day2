package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		List<WebElement> allcheck = driver.findElements(By.tagName("//input[@type='checkbox']"));
		int size = allcheck.size();
		System.out.println("Total Checkbox count is: "+size); 
	}

}
