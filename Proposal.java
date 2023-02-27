package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proposal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://dev140572.service-now.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.switchTo().frame(0);
		    driver.findElement(By.xpath("//input[@name='user_name' and @class='form-control']")).sendKeys("admin");
		    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("P-qQ7@umSYz8");
		    driver.findElement(By.xpath("//button[text()='Log in']")).click();
		    driver.findElement(By.id("filter")).sendKeys("proposal");
			driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElement(By.id("sysverb_new")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			WebElement findElement = driver.findElement(By.id("std_change_proposal.short_description"));
			findElement.sendKeys("Dharani");
		    driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	}

}
