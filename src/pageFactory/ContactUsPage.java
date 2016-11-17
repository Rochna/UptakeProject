package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "header__contact__container")
	WebElement contactWindow;

	@FindBy(xpath = "//a[contains(@class,'header__contact__close')]")
	WebElement closeButton;

	public WebElement contactUsWindow() {
		return contactWindow;

	}

	public void GoToHomePage() {
		closeButton.click();
	}
}
