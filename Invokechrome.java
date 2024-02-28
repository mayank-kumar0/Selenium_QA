package Axis.QA;

import org.openqa.selenium.chrome.ChromeDriver;

public class Invokechrome {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev/");
	}
}