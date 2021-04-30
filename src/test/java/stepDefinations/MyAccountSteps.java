package stepDefinations;

import Utilities.BrowserDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MyAccountSteps extends BrowserDriver {

    @Given("^I'm on Home page \"([^\"]*)\"$")
    public void i_m_on_Home_page(String url) throws Throwable {
        driver.get(url);

    }

    @When("^I click on My Account link$")
    public void i_click_on_My_Account_link() throws Throwable {
        driver.findElement(By.xpath("/html/body/header/div[2]/section/section[3]/ul/li[1]/a")).click();
    }

    @Then("^I should be on sign in page$")
    public void i_should_be_on_sign_in_page() throws Throwable {
        WebElement signInPageUniqueElem = driver.findElement(By.xpath("//*[@id=\"SignInNow\"]"));
        Assert.assertTrue(signInPageUniqueElem.isDisplayed());
    }





}









