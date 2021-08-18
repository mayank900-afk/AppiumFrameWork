package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Test extends BaseTest {

	@org.testng.annotations.Test
	public void testone() {
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility
		// Node Querying\"]"))
		// .click();
		// WebElement element =
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Task
		// Conquer World\"]"));

		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/aw/ya/gcb?ref_=apay_mobhome_AddGiftCard']//div[@class='a-section a-spacing-small a-text-center']//img")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).clear();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8800845535");

		//driver.findElement(By.id("nav-search-submit-button"));

		System.out.println("Test one completed");
	}

}
