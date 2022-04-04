package com.unify.step_definitions;

import io.cucumber.java.en.Then;

import static com.unify.utilities.NotUseless.mainMenuCheck;

public class allMenuPagesStepDef {

    @Then("User clicks menuBTN dropDown, make sure all menu elements displayed")
    public void userClicksMenuBTNDropDownMakeSureAllMenuElementsDisplayed() {
        mainMenuCheck();
    }
}
