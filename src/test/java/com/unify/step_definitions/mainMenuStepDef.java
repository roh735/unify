package com.unify.step_definitions;

import com.unify.pages.BasePage;
import com.unify.utilities.ConfigurationReader;
import com.unify.utilities.Driver;
import com.unify.utilities.NotUseless;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.unify.utilities.NotUseless.currentPageTest;
import static com.unify.utilities.NotUseless.mainMenuCheck;

public class mainMenuStepDef extends BasePage {
    @Given("User at home page")
    public void user_at_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));
    }

    @When("User click following menu:")
    public void user_click_following_menu(List<String> pageList) {
        NotUseless.pagesTest(pageList);
    }

    @When("User clicks on Logo with link to home page")
    public void user_clicks_on_logo_with_link_to_home_page() {
        logoHome.click();
        currentPageTest(ConfigurationReader.getProperty("homePage"));
    }

    @When("User should be able to see footer")
    public void user_should_be_able_to_see_footer() {
    }
}
