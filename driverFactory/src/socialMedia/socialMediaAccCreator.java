package socialMedia;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class socialMediaAccCreator {

	@Test
	
	public void Call() {
		WebDriver driver = driverFactory.driverFactory.open("chrome");
		driver.get("https://www.fb.com");

		Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
		
		Pom callout = new Pom(driver);
		callout.clickCreate();
		callout.firstName("Example");
		callout.lastName("TestExemple");
		callout.mail("theexample@zip.net");
		callout.mailConfirmation("theexample@zip.net");
		callout.pswrd("testexemple.99");
		callout.birthDate("23", "Dec", "1995");
		callout.genderSelector();

	}
		
		
		
}
