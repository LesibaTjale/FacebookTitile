package stepdifinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FacebookStepDifinition {

    WebDriver driver;


    @Given("I launch chrome browser")
    public void i_launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver","C://Users//Mama Shongi//Documents//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
       // driver = new ChromeDriver();
        driver = new RemoteWebDriver("http://localhost:4444", new DesiredCapabilities().setBrowserName("chrome"));
    }

    @When("I open Facebook homepage")
    public void i_open_Facebook_homepage(){
        driver.get("https://www.facebook.com/");
    }

    @Then("I verify that the title is present on the page")
    public void i_verify_that_the_title_is_present_on_the_page(){

        boolean status =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("close browser")
    public void close_browser(){

        driver.quit();
    }
}



