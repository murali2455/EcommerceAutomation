package EcommerceAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import interviwe.alrets;

public class Ecommercebaseclass {
	WebDriver driver ;
	@BeforeTest
	public  void lanch() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "lg_details",priority = 1)
	public void test(String username, String password) throws InterruptedException {
		pom lg = new pom(driver);
		lg.login(username, password);

	}

	@DataProvider(name="lg_details")
	Object log() {
		Object[][]logs= {{"standard_user","secret_sauce"}};
		return logs;
	}
	@Test(priority = 2)
	public void shopping() {
		pom sh = new pom(driver);
		sh.shop();
		sh.screenshot();
	}
	@AfterTest
	public void close() {
	driver.close();
}

}
