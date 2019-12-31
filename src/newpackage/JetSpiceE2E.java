package newpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class JetSpiceE2E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\JAR\\chromedriver_win32-2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com"); 
		//one way radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//FROM drop down
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Select Delhi as departure city
		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);
		//TO drop down
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
//		driver.findElement((By.id("ctl00_mainContent_ddl_destinationStation1_CTNR"))).click();
//		driver.findElement(By.xpath("//a[@value='GOI']")).click();
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='RUH')]"))
//				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

//		for (int i = 1; i < 5; i++)
//
//		{
//
//			driver.findElement(By.id("hrefIncAdt")).click();
//
//		}

		driver.findElement(By.id("divpaxOptions")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult.wMed1s.required.valid")).click();//option[@value='5']")).click();
//		Thread.sleep(2000L);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[@value='4']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']//option[@value='USD']")).click();
//		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		 driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		 
 /* all the same selector for Search Button
		 //driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		 
		//driver.findElement(By.cssSelector("input[value='Search']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
*/
	}

}
