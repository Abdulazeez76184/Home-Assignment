package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationusingActionsClassAmazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 9 Pro", Keys.ENTER);
//		WebElement searchBox = Driver.findElement(By.id("twotabsearchtextbox"));
//		//Creating an Instance in Action Class
//		Actions action=new Actions(Driver);
//		//using action class
//		action.moveToElement(searchBox)
//		.keyDown(searchBox, Keys.SHIFT)
//		.sendKeys(searchBox, "OnePlus 9 Pro")
//		.keyUp(searchBox, Keys.SHIFT)
//		.sendKeys(Keys.ENTER)
//		.perform();
		String text = Driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span")).getText();
		System.out.println("Price of the first Product :"+text);
		String text1 = Driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Number of customer ratings for the first displayed product :"+text1);
		Driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline-text')]//span")).click();
		
		Set<String> WindowHandles = Driver.getWindowHandles();
		List<String> list=new ArrayList<String>(WindowHandles);
		String Parentwindow = list.get(0);
		String Childwindow1 = list.get(1);
		//String Childwindow2 = list.get(2);
		System.out.println("Child window1 :"+Parentwindow);
		System.out.println("Child window1 :"+Childwindow1);
		//System.out.println("Child window1 :"+Childwindow2);
		
		Driver.switchTo().window(Parentwindow);
		System.out.println("Child window1 :"+Driver.getTitle());
	
		
		Driver.switchTo().window(Childwindow1);
		System.out.println("Child window1 :"+Driver.getTitle());
		
		File scr = Driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File dest=new File("./Snapshot/img1.png");
		FileUtils.copyFile(scr, dest);
		Driver.findElement(By.id("add-to-cart-button")).click();
		
		
		//Driver.switchTo().window(Childwindow2);
		//System.out.println("Child window1 :"+Driver.getTitle());
		String text2 = Driver.findElement(By.xpath("//span[text()='28,799']")).getText();
		System.out.println("cart subtotal :"+text2);
		if(text2.contains("28,799")) {
			System.out.println("Subtotal is Correct");
			}
			else {
			System.out.println("Subtotal is Incorrect");
			}
			Driver.close();
	}

}
