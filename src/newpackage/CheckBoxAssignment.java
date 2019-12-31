package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\JAR\\chromedriver_win32-2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement checkbox = driver.findElement(By.cssSelector("input#checkBoxOption1"));
		String tick = "I clicked on option 1";
		System.out.println(tick + " I expect to see a check mark");
		checkbox.click();
		Assert.assertEquals(checkbox.isSelected(), true);
		checkbox.click();
		System.out.println(tick + " I do not expect to see a check mark");
		Assert.assertEquals(checkbox.isSelected(), false);
		

		System.out.println("Number of check boxes are: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),3);
		
	}
}