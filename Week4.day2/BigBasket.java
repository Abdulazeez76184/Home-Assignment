package week4.day2;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;

	public class BigBasket {
		
		public static void main(String[] args) throws InterruptedException, IOException {
			
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.bigbasket.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.findElement(By.xpath("(//div[@class='relative h-full']/button)[2]")).click();
					
			Actions action = new Actions(driver);
			
			Thread.sleep(3000);
			
			WebElement chooseCategory = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
			
			action.moveToElement(chooseCategory).perform();
						
			WebElement riceAndRice = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])"));
			
			action.moveToElement(riceAndRice).perform();
						
			driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
						
			WebElement selectBrand = driver.findElement(By.id("i-BBRoyal"));
			
			driver.executeScript("arguments[0].click();", selectBrand);
			
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
			
			
			String parentWindow = driver.getWindowHandle();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> newWindow = new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(newWindow.get(1));
			
			Thread.sleep(3000);
			
			WebElement selectKg = driver.findElement(By.xpath("//span[text()='5 kg']"));
			
			action.scrollToElement(selectKg).click(selectKg).perform();
						
			String price = driver.findElement(By.xpath("//td[contains(text(), 'Price: ')]")).getText();
			
			System.out.println(price);
			
			Assert.assertEquals("Price: ₹375", price);
						
			driver.findElement(By.xpath("(//button[text()='Add to basket'])")).click();
			
			Thread.sleep(2000);
			
			String verificationMessage = driver.findElement(By.xpath("//div[contains(@class, 'Toast___StyledDiv')]/p")).getText();
			
			System.out.println(verificationMessage);
			
			Assert.assertEquals("An item has been added to your basket successfully", verificationMessage);
						
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			
			File des = new File("./Snapshot/bigbasket.png");
			
			FileUtils.copyFile(screenshotAs, des);
			
					
			driver.close();
			
			driver.switchTo().window(parentWindow);
			
			driver.close();
		}

	}
