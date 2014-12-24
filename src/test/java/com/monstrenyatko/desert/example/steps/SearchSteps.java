package com.monstrenyatko.desert.example.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.monstrenyatko.desert.core.Steps;
import com.monstrenyatko.desert.example.pages.MainPage;
import com.monstrenyatko.desert.example.pages.SearchResultPage;

public class SearchSteps extends Steps {

	public SearchSteps(WebDriver driver) {
		super(driver);
	}

	private MainPage onMainPage() {
		return currentPageAt(MainPage.class);
	}

	private SearchResultPage onSearchResultPage() {
		return currentPageAt(SearchResultPage.class);
	}

	public void search(final String text) {
		onMainPage().setSearchField(text);
		onMainPage().clickSearch();
	}

	public void verifySearch(final String text) {
		Assert.assertTrue("Text must be somewhere", onSearchResultPage()
				.isTextPresent(text));
	}
}
