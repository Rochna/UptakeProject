package testCase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.ApproachPage;
import pageFactory.BlogPage;
import pageFactory.ContactUsPage;
import pageFactory.HomePage;
import pageFactory.JoinUsPage;
import pageFactory.PeoplePage;
import pageFactory.PlatformPage;
import pageFactory.SolutionsPage;


public class PageNavigation extends BaseTest {

	@Test(enabled = true)
	public void testApproachPageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to Approach screen

		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuApproach().click();
		ApproachPage approach = new ApproachPage(driver);
		wait.until(ExpectedConditions.visibilityOf(approach.pageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Approach_page_title"));
		softAssert.assertEquals(approach.pageHeader().getText(),
				expData.getProperty("Approach_page_header"));

		// ********* Verifying navigation from Approach screen to Home screen

		wait.until(ExpectedConditions.elementToBeClickable(approach
				.uptakeButton()));
		approach.uptakeButton().click();
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testPlatformPageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to Platform screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuPlatform().click();
		PlatformPage platform = new PlatformPage(driver);
		wait.until(ExpectedConditions.visibilityOf(platform.pageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Platform_page_title"));
		softAssert.assertEquals(platform.pageHeader().getText(),
				expData.getProperty("Platform_page_header"));
		
		// ********* Verifying navigation from Platform screen to Home screen

		wait.until(ExpectedConditions.elementToBeClickable(platform
				.uptakeButton()));
		platform.uptakeButton().click();
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testSolutionsPageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to Solutions screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuSolutions().click();
		SolutionsPage solutions = new SolutionsPage(driver);
		wait.until(ExpectedConditions.visibilityOf(solutions.pageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Solutions_page_title"));
		softAssert.assertEquals(solutions.pageHeader().getText(),
				expData.getProperty("Solutions_page_header"));

		// ********* Verifying navigation from Solutions screen to Home screen
		
		wait.until(ExpectedConditions.elementToBeClickable(solutions
				.uptakeButton()));
		solutions.uptakeButton().click();
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testPeoplePageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to People screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuPeople().click();
		PeoplePage people = new PeoplePage(driver);
		wait.until(ExpectedConditions.visibilityOf(people.pageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("People_page_title"));
		softAssert.assertEquals(people.pageHeader().getText(),
				expData.getProperty("People_page_header"));

		// ********* Verifying navigation from People screen to Home screen
		
		wait.until(ExpectedConditions.elementToBeClickable(people
				.uptakeButton()));
		people.uptakeButton().click();
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testJoinUsPageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to Join Us screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuJoinUs().click();
		JoinUsPage joinUs = new JoinUsPage(driver);
		wait.until(ExpectedConditions.visibilityOf(joinUs.tagLine()));

		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("JoinUs_page_title"));
		softAssert.assertEquals(joinUs.tagLine().getText(),
				expData.getProperty("JoinUs_page_tagline"));

		// ********* Verifying navigation from Join Us screen to Home screen
		
		wait.until(ExpectedConditions.elementToBeClickable(joinUs
				.uptakeButton()));
		joinUs.uptakeButton().click();
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testContactUsPageNavigation() {

		// ********* Verifying navigation from Home screen to Contact Us screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuContactUs().click();
		ContactUsPage contactUs = new ContactUsPage(driver);
		wait.until(ExpectedConditions.visibilityOf(contactUs.contactUsWindow()));
		softAssert.assertTrue(contactUs.contactUsWindow().isDisplayed());

		// ********* Verifying navigation from Contact Us screen to Home screen
		
		contactUs.GoToHomePage();
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}

	@Test(enabled = true)
	public void testBlogPageNavigation() throws InterruptedException {

		// ********* Verifying navigation from Home screen to Blog screen
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		home.menuBlog().click();
		BlogPage blog = new BlogPage(driver);
		wait.until(ExpectedConditions.visibilityOf(blog.pageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Blog_page_title"));
		softAssert.assertEquals(blog.pageHeader().getText(),
				expData.getProperty("Blog_page_header"));

		// ********* Verifying navigation from Blog screen to Home screen
		
		blog.GoToHomePage();
		Thread.sleep(3000L);
		// wait.until(ExpectedConditions.visibilityOf(home.homePageHeader()));
		softAssert.assertEquals(driver.getTitle(),
				expData.getProperty("Home_page_title"));
		softAssert.assertAll();
	}
}
