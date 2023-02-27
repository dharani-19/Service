package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mandatory {

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
			    driver.findElement(By.id("filter")).sendKeys("Knowledge");
			    driver.findElement(By.xpath("(//div[text()='Knowledge'])[1]")).click();
			    driver.switchTo().defaultContent();
			    driver.switchTo().frame(0);
                driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
                driver.findElement(By.xpath("//button[@name='lookup.kb_knowledge.kb_knowledge_base']")).click();
                driver.switchTo().frame(0);
                driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[1]")).click();
                driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
        		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("IT");
        		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
        		
	}

}
