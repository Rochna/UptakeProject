package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinUsPage {
	WebDriver driver;

	public JoinUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "tagLine")
	WebElement tLine;

	@FindBy(xpath = "//*[@id='logo']/a")
	WebElement uptakeButton;

	public WebElement tagLine() {
		return tLine;

	}

	public WebElement uptakeButton() {
		return uptakeButton;
	}
}
