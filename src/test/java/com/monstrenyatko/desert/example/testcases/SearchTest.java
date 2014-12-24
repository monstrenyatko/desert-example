package com.monstrenyatko.desert.example.testcases;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.monstrenyatko.desert.core.TestCase;
import com.monstrenyatko.desert.example.steps.SearchSteps;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchTest extends TestCase {

	private SearchSteps search;

	@Before
	public void initPageObjects() {
		search = new SearchSteps(getDriver());
	}

	@Test
	public void Search_01_Ok() {
		final String text = "monstrenyatko";
		search.search(text);
		search.waitABit(1000);
		search.verifySearch(text);
	}
}
