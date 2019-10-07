package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginOR {
 LoginOR(WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
 @FindBy(id="username") WebElement name;
 @FindBy(how=How.ID, using="password") WebElement pass;
}
