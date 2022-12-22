package org.commonactions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction extends CommonActions  {

	public static WebDriver driver;

	@Override
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Override
	public void browserClose() {
		
		driver.quit();
	}

	@Override
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}

	@Override
	public void touch(WebElement element) {
		
		element.click();
	}

	@Override
	public void whandling() {
		
		String purl = driver.getWindowHandle();
		Set<String> curl = driver.getWindowHandles();
		for(String g: curl){
			if(!purl.equals(curl)){
				driver.switchTo().window(g);
			}
		}
	}

	@Override
	public void screenShot() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\Admin\\workspace\\New\\cucumber\\src\\Screenshot\\test.png");
		try {
			FileUtils.copyFile(src,target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void jsexecutor(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0],scrollIntoView(false)",ele );
		
	}

	@Override
	public void mouseOver(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
		
	}

	@Override
	public void dropDown(WebElement element, String s1, int i) {
		
		Select s = new Select(element);
		s.selectByValue(s1);
		s.selectByIndex(i);
	}
	
//	
//
//	public void browserClose() {
//		driver.quit();
//		
//	}
//
//	public void insertText(WebElement ele, String value) {
//		ele.sendKeys(value);
//		
//	}
//
//	public void touch(WebElement element) {
//		element.click();
//		
//	}
//
//	public void whandling() {
//		String purl = driver.getWindowHandle();
//		Set<String> curl = driver.getWindowHandles();
//		for(String g: curl){
//			if(!purl.equals(curl)){
//				driver.switchTo().window(g);
//			}
//		}
		
//	}
//
//	public void screenShot() {
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File target= new File("C:\\Users\\Admin\\workspace\\New\\cucumber\\src\\Screenshot\\test.png");
//		try {
//			FileUtils.copyFile(src,target);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	public void jsexecutor(WebElement element) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0],scrollIntoView(false)",element );
//		
//		
//	}
//
//	public void mouseOver(WebElement element) {
//		Actions a = new Actions(driver);
//		a.moveToElement(element);
//		
//	}
//
//	
//		
//	
//
//	public void dropDown(WebElement element, String s1, int i  ) {
//		
//		Select s = new Select(element);
//		s.selectByValue(s1);
//		s.selectByIndex(i);
//	}

}