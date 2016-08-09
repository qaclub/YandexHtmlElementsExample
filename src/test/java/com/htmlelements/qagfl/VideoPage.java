package com.htmlelements.qagfl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/*
 * Page class for images
 */
public class VideoPage {
	
	//Object of SearchFormBlock class
	private SearchFormBlock searchForm;
	
	//WebDriver object
	private WebDriver driver;

	//Initialize page using page factory from Selenium framework but also using classes from HTML elements framework
	public VideoPage(WebDriver driver) {			
		PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this); 
		this.driver = driver;
	}
	
	//Method from SearchFormBlock class
	public void searchFor(String request) {
		try {
			this.searchForm.search(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Method that opened yandex images page
	 * Do not do it in real testing I did just to make it quicker
	 */
	public void getUrl() {
		driver.get("https://yandex.ua/video/");
	}

}
