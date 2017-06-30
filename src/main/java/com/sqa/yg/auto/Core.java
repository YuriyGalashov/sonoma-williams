package com.sqa.yg.auto;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Core {

	private Logger log = Logger.getLogger(this.getClass());

	private String baseURL;

	private WebDriver driver;

	public String getBaseURL() {
		return this.baseURL;
	}

	public Logger getLog() {
		return this.log;
	}

	public Core(String baseURL, WebDriver driver) {
		super();
		this.baseURL = baseURL;
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public boolean isPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by, getLog());
	}
}
