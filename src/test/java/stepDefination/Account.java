package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Account {
 WebDriver driver;
 String actual;
	
	@Given("User must be on the home page by entering the url {string}")
	public void user_must_be_on_the_home_page_by_entering_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
	 
	    
	}

	@When("clicking on url {string}")
	public void clicking_on_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.linkText("Start here.")).click();
			    
	}

	
	@Then("Registration form should be opened")
	public void registration_form_should_be_opened() {
	    // Write code here that turns the phrase above into concrete actions
		actual = driver.getTitle();
		Assert.assertEquals("Amazon Registration", actual);
	   
	}

	@When("Enter valid Your name, Mobile number, Password and Password again")
	public void enter_valid_your_name_mobile_number_password_and_password_again() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ap_customer_name")).sendKeys("parth");
		driver.findElement(By.id("ap_email")).sendKeys("807");
		driver.findElement(By.id("ap_password")).sendKeys("parth1234");
		driver.findElement(By.id("ap_password_check")).sendKeys("parth1234");
		
	}

	@Then("Verify Mobile number button should be visible")
	public void verify_mobile_number_button_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
		actual = driver.findElement(By.id("continue")).getAccessibleName();
		Assert.assertEquals("Verify mobile number", actual);
	  
	}

	@When("Enter valid Your name, email, Password and Password again")
	public void enter_valid_your_name_email_password_and_password_again() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ap_customer_name")).sendKeys("parth");
		driver.findElement(By.id("ap_email")).sendKeys("pdp");
		driver.findElement(By.id("ap_password")).sendKeys("parth1234");
		driver.findElement(By.id("ap_password_check")).sendKeys("parth1234");
		
	   
	}

	@Then("Verify email button should be visible")
	public void verify_email_button_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
		actual = driver.findElement(By.id("continue")).getAccessibleName();
		Assert.assertEquals("Verify email", actual);
	}

	@When("^Enter (.*) and (.*) and (.*) and (.*)$")
	public void enter_invalid_data(String Your_name, String Mobile_number,String Password, String Password_again) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ap_customer_name")).sendKeys(Your_name);
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys(Mobile_number);
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password_check")).sendKeys(Password_again);
		Thread.sleep(2000);
	
	 
	}

	@When("click on Continue or verify email or verify mobile number button")
	public void click_on_continue_or_verify_email_or_verify_mobile_number_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("continue")).click();
	    
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Boolean b = driver.findElement(By.className("a-box a-alert-inline a-alert-inline-error auth-inlined-error-message a-spacing-top-mini")).isDisplayed();
		System.out.println(b);
	  
	}

	
	
	

	
}
