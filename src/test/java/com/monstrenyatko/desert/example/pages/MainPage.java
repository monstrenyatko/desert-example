package com.monstrenyatko.desert.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.monstrenyatko.desert.core.PageObject;


public class MainPage extends PageObject {

	@FindBy(xpath = "//*[contains(@class,'input-wrapper')]//input[@type='text']")
	public WebElement searchField;

	@FindBy(xpath = "//button[@id='search-submit']")
	public WebElement searchButton;

	public MainPage(WebDriver webDriver) {
		super(webDriver);
		String url = loadProperty("site.url");
		if (!getDriver().getCurrentUrl().equalsIgnoreCase(url)) {
			getDriver().get(url);
		}
	}

	public void setSearchField(final String v) {
		searchField.clear();
		searchField.sendKeys(v);
	}

	public void clickSearch() {
		searchButton.click();
	}
}
