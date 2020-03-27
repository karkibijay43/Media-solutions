package adPortalstepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import adPortalUtilities.AdPortalScreenShots;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestHooks {
	WebDriver driver;
	AdPortalScreenShots adPortalScreenShots;

	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Started execution for the scenario : " + scenario.getName());
	}

	@Before("@AdPortalLogInDefault")
	public void AdPortalLogInDefault(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before AdPortalLogInDefault");
		System.out.println("=========================================");

	}

	@Before("@AdPortalLogInUserInPut")
	public void AdPortalLogInUserInPut(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before AdPortalLogInUserInPut");
		System.out.println("=========================================");

	}

	@Before("@SSULogIn")
	public void SSULogIn(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before SSULogIn");
		System.out.println("=========================================");

	}

	@Before("@CreateCampaignDefault")
	public void CreateCampaignDefault(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before CreateCampaignDefault");
		System.out.println("=========================================");

	}

	@Before("@CreateCampaigUserInPut")
	public void CreateCampaignUserInPut(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before CreateCampaignUserInPut");
		System.out.println("=========================================");

	}

	@Before("@DashBoardView")
	public void DashBoardView(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before DashBoardView");
		System.out.println("=========================================");

	}

	@After()
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println("Completed execution for the scenario :" + scenario.getName());
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		
		  
		/*
		 * try { byte[] screenshot =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); File
		 * screenshot_with_scenario_name = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(screenshot_with_scenario_name, new File(
		 * "/Users/p2815492/git/MediaSolutionsRepo/MediaSolutions_Automation/target/ScreenShots"
		 * + scenario.getName() + ".png")); System.out.println(scenario.getName());
		 * scenario.embed(screenshot, "image/png"); } catch (WebDriverException
		 * somePlatformsDontSupportScreenshots) {
		 * System.err.println(somePlatformsDontSupportScreenshots.getMessage()); }
		 */

	}

	/*@After("@AdPortalLogInDefault")
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot_with_scenario_name,
						new File("/Users/p2815492/git/MediaSolutionsRepo/MediaSolutions_Automation/target/ScreenShot"
								+ scenario.getName() + ".png"));
				System.out.println(scenario.getName());
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

			driver.close();
		}*/

	}
	/*
	 * @After ("@AdPortalLogInDefault") public void screenShotTaker (Scenario
	 * scenario) { adPortalScreenShots = new AdPortalScreenShots(driver);
	 * adPortalScreenShots.takeScreenShot();
	 * 
	 * }
	 */

