package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(@class,'hero-title')]")
	WebElement header;

	@FindBy(linkText = "Approach")
	WebElement headerMenu_Approach;

	@FindBy(linkText = "Platform")
	WebElement headerMenu_Platform;

	@FindBy(linkText = "Solutions")
	WebElement headerMenu_Solutions;

	@FindBy(linkText = "People")
	WebElement headerMenu_People;

	@FindBy(linkText = "Join Us")
	WebElement headerMenu_JoinUs;

	@FindBy(linkText = "Contact Us")
	WebElement headerMenu_ContactUs;

	@FindBy(linkText = "Blog")
	WebElement headerMenu_Blog;

	public WebElement homePageHeader() {
		return header;
	}

	public WebElement menuApproach() {
		return headerMenu_Approach;
	}

	public WebElement menuPlatform() {
		return headerMenu_Platform;

	}

	public WebElement menuSolutions() {
		return headerMenu_Solutions;

	}

	public WebElement menuPeople() {
		return headerMenu_People;

	}

	public WebElement menuJoinUs() {
		return headerMenu_JoinUs;

	}

	public WebElement menuContactUs() {
		return headerMenu_ContactUs;

	}

	public WebElement menuBlog() {
		return headerMenu_Blog;

	}
}
