package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPOMTest {
WebDriver driver;
@Given("user is on Heroku homepage")
public void user_is_on_Heroku_homepage() {
	 System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/login");
	    driver.manage().window().maximize();
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	 LoginOR ob=new LoginOR(driver);
	 ob.name.sendKeys("tomsmith");
	 ob.pass.sendKeys("SuperSecretPassword!");
	 driver.findElement(By.className("radius")).click();
}

@Then("login successfully")
public void login_successfully() {
	   System.out.println("Login successful");
}

}
