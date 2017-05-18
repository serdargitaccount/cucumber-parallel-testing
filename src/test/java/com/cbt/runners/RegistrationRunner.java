package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		format = {"html:target/cucumber-report/registration", 
		"json:target/cucumber-report/registration/cucumber.json"},
		//Bu cucumber'in eski versiyonu oldugu icin plugin yerine format kullaniyoruz. Geri kalan kismi 
		// raporlama icin kullanilan dosya uzantilari.
		features= "./src/test/resources/features/registration",
		glue="com/cbt/stepdefs"
		
		
		)


public class RegistrationRunner {

	
}
