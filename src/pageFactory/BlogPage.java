package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
	WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "blog-title")
	WebElement header;

	@FindBy(xpath = "//p[@class = 'blog-title']/a")
	WebElement uptakeButton;

	public WebElement pageHeader() {
		return header;

	}

	public void GoToHomePage() {
		uptakeButton.click();
	}
}
