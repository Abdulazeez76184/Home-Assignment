package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
	ChromeDriver Driver = new ChromeDriver();
	Driver.get("http://leaftaps.com/opentaps/");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	Driver.findElement(By.id("password")).sendKeys("crmsfa");
	Driver.findElement(By.className("decorativeSubmit")).click();
	Driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
	Driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
	Driver.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
	Driver.findElement(By.id("accountName")).sendKeys("Abdul2");
	Driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");

	WebElement Option0 = Driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
	Select Industry = new Select(Option0);
	Industry.selectByValue("IND_SOFTWARE");
	
	WebElement Option1 = Driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
	Select ownership = new Select(Option1);
	ownership.selectByVisibleText("S-Corporation");
	
	WebElement Option2 = Driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	Select Element2 = new Select(Option2);
	Element2.selectByValue("LEAD_EMPLOYEE");
	
	WebElement Option3 = Driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	Select marketing = new Select(Option3);
	marketing.selectByIndex(6);
	
	WebElement Option4 = Driver.findElement(By.id("generalStateProvinceGeoId"));
	Select state2 = new Select(Option4);
	state2.selectByValue("TX");
	
	Driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	
	String text = Driver.findElement(By.id("ext-gen1169")).getText();
	System.out.println(text);
	
	if(text.contains("Abdul2")) {
		System.out.println("Account name displayed correctly");
	}
		else {
			System.out.println("Account name displayed wrong");
		}
	
	Driver.findElement(By.xpath("//div[@id='pr_id_482_content']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/i[1]")).click();
	
	
	Driver.close();

	}
}



