package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory {
	public static WebDriver open(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\Software\\geckodriver.exe");
			System.out.println("Using FireFox.");
			return new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.drive", "C:\\QA\\Software\\chromedriver.exe");
			System.out.println("Using Chrome.");
			return new ChromeDriver();
		}
	}
}
