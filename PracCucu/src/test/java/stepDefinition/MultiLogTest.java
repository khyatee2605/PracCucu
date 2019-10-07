package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiLogTest {
	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		 System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://the-internet.herokuapp.com/login");
		    driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		 driver.findElement(By.id("username")).sendKeys(string);
		  driver.findElement(By.id("password")).sendKeys(string2);
		 // driver.findElement(By.className("fa-sign-in")).click();
	}

	@Then("login successful")
	public void login_successful() {
		System.out.println("Login successful");
	}
}
