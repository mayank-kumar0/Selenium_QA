package Axis.QA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ALertClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\\");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
		infoalt.click();
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		WebElement confoalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
		confoalt.click();
		Thread.sleep(500);
		
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		WebElement proalt = driver.findElement(By.xpath("//input[@name='prompt']"));
		infoalt.click();
		Thread.sleep(500);
		
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();
	}

}