package Axis.QA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement doubleclick = driver.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleclick).perform();
		Thread.sleep(500);
		
		Alert conf = driver.switchTo().alert();
		conf.accept();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement contextclick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		builder.contextClick(contextclick).perform();
		conf.accept();
	}
}