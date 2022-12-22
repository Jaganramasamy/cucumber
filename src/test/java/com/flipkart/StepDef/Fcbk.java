package com.flipkart.StepDef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.commonactions.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pageobjectmodel.FacebookPom;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fcbk extends CommonAction {
	CommonAction co= new CommonAction();
	FacebookPom fp = new FacebookPom();
//	public static WebDriver driver;
//	String name;
//	@Given("facebook page launch")
//	public void facebook_page_launch() {
//		co.browserLaunch();
//
//	    System.out.println("browser launch");
//	}

	@Given("signup is selected")
	public void signup_is_selected() throws InterruptedException {
		Thread.sleep(3000);
	    //WebElement signup = driver.findElement(By.xpath("(//*[@role='button'])[2]"));
	    
	   co.touch(fp.getSignup());
	   //signup.click();
	}

	
	@Given("first name is sent {string}")
	public void first_name_is_sent(String string1) throws InterruptedException {
		Thread.sleep(3000);
		//WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));	    
co.insertText(fp.getFname(), string1);
		//	name= string1;
//		fname.sendKeys(string1);
	}
	@Given("last name is sent {string}")
	public void last_name_is_sent(String string2) {
		//WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		co.insertText(fp.getLname(), string2);
//		  name=string2;
//		lname.sendKeys(string2);
	}
//	@When("mobile number is sent oneDim list")
//	public void mobile_number_is_sent_onedim_list(DataTable dataTable) {
//	   
//		List<String> data = dataTable.asList();
//	    name = data.get(1);
//	    WebElement hh = driver.findElement(By.name("reg_email__"));
//    hh.sendKeys(name);
	    
//	}
	@When("password is given {string}")
	public void password_is_given(String string3) {
	//  WebElement kk = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
     co.insertText(fp.getPasswd(), string3);
	  //	 name=string3;
//	  kk.sendKeys(string3);
	  
	}
	@Then("Date of birth is given")
	public void date_of_birth_is_given() throws InterruptedException {
		Thread.sleep(3000);
	  // WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(fp.getDay());
		s.selectByIndex(12);
		//WebElement mnth = driver.findElement(By.id("month"));
		Select s1 = new Select(fp.getMonth());
		s1.selectByIndex(11);
		//WebElement year = driver.findElement(By.id("year"));
		Select s2 =new Select(fp.getYear());
		s2.selectByValue("1995");
	}
	@Then("Gender is selected")
	public void gender_is_selected() throws InterruptedException {
		Thread.sleep(3000);
	   //WebElement mle = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	   co.touch(fp.getMle());
	}
	@Then("signup is submited")
	public void signup_is_submited() {
	   // WebElement submit = driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
	    co.touch(fp.getSubmit());
	}
	

@When("mobile number is sent {string}")
public void mobile_number_is_sent(String string5) {
	//WebElement hh = driver.findElement(By.name("reg_email__"));
  co.insertText(fp.getMbl(),string5);
	// hh.sendKeys(string5);    

}
@When("password is given{string}")
public void password_is_given_mndfkljdk() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}
