package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

		public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			//driver.get("https://login.salesforce.com/?locale=in"); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.navigate().to("https://www.facebook.com/");
		
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dilip@testleaf.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testleaf@2024");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}


