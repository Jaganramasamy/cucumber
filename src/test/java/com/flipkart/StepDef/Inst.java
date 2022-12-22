package com.flipkart.StepDef;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Inst {
	
	public static WebDriver driver;
	
	@Given("launch instagram")
	public void launch_instagram() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	}

	@Then("signup instagram")
	public void signup_instagram() throws InterruptedException {
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	}

	@Given("pass the details String")
	public void pass_the_details(String int1) {
		
//		String purl = driver.getWindowHandle();
//		Set<String> curl = driver.getWindowHandles();
//		for(String g: curl){
//			if(!purl.equals(g)){
//				driver.switchTo().window(g);
//			}
//		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement jj= driver.findElement(By.xpath("//*[@name='emailOrPhone']"));
		jj.sendKeys(int1);
		   driver.findElement(By.name("fullName")).sendKeys("Jagan ramasamy");
		   driver.findElement(By.name("username")).sendKeys("jag153");
		   driver.findElement(By.name("password")).sendKeys("1541231454vhv");
	}
	
	
	@Given("signup complete")
	public void signup_complete() {
	   WebElement submit= driver.findElement(By.xpath("//*[@type='submit']"));
	   submit.click();
}
}
