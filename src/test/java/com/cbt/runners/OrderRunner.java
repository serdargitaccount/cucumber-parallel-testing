package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		format = {"html:target/cucumber-report/order", 
		"json:target/cucumber-report/order/cucumber.json"},
		//Bu cucumber'in eski versiyonu oldugu icin plugin yerine format kullaniyoruz. Geri kalan kismi 
		// raporlama icin kullanilan dosya uzantilari. 
		
		features= "./src/test/resources/features/order",
		glue="com/cbt/stepdefs"
		
		
		)


public class OrderRunner {

	
}
