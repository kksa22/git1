package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
	
	public WebDriver driver;
	
	@Given("open the browser and enter valid url")
	public void open_the_browser_and_enter_valid_url() {
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
	   
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		driver.findElement(By.id("email")).sendKeys("welcome");
		
	    
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	    driver.findElement(By.id("pass")).sendKeys("manager");
	}

	@When("click on ok")
	public void click_on_ok() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("user should see homepage")
	public void user_should_see_homepage() {
		
	    
	}


}
