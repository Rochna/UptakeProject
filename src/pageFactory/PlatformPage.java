package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlatformPage {

	WebDriver driver;

	public PlatformPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(@class,'hero-title')]")
	WebElement header;

	@FindBy(xpath = "//a[contains(@class,'logo')]")
	WebElement uptakeButton;

	public WebElement pageHeader() {
		return header;
	}

	public WebElement uptakeButton() {
		return uptakeButton;
	}
}
