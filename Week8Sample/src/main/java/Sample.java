import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

@Test
	public void same() {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
        driver.findElementById("buttonLogin").click();
        driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]").click();
		driver.findElementByXPath("//a[@href='/vendors/search']").click();
        driver.findElementById("vendorName").sendKeys("Blue lagoon");
        driver.findElementById("buttonSearch").click();
        //driver.findElementByXPath("//td[text()='France']").getText();
        driver.findElementByLinkText("Log Out").click();
        driver.close();

}
}