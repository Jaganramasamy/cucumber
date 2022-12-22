package org.commonactions;

import org.openqa.selenium.WebElement;

public abstract class CommonActions {

	public abstract void browserLaunch();
	public abstract void browserClose();
	public abstract void insertText(WebElement ele, String value);
	public abstract void touch(WebElement element);
	public abstract void whandling();
	public abstract void screenShot();
	public abstract void jsexecutor(WebElement ele);
	public abstract void mouseOver(WebElement element);
	//public abstract void scroll();
	public abstract void dropDown(WebElement element, String s1, int i);
	
}
