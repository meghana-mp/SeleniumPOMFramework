package com.hrm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.hrm.qa.base.TestBase;

public class WebEventListener2 extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert accept");
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Alert accept");
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Alert dismiss");
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert dismiss");

	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigating to: '" + url + "'");

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Navigated to:'" + url + "'");
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Navigating back to previous page");

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Navigated back to previous page");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigating forward to next page");

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Navigated forward to next page");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Refreshing window");

	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Refreshing window");
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Trying to find Element By : " + by.toString());
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Found Element By : " + by.toString());

		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Trying to click on: " + element.toString());

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Clicked on: " + element.toString());

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Exception occured: " + throwable);
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	
}
