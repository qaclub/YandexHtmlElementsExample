package com.htmlelements.qagfl;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("General search form for Images and Video")  //You can add a name to the class using this annotation @Name more info in next lecture
@FindBy(xpath = ".//*[@class='header__main']")  //Using @FindBy annotation over the class name you can limit the area of code for the elements. Pretty useful but be accurate with it
public class SearchFormBlock extends HtmlElement { // You need to inherit HtmlElement class 

	/*
	 * List of WebElements
	 */
	
	@Name("Search text input")  //Also you can add a name to each WebElement
	@FindBy(xpath = ".//*[@class='input__control']")
	private TextInput searchTextInput; //Most of the web elements you can typified for example Button, CheckBox, Link, Radio
	
	@Name("Search button")
	@FindBy(xpath = ".//*[@type='submit']")
	private Button submitButton;
	
	//Method that search using search form on pages
	public void search(String request) throws Exception {
		searchTextInput.sendKeys(request);
		submitButton.click();		
	}
	
}
