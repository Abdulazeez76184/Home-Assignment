package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/checkbox.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']//div)[2]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		String text = Driver.findElement(By.xpath("//div[contains(@class,'ui-growl-item-container ui-state-highlight')]//div")).getText();
		System.out.println(text);
		if(text.contains("Checked")) {
			System.out.println("Checkbox is Checked");
		}
		else {
			System.out.println("Checkbox is UnChecked");
			}
		Driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
	
		
		String text1 = Driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		System.out.println(text1);
		if(text1.contains("State = 1"))
		{
			System.out.println("State has been changed. State = 1");}
			 else if(text1.contains("State = 2")) {
					System.out.println("State has been changed. State = 2");
		}else {
			System.out.println("State has been changed. State = 0");
			
				}
		Driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']//div)[2]")).click();
		boolean displayed = Driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isDisplayed();
		System.out.println(displayed);
	    String text2 = Driver.findElement(By.xpath("//div[contains(@class,'ui-growl-item-container ui-state-highlight')]//div")).getText();
		System.out.println(text2);
		if(text2.contains("Checked")) {
			System.out.println("Checked");
			}
		else {
			System.out.println("Unchecked");
			}
		Driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[5]/div[1]/div[2]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[3]/div[1]/div[2]")).click();
		Driver.close();
	}
		
}
