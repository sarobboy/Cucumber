package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TvPurchaseSteps {
	
	@When("user search Tv")
	public void user_search_Tv() throws Throwable {
		WebElement findElement = MobilePurchaseSteps.driver.findElement(By.name("q"));
		findElement.sendKeys("sony tv",Keys.ENTER);
		Thread.sleep(2000);
		WebElement text = MobilePurchaseSteps.driver.findElement(By.xpath("(//div [@class = 'col col-7-12'])[1]"));
		String name = text.getText();
		System.out.println(name);
		text.click();
	}

	@When("user choose the Tv and doing payments")
	public void user_choose_the_Tv_and_doing_payments() {
		String parent = MobilePurchaseSteps.driver.getWindowHandle();
		Set<String> child = MobilePurchaseSteps.driver.getWindowHandles();
		for(String x:child) {
			if(!x.equals(parent)) {
				MobilePurchaseSteps.driver.switchTo().window(x);
				System.out.println("window switched");
				
			}
		}
	}

	@When("user search Tv by using one dim list")
	public void user_search_Tv_by_using_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws Throwable {
			   List<String> asList = dataTable.asList();
			   MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(asList.get(2),Keys.ENTER);
			   Thread.sleep(2000);
			   WebElement element = MobilePurchaseSteps.driver.findElement(By.xpath("//div [contains (text(), '"+asList.get(2)+"')]"));
			   String text = element.getText();
			   element.click();
	}


	@When("user search Tv by using one dim map")
	public void user_search_Tv_by_using_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(asMap.get("phone3"),Keys.ENTER);
		   Thread.sleep(2000);
		   WebElement element1 = MobilePurchaseSteps.driver.findElement(By.xpath("//div [contains (text(), '"+asMap.get("phone3")+"')]"));
		   String text = element1.getText();
		   element1.click();
	}

	@When("user search Tv {string}")
	public void user_search_Tv(String names) throws Throwable {
		MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
	    Thread.sleep(2000);
		WebElement element3 = MobilePurchaseSteps.driver.findElement(By.xpath("(//div [contains(text(),'"+names+"')])[2]"));
        String s = element3.getText();
        element3.click();

	}
}

//		MobilePurchaseSteps.driver.findElement(By.xpath("//button[text()='BUY NOW']"));

