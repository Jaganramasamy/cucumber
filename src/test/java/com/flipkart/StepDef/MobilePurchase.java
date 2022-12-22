package com.flipkart.StepDef;

import java.util.Set;

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

public class MobilePurchase {
	
	public static WebDriver driver;

	@Given("User logs in")
	public void user_logs_in() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 WebElement button=driver.findElement(By.xpath("//button[text()='✕']"));
			button.click();
	   
	}

	@When("searches redmi mobile")
	public void searches_redmi_mobile() {
		WebElement search= driver.findElement (By.name("q"));
        search.sendKeys("realme mobiles",Keys.ENTER);
	  
	   
	 
	}

	@When("Click on Mobile")
	public void click_on_mobile() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement mbl = driver.findElement(By.xpath("//div[text()='realme C31 (Dark Green, 32 GB)']"));
	    mbl.click();
	    
	}

	@And("Clicks Buy now")
	public void clicks_buy_now() {
		 String parent = driver.getWindowHandle();
         Set<String>child=driver.getWindowHandles();
         for(String x:child) {
      	   if(!parent.equals(x)) {
      		   driver.switchTo().window(x);
      	   }
         }
         
         WebElement buy = driver.findElement(By.xpath("//*[@type='button']"));
         
         buy.click();
	}
	

	@Then("Usen proceed for payment")
	public void usen_proceed_for_payment() throws InterruptedException {
		Thread.sleep(6000);
	    WebElement num = driver.findElement(By.xpath("//*[@maxlength='auto']"));
	    num.sendKeys("15641545");
	    
	    WebElement cnt = driver.findElement(By.xpath("//*[text()='CONTINUE']"));
	    cnt.click();
	}
}
