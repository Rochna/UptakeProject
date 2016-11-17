package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeoplePage {

	WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(@class,'hero-title--reverse')]")
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
