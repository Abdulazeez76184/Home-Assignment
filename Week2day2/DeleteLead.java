package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/. .");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.xpath("//div[@for='crmsfa']//a[1]")).click();
		Driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		Driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		Driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9003133793");
		Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Driver.findElement(By.xpath("//a[text()='Abdul']")).click();
		Driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
		Driver.findElement(By.xpath("//a[contains(@id,'Find Leads']")).click();
		Driver.findElement(By.className("firstName")).sendKeys("Abdul");
		String text = Driver.findElement(By.id("ext-gen437")).getText();
		System.out.println(text);
		if(text.contains("No records to display")) {
		System.out.println("Lead Deleted Successfully");
		}
		else {
		System.out.println("Lead not Deleted");
		}
		Driver.close();

	}

}
