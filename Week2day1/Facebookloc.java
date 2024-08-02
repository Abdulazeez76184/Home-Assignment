package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookloc {

	public static void main(String[] args) {
	ChromeDriver Driver =new ChromeDriver();
	Driver.get("https://en-gb.facebook.com/");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0')]")).click();
	
	Driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg')]")).sendKeys("Abdul");
	Driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")).sendKeys("Imran");
	Driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("9003133793");
	Driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Azeez1202");
	
	WebElement dd = Driver.findElement(By.xpath("//select[contains(@class,'_9407 _5dba')]"));
	Select opt1 =new Select(dd);
	opt1.selectByValue("2");
	
	WebElement ddd = Driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[2]"));
	Select opt2 =new Select(ddd); 
	opt2.selectByValue("2");
	
			
	WebElement dddd = Driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[3]"));
	Select opt3 =new Select(dddd); 
	opt3.selectByValue("2022");
					
	
	Driver.findElement(By.xpath("//label[text()='Male']")).click();
	Driver.close();

	}

}
