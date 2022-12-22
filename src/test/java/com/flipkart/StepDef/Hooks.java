package com.flipkart.StepDef;

import org.commonactions.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonAction {
	CommonAction co = new CommonAction();
	@Before
	public void launch(){
		co.browserLaunch();
		
		
	}
//	@After
//	public void close(){
//		co.browserClose();
//	}
}
