package socialMedia;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom {
	WebDriver driver;
	
	@FindBy(css="input[name=firstname]")
	WebElement firstNameBox;
	
	@FindBy(name="lastname")
	WebElement lastNameBox;
	
	@FindBy(name="reg_email__")
	WebElement emailBox;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement emailBox2;
	
	@FindBy(name="reg_passwd__")
	WebElement passBox;
	
	@FindBy(id="day")
	WebElement dayDropdown;
	
	@FindBy(id="month")
	WebElement monthDropdown;
	
	@FindBy(id="year")
	WebElement yearDropdown;
	
	@FindBy(xpath="//*[text()='Male']")
	WebElement gender;

	public void clickCreate() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement stayPut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Create new account']")));
		stayPut.click();
	}
	

	public void firstName(String nome) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement stayPut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=firstname]")));
		firstNameBox.sendKeys(nome);
	}
	public void lastName(String lastname) {
		lastNameBox.sendKeys(lastname);
	}
	
	public void mail(String email) {
		emailBox.sendKeys(email);
	}
	
	public void mailConfirmation(String email) {
		emailBox2.sendKeys(email);
	}
	
	public void pswrd(String password) { //password
		passBox.sendKeys(password);
	}
	
	public void birthDate(String day, String month, String year) {
		Select birthDay = new Select(dayDropdown);
		Select birthMonth = new Select(monthDropdown);
		Select birthYear = new Select(yearDropdown);
		
		birthDay.selectByVisibleText(day);
		birthMonth.selectByVisibleText(month);
		birthYear.selectByVisibleText(year);
		
	}
	
	public void genderSelector() {
		gender.click();
	}
	public void setSocialMediaWebSite(String webSite) {
		driver.get(webSite);
	}
			

	public Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
}
