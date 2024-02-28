package Axis.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions builder = new Actions(driver);
		
		// action class to be used when we need to do  series of actions together.
		Action seriesofact = builder.moveToElement(email).click().keyDown(email,Keys.SHIFT).sendKeys(email, "HKHANDE").build();
		seriesofact.perform();
	}
}