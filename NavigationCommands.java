package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		//navigate to forward in browser
		driver.navigate().forward();
				
		Thread.sleep(500);
		
		//navigate to backward in browser
		driver.navigate().back();
		
		Thread.sleep(500);
		
		//refresh the browser
		driver.navigate().refresh();
		
		driver.close();
	}

}
