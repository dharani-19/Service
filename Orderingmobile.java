package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orderingmobile {

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
		    driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
		    driver.switchTo().frame(0);
		    driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		    driver.switchTo().defaultContent();
		    driver.switchTo().frame(0);
		    driver.findElement(By.xpath("(//a[@class='service_catalog'])[1]")).click();
		    WebElement findElement = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		    Select drop=new Select(findElement);
		 	drop.selectByIndex(3);
		 	WebElement findElement2 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		 	Select dropDown=new Select(findElement2);
		 	dropDown.selectByVisibleText("128");
		 	driver.findElement(By.id("oi_order_now_button")).click();
		    
		    

	}

}
