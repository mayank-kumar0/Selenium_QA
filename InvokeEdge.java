package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {
	//public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
	}
}
