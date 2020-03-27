package adportalPageObjects;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReachPage {
	WebDriver driver;

	public ReachPage(WebDriver driver) {
		this.driver = driver;
	}

	By reachPage_NextButton = By.xpath("//div[@class='spp-btn']");
	By button_RaiseAwareness = By.xpath(
			"/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-goals[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-goals-card[1]/div[2]/button[1]");
	By button_PromoteYourEvent = By.xpath("//button[@class='ap-btn-large d-none d-sm-flex']");
	By reachPage1_NextButton = By.xpath("//span[contains(text(),'Next')]");
	By txtBox_AddressField = By.xpath("//input[@placeholder='Enter a location']");
	By headerTitle = By.xpath("//div[@class='header large ng-star-inserted']");
	By distanceArrowdropdown = By.xpath("//span[@class='ng-arrow-wrapper']");
	By miles_2 = By.xpath(
			"//div[@class='ng-option ng-option-selected ng-star-inserted ng-option-marked']//span[@class='ng-option-label ng-star-inserted'][contains(text(),'2 miles')]");
	By defaultDistance_50 = By.xpath("//span[contains(text(),'50 miles')]");
	By miles_20 = By.xpath("//span[contains(text(),'20 miles')]");
	By miles_30 = By.xpath("//span[contains(text(),'30 miles')]");
	By miles_40 = By.xpath("//span[contains(text(),'40 miles')]");
	By reachPage2_NextButton1 = By.xpath("//*[@id=\"card-item-wrapper\"]/div/div[2]/div[2]/div[3]/div/span");
	By reachPage2_NextButton2 = By.xpath("//span[contains(text(),'Next')]");
	By reachPage3_NextButton = By.className("spp-btn");
	By age18_14_Label = By.xpath("//label[contains(text(),'18 - 49')]");
	By audience_Male = By.xpath("//span[contains(text(),'Male')]");
	By audice_Female = By.xpath("//span[contains(text(),'Female')]");

	public void explicitly_Wait_For_ReachPageNextButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(reachPage_NextButton));
	}

	public void click_ReachPageNextButton() {
		driver.findElement(reachPage_NextButton).click();

	}

	public void explicitly_Wait_For_RaiseAwarenessButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(button_RaiseAwareness));
	}

	public void select_RaiseAwareness() {
		driver.findElement(button_RaiseAwareness).click();

	}

	public void select_PromoteYourEvent() {
		driver.findElement(button_PromoteYourEvent).click();
	}

	public void click_ReachPage1NextButton() {
		driver.findElement(reachPage1_NextButton).click();

	}

	public void explicitly_Wait_For_AddressEntry() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(txtBox_AddressField));
	}

	public void enter_Address(String address) {

		driver.findElement(txtBox_AddressField).clear();
		driver.findElement(txtBox_AddressField).sendKeys(address);
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ARROW_DOWN);

	}

	public void UserInPut_Address() {
		driver.findElement(txtBox_AddressField).clear();
		String EnterAddress;
		EnterAddress = JOptionPane.showInputDialog(null, "Enter your Address");
		driver.findElement(txtBox_AddressField).sendKeys(EnterAddress);
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ARROW_DOWN);
		// driver.findElement(txtBox_AddressField).sendKeys(Keys.ENTER);

	}

	public void click_HeaderTtile() {
		driver.findElement(headerTitle).click();

	}

	public void click_DropDownAroow() {
		driver.findElement(distanceArrowdropdown).click();

	}

	public void enter_Distance() {
		driver.findElement(defaultDistance_50).click();
	}

	public void clickDistance_JSExecutor() {
		WebElement defaultDistance = driver.findElement(defaultDistance_50);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", defaultDistance);
	}

	public void UserInPut_Distance() {
		String enterDistance;
		enterDistance = JOptionPane.showInputDialog(null, "Enter your Distance in miles");
		// distance = Integer.parseInt(enterDistance);
		if (enterDistance.equals("2")) {
			driver.findElement(By.xpath(
					"//div[@class='ng-option ng-option-selected ng-star-inserted ng-option-marked']//span[@class='ng-option-label ng-star-inserted'][contains(text(),'2 miles')]"))
					.click();

		} else if (enterDistance.equals("20")) {
			driver.findElement(By.xpath("//span[contains(text(),'20 miles')]")).click();
		}

		else if (enterDistance.equals("30")) {
			driver.findElement(
					By.xpath("//span[@class='ng-option-label ng-star-inserted'][contains(text(),'30 miles')]")).click();
		} else if (enterDistance.equals("40")) {
			driver.findElement(By.xpath("//span[contains(text(),'40 miles')]")).click();
		}

		if (enterDistance.equals("50")) {
			driver.findElement(By.xpath("//span[contains(text(),'50 miles')]")).click();
		}

		else {
			System.out.println("Please enter valid Distance in miles");
		}

	}

	public void Select_2Miles() {
		driver.findElement(miles_2).click();

	}

	public void Select_50Miles() {
		driver.findElement(defaultDistance_50).click();

	}

	public void Select_20Miles() {
		driver.findElement(miles_20).click();

	}

	public void Select_30Miles() {
		driver.findElement(miles_30).click();

	}

	public void Select_40Miles() {
		driver.findElement(miles_40).click();

	}

	public void click_ReachPage2NextButton() {
		System.out.println("clicking on Next Button");
		// WebElement reachPage2NextButton = driver.findElement(reachPage2_NextButton2);
		// driver.findElement(reachPage2_NextButton2).click();
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement reachPage2NextButton = driver.findElement(reachPage2_NextButton2);
					reachPage2NextButton.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + e.getMessage());
					count = count + 1;
				}
			}
		}

		/*
		 * if (reachPage2NextButton.isEnabled()) { reachPage2NextButton.click(); } else
		 * {
		 * 
		 * System.out.println("Next button is not enabled"); }
		 * 
		 * try { reachPage2NextButton.click();
		 * 
		 * } catch (StaleElementReferenceException e) {
		 * driver.findElement(reachPage2_NextButton2).click(); }
		 */

	}

	public void uncheck_Check_Age18_49Button() {
		driver.findElement(age18_14_Label).click();
		driver.findElement(age18_14_Label).click();

	}

	public void click_Audience_Male() {
		driver.findElement(audience_Male).click();
		driver.findElement(audience_Male).click();
	}

	public void click_ReachPage3NextButton() {
		System.out.println("clicking on Next Button again");
		/*
		 * WebElement reachPage3NextButton = driver.findElement(reachPage3_NextButton);
		 * if (reachPage3NextButton.isEnabled()) { reachPage3NextButton.click(); } else
		 * {
		 * 
		 * System.out.println("Next button is not enabled"); }
		 * 
		 * try { reachPage3NextButton.click();
		 * 
		 * } catch (StaleElementReferenceException e) {
		 * driver.findElement(reachPage3_NextButton).click(); }
		 */
		driver.findElement(reachPage3_NextButton).click();
	}

	public void click_ReachPage3NextButton_JSExecutor() {

		WebElement reachPage3NextButton = driver.findElement(reachPage3_NextButton);
		if (reachPage3NextButton.isEnabled()) {
			reachPage3NextButton.click();
		} else {

			System.out.println("Next button is not enabled");
		}

		try {
			reachPage3NextButton.click();

		} catch (StaleElementReferenceException e) {

			WebElement reachPage3NextBtn = driver.findElement(reachPage3_NextButton);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reachPage3NextBtn);
			// driver.findElement(reachPage3_NextButton).click();
		}
	}

}