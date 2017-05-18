package com.cbt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefs {
	
	private WebDriver driver;
	
	public StepDefs(SharedDriver sharedDriver) {
		
		driver = sharedDriver;
		
	}
	

	@Given("^I am on the home page$")
	public void I_am_on_the_home_page() throws Throwable {
	  //go to google
		driver.get("http://google.com");
	}

	//Bu annotation'i modifiye etti. Once (.*) ekledi, daha sonra paranteze String option parametresi koydu.
	//Diger step definitionlari sildi ve bu sekilde diger butun step definitionlari bire indirdigini soyledi.
	//(.*) ile parametreye konulan any string'i kastetti. Dolayisi ile option degiskenini koydugumuz sendkeys kismi 
	//feature file daki butun stringleri sira ile google'a gonderdi.
	@Then("^I should be able to(.*)$")
	public void I_should_be_able_to_login(String option) throws Throwable {
		// search
		driver.findElement(By.name("q")).sendKeys(option);
		Thread.sleep(2000);
	}
	
}
