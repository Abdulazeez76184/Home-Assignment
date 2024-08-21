package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameandalertinteractions {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Driver.manage().window().maximize();
		Driver.switchTo().frame(1);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.xpath("//button[contains(text(), 'Try it')]")).click();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		String text = Driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);

	}

}
