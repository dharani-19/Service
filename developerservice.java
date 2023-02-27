package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class developerservice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://dev140572.service-now.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@name='user_name' and @class='form-control']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("P-qQ7@umSYz8");
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    WebElement fil=driver.findElement(By.id("filter"));
		fil.sendKeys("All",Keys.ENTER);
		WebElement call=driver.findElement(By.xpath("//div[text()='Callers']"));
		call.click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Dharani");
		driver.findElement(By.id("sys_user.last_name")).sendKeys("M");
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
		WebElement name = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		name.sendKeys("Dharani", Keys.ENTER);
		String Firstname = "Dharani";
		WebElement name1 = driver.findElement(By.xpath("//td[text()='Dharani'][1]"));
		String Result = name1.getText();
		if (Firstname.equals(Result)) {
			System.out.println("sucessfully created");

		}

	}

}
