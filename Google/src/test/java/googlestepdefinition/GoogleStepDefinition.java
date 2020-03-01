package googlestepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import testHomePage.TestHomePage;

import java.io.IOException;

public class GoogleStepDefinition extends TestHomePage {


    @Given("I am at Google HomePage")
    public void i_am_at_Google_HomePage() throws IOException {
      setUp(false,"","OS X","10.14.5","chrome","80","https://www.google.com");
    }
    @Given("search {string}")
    public void search(String value) {
        getInitElements();
driver.findElement(By.xpath(searchBox)).sendKeys(value);
    }

    @Then("I close Browser")
    public void i_close_Browser(){
        driver.close();
    }

    @Given("I search things {string}")
    public void i_search_things(String string) {
        driver.findElement(By.xpath(searchBox)).sendKeys(string, Keys.ENTER);
        driver.close();
    }
}
