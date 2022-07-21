package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MobilePurchaseSteps {
	static WebDriver driver;
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sarav\\\\eclipse-workspace\\\\Excel\\\\Junit\\\\Driver\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("http://www.flipkart.com");
		 driver.manage().window().maximize();
	}

	@Given("user login to flikart")
	public void user_login_to_flikart() {
		WebElement X=driver.findElement(By.xpath("//button[text()='✕']"));
		X.isDisplayed();
		X.click();
		
	}

	@When("user search mobile")
	public void user_search_mobile() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("realme",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div [contains (text(), 'realme Narzo 50 (Speed Blue, 64 GB')]")).click();
		WebElement Text = driver.findElement(By.xpath("//div [contains (text(), 'realme Narzo 50 (Speed Blue, 64 GB')]"));
		String name = Text.getText();
		System.out.println(name);
		Text.click();
		
	}

	@When("user choose the mobile and doing payments")
	public void user_choose_the_mobile_and_doing_payments() {
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for(String x : child) {
			if(!x.equals(parent)) {
				driver.switchTo().window(x);
				System.out.println("window handled");
			}	
		}
		
	}

	@Then("user receives order confirmation message")
	public void user_receives_order_confirmation_message() {
		WebElement ss = driver.findElement(By.xpath("//button [contains (text(),'NOTIFY ME')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ss);
		String text = ss.getText();
		Assert.assertEquals("NOTIFY ME", text);
	}
	
	@When("user search mobile by using one dim list")
	public void user_search_mobile_by_using_one_dim_list(DataTable dataTable) throws Throwable {
	   List<String> asList = dataTable.asList();
	   driver.findElement(By.name("q")).sendKeys(asList.get(2),Keys.ENTER);
	   Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//div [contains (text(), '"+asList.get(2)+"')]"));
	   String text = element.getText();
	   element.click();

	}
	
	@When("user search mobile by using one dim map")
	public void user_search_mobile_by_using_one_dim_map(DataTable dataTable) throws Throwable {
	   Map<String, String> asMap = dataTable.asMap(String.class,String.class);
	   driver.findElement(By.name("q")).sendKeys(asMap.get("phone3"),Keys.ENTER);
	   Thread.sleep(2000);
	   WebElement element1 = driver.findElement(By.xpath("//div [contains (text(), '"+asMap.get("phone3")+"')]"));
	   String text = element1.getText();
	   element1.click();
	}
	
	@When("user search mobile {string}")
	public void user_search_mobile(String names) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
	    Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("(//div [contains(text(),'"+names+"')])[2]"));
        String s = element3.getText();
        element3.click();
	}


}
