package com.htmlelements.qagfl;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseYandexSearchFormTest {
	
	//Driver object
	private WebDriver driver;
	
	//Pages
	ImagesPage imagesPage;
	VideoPage videoPage;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		imagesPage = new ImagesPage(driver);
		videoPage = new VideoPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void runUseYandexSearchFormTest() throws Exception {
		videoPage.getUrl();
		videoPage.searchFor("GeekfForLess");
		Thread.sleep(5000);
	}
	
	@After
	public void tearDrop() {
		driver.quit();
	}
	
}
