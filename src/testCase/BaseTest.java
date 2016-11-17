package testCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public static WebDriver driver;
	public static Properties envData;
	public static Properties expData;
	public static WebDriverWait wait;
	FileInputStream env;
	FileInputStream exp;

	// ****** This method selects the browser and launches the URL. It also
	// creates the object for configuration files

	@BeforeSuite
	public void configSetup() throws IOException {

		// ****** Creating FileInputStream object to read from
		// Environment.properties file

		env = new FileInputStream(
				"C:\\Automation\\Workspace\\UptakeProject\\src\\configuration\\Environment.properties");
		envData = new Properties();
		envData.load(env);

		// ****** Creating FileInputStream object to read from
		// ExpectedResult.properties file

		exp = new FileInputStream(
				"C:\\Automation\\Workspace\\UptakeProject\\src\\configuration\\ExpectedResult.properties");
		expData = new Properties();
		expData.load(exp);

		// ****** Initializing driver for the browser type that is mentioned in
		// Environment.properties file

		if (envData.getProperty("Browsertype").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Automation\\Workspace\\UptakeProject\\BrowserExecutables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (envData.getProperty("Browsertype").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Automation\\Workspace\\UptakeProject\\BrowserExecutables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (envData.getProperty("Browsertype").equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Automation\\Workspace\\UptakeProject\\BrowserExecutables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		// ****** Launching the URL that is mentioned in Environment.properties
		// file

		driver.get(envData.getProperty("Website_URL"));

		// ****** Defining implicit wait for the test

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// ****** Defining explicit wait for the test

		wait = new WebDriverWait(driver, 15);
	}
	
	@AfterSuite
	public void configTearDown() throws IOException{
		driver.close();
		env.close();
		exp.close();
	}
}
