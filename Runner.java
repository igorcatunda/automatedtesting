package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {


	private String site;
	private WebDriver driver;

	public void invoke() {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void accessWebSite(String webSite) {
		site = webSite;
		driver.get(site);
	}
		
}
