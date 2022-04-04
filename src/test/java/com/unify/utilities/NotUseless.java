package com.unify.utilities;

import com.unify.pages.BasePage;
import org.openqa.selenium.By;

import static org.junit.Assert.*;
import java.util.List;

public class NotUseless extends BasePage {

    //--PageOpenerMethod------------------------------------------------------------------------------------------------
    public static void pagesTest(List<String> pageList){
        for (String currentPage: pageList) {
            mainMenuBtn.click();
            menuLoader().get(currentPage).click();
//            mainMenuCheck();
            BrowserUtils.sleep(1);
            currentPageTest(mapCurrentUrlLoader().get(currentPage));
        }
    }
    //--CurrentPageCheckerMethod----------------------------------------------------------------------------------------
    public static void currentPageTest(String expectedUrl){
        String currentUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl,currentUrl);
    }
    //--MainMenuCheckerMethod-------------------------------------------------------------------------------------------
    public static void mainMenuCheck() {

        System.out.println("\\\\______________________________                   __________________________________//");
        System.out.println("//                             Main Menu Test Running                                \\\\");
        System.out.println("\\\\______________________________                   __________________________________//");

        //--Open Menu---------------------------------------------------------------------------------------------------
        mainMenuBtn.click();

        //--Loop to check all menu pages--------------------------------------------------------------------------------
        for (int i = 0; i < menuPages.size(); i++) {
            assertEquals(mapCurrentUrlLoader().get(getMenuByIndex(i)),
                    menuLoader().get(getMenuByIndex(i)).getAttribute("href"));    // if equals actLink tp expLink
            assertEquals(getMenuByIndex(i),menuPages.get(i).getText());                 // if equals actName tp expName
            System.out.println(menuLoader().get(getMenuByIndex(i)).getText() + "links are Displayed, menu names is correct...");
        }

        epNavMenu.isDisplayed();
        System.out.println("Phone & Email titles is Displayed...");

        emailMenu.isDisplayed();
        assertEquals(ConfigurationReader.getProperty("mainMenu.email"), emailMenu.getText());
        assertEquals(ConfigurationReader.getProperty("mainMenu.emailLink"), emailMenu.getAttribute("href"));
        System.out.println("Email is Displayed...");

        phoneMenu.isDisplayed();
        assertEquals(ConfigurationReader.getProperty("mainMenu.phone"), phoneMenu.getText());
        assertEquals(ConfigurationReader.getProperty("mainMenu.phoneLink"), phoneMenu.getAttribute("href"));
        System.out.println("Phone number is Displayed...");

        socialNavMenu.isDisplayed();
        System.out.println("Facebook\\Twitter\\Linkedin Loaded...");

                facebookSocial.isDisplayed();
        assertEquals(ConfigurationReader.getProperty("mainMenu.facebook"), facebookSocial.getText());
        assertEquals(ConfigurationReader.getProperty("mainMenu.facebookLink"), facebookSocial.getAttribute("href"));
        linkedInSocial.isDisplayed();
        assertEquals(ConfigurationReader.getProperty("mainMenu.linkedin"), linkedInSocial.getText());
        assertEquals(ConfigurationReader.getProperty("mainMenu.linkedinLink"), linkedInSocial.getAttribute("href"));
        instagramSocial.isDisplayed();
        assertEquals(ConfigurationReader.getProperty("mainMenu.instagram"), instagramSocial.getText());
        assertEquals(ConfigurationReader.getProperty("mainMenu.instagramLink"), instagramSocial.getAttribute("href"));
        System.out.println("Facebook\\Twitter\\Linkedin -" + " links are displayed and urls working ok...");

        //--Close Menu--------------------------------------------------------------------------------------------------
        mainMenuBtn.click();
    }


}