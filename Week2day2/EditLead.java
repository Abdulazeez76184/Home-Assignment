package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
		Driver.findElement(By.xpath("//ul[@class='shortcuts']//a")).click();
		
		Driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("TestLeafCompany");
		Driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Test");
		Driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Leaf");
		Driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("TL");
		Driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("Computer");
		Driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("All the Best");
		Driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("testleaf@gmail.com");
		WebElement Option4 = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt2 = new Select(Option4);
		opt2.selectByVisibleText("Texas");
		
		Driver.findElement(By.name("submitButton")).click();
		Driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		Driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		Driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Goodluck");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Lead")) {
			System.out.println("Lead updated");
		}
			else {
			System.out.println("Lead not updated");
			}
		Driver.close();

		}

	}

