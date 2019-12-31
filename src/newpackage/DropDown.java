package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\JAR\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.makemytrip.com");
		// Select class used for static dropdowns, can be identified by <select> and
		// chosen by index, value, or visible text
		// Select s = new Select(driver.findElement(By.id("a.ui-spinner-button
		// ui-spinner-up ui-corner-tr")));
		// s.selectByIndex(2);
		/*
		 * if more than one option in dropdown, use index ie //a[@id='id1'][2] - showing
		 * more than one or include parent xpath with child xpath ie
		 * //span[@class='class1'][a[@id='id1']
		 */

		// * for autosuggestion, enter the first 3 char and from drop down select the
		// option required

		WebElement source = driver.findElement(By.id(""));
		WebElement destination = driver.findElement(By.id(""));
		source.clear();
		source.sendKeys("MUM");
		// add Thread.Sleep(5000) or explicit / implicit time wait as needed here
		source.sendKeys(Keys.ENTER);

		destination.clear();
		destination.sendKeys("BUF");
		// add Thread.Sleep(5000) or explicit / implicit time wait as needed here
		for (int i = 1; i < 4; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
			destination.sendKeys(Keys.ENTER);
		}
		Assert.assertEquals(destination, true);
	}
}
