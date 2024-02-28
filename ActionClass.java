package Axis.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Thread.sleep(1000);
		WebElement doubleclick=driver.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions builder=new Actions(driver);
		
		Thread.sleep(1000);
		builder.doubleClick(doubleclick).perform();
		
        
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		alt.accept();
	  
		// ContextClick (Right click on double click
		builder.contextClick(doubleclick).perform();
	}
}