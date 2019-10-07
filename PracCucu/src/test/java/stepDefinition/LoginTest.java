package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/login");
	    driver.manage().window().maximize();
	}

	@When("user enters id and pass")
	public void user_enters_id_and_pass(io.cucumber.datatable.DataTable dataTable) {
	  List<String> data= dataTable.asList();
	  driver.findElement(By.id("username")).sendKeys(data.get(0));
	  driver.findElement(By.id("password")).sendKeys(data.get(1));
	  driver.findElement(By.className("fa-sign-in")).click();
	}

	@Then("logged in successfully")
	public void logged_in_successfully() {
	   System.out.println("Login successful");
	}
}
