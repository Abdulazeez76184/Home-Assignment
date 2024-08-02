package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.leafground.com/radio.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		Driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		Driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isEnabled();
		boolean isSelectedCheck = Driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isSelected();
		assertEquals(isSelectedCheck,true);
		
		Driver.close();

	}

}
