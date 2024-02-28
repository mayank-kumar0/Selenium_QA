package Axis.QA;


import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFireox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\\");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.selenium.dev/");
	}
}