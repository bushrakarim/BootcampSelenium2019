package stepDefinition;

import homepage.HomePage;
import homepageTest.HomePageTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class HomepageStepdefinition extends HomePageTest {


    @Given("I am at LetsKodeIt HomePage")
    public void i_am_at_LetsKodeIt_HomePage() throws InterruptedException, IOException {
        setUp(false,"","OS X","10.14.5","chrome","80","https://learn.letskodeit.com/");
    }
    @Given("click at practice Button")
    public void click_at_practice_Button() {
      getInItElements();
       clickPracticeButton();
    }
    @Then("close Browser")
    public void close_Browser() {
        cleanUp();
    }

    @Given("click at Select Button")
    public void click_at_Select_Button() throws Exception{
       getInItElements();
       clickPracticeButton();
       clickSelectClassBar();
        sleepFor(2);
    }
    @Then("close Browse")
    public void close_Browse() {
       cleanUp();
    }

    @Given("click at Radion Button")
    public void click_at_Radion_Button() throws InterruptedException{
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);
    }
    @Then("close the Browser")
    public void close_the_Browser() {
        cleanUp();
    }


    @Given("click at DropDown Button")
    public void click_at_DropDown_Button() throws InterruptedException {
    getInItElements();
    clickPracticeButton();
    sleepFor(2);
    }
    @Given("select benz from dropDownitems")
    public void select_benz_from_dropDownitems() throws InterruptedException {
    selectFromDrop(webElemetSelectButton,"benz");
    sleepFor(3);
    }
    @Then("close the browser")
    public void close_the_browser() {
      cleanUp();
    }

    @Given("click at Multipleslect Button")
    public void click_at_Multipleslect_Button() throws InterruptedException {
      getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "peach", "apple");
        sleepFor(3);
    }

    @Given("click at checkBox Button")
    public void click_at_checkBox_Button() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        checkButton();
        sleepFor(3);
    }

    @Given("click at openNewWindow")
    public void click_at_openNewWindow() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen();
    }
    @Then("Close the opened Window")
    public void close_the_opened_Window() throws InterruptedException {
        handleNewTab(driver).close();
        sleepFor(3);
    }
    @Given("click on Confirm button")
    public void click_on_Confirm_button() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();

    }

    @Given("Accept The Alert")
    public void accept_The_Alert() {
        okAlert();
    }
    @Given("Cancel The Alert")
    public void cancel_The_Alert() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();
        cancelAlert();
    }

    @Given("hover mouse to the webElement")
    public void hover_mouse_to_the_webElement() throws InterruptedException {
        testMouseHover();
    }



    @Given("click on the iFrame")
    public void click_on_the_iFrame() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetIframeName);
        sleepFor(2);
        iframeHandle(iFrameName);

    }

    @Given("search selenium in the iFrameBar")
    public void search_selenium_in_the_iFrameBar() throws InterruptedException {
        useSearchbar("selenium");
        sleepFor(2);
    }
}
