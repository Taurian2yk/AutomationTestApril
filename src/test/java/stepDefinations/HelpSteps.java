package stepDefinations;

import Utilities.BrowserDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelpSteps extends BrowserDriver

{

    @Given("^I'm on home page \"([^\"]*)\"$")
    public void i_m_on_home_page(String url) throws Throwable {
        driver.get(url);
    }

    @When("^I click on Help link$")
    public void i_click_on_Help_link() throws Throwable {
      driver.findElement(By.xpath("/html/body/header/div[2]/section/section[3]/ul/li[2]/a")).click();
    }

    @Then("^I should be on Help page$")
    public void i_should_be_on_Help_page() throws Throwable {
        String actualHelpResultHeading = driver.findElement(By.xpath("//*[@id=\"ihelpTitle\"]/h1")).getText();

        String expectedHelpResultHeading = "How can we help";

        Assert.assertEquals(expectedHelpResultHeading, actualHelpResultHeading);
    }






}
