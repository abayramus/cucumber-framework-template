package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefs {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("user navigates to google home page")
    public void user_navigates_to_google_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @When("user search for iphone")
    public void user_search_for_iphone() {
        googleHomePage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("verify page result contains iphone")
    public void verify_page_result_contains_iphone() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("iphone"));
    }

//CLASS END
}
