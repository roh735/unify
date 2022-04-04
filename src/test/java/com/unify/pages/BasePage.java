package com.unify.pages;

import com.unify.utilities.ConfigurationReader;
import com.unify.utilities.Driver;
import com.unify.utilities.NotUseless;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public abstract class BasePage {

    //--PageFactoryMainMenus--------------------------------------------------------------------------------------------
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    //--Declaring things------------------------------------------------------------------------------------------------
    public static Map<String, WebElement> uMenuList = new HashMap<>();
    public static Map<String, String> currentUrlMap = new HashMap<>();
    public static ArrayList<String> mainMenuIndexation = new ArrayList<>();
    public static NotUseless notUseless = new NotUseless();


    //--Main menu Logo--------------------------------------------------------------------------------------------------
    @FindBy(id = "Layer_1")
    public WebElement logoHome;

    //--Main menu BTN---------------------------------------------------------------------------------------------------
    @FindBy(id = "primary-trigger")
    public static WebElement mainMenuBtn;

    //--Main menu-------------------------------------------------------------------------------------------------------
    @FindBy(linkText = "About")
    public static WebElement aboutPage;
    @FindBy(linkText = "Work")
    public static WebElement workPage;
    @FindBy(linkText = "People")
    public static WebElement peoplePage;
    @FindBy(linkText = "Careers")
    public static WebElement careersPage;
    @FindBy(linkText = "Insights")
    public static WebElement insightsPage;
    @FindBy(linkText = "Contact")
    public static WebElement contactPage;

    //--Main menu List--------------------------------------------------------------------------------------------------
    public static List<WebElement> menuPages = Arrays.asList(
            aboutPage,
            workPage,
            peoplePage,
            careersPage,
            insightsPage,
            contactPage);

    //--Email\Phone navMenu element-------------------------------------------------------------------------------------
    @FindBy(id = "nav-contact")
    public static WebElement epNavMenu;

    //--Email element---------------------------------------------------------------------------------------------------
    @FindBy(linkText = "hello@unifyconsulting.com")
    public static WebElement emailMenu;

    //--Phone element---------------------------------------------------------------------------------------------------
    @FindBy(linkText = "206.395.2600")
    public static WebElement phoneMenu;

    //--social navMenu element------------------------------------------------------------------------------------------
    @FindBy(id = "nav-social")
    public static WebElement socialNavMenu;

    //--Facebook element------------------------------------------------------------------------------------------------
    @FindBy(linkText = "Facebook")
    public static WebElement facebookSocial;

    //--LinkedIn element------------------------------------------------------------------------------------------------
    @FindBy(linkText = "LinkedIn")
    public static WebElement linkedInSocial;

    //--Instagram element-----------------------------------------------------------------------------------------------
    @FindBy(linkText = "Instagram")
    public static WebElement instagramSocial;



//__
//  \__public Methods Start_____________________________________________________________________________________________

    //--Find Elements MainMenu------------------------------------------------------------------------------------------
    public static Map<String, WebElement> menuLoader() {
        for (int i = 0; i < menuPages.size(); i++) {
            uMenuList.put(menuPages.get(i).getText(), menuPages.get(i));
        }
        return uMenuList;

    }

    //--Find Elements MainMenu------------------------------------------------------------------------------------------
    //--Manual SetUp----------------------------------------------------------------------------------------------------
    public static Map<String, String> mapCurrentUrlLoader() {
        currentUrlMap.put("About", ConfigurationReader.getProperty("homePage")+"about/");
        currentUrlMap.put("Work", ConfigurationReader.getProperty("homePage")+"work/");
        currentUrlMap.put("People", ConfigurationReader.getProperty("homePage")+"people/");
        currentUrlMap.put("Careers", ConfigurationReader.getProperty("homePage")+"careers/");
        currentUrlMap.put("Insights", ConfigurationReader.getProperty("homePage")+"insights/");
        currentUrlMap.put("Contact", ConfigurationReader.getProperty("homePage")+"contact/");

        return currentUrlMap;
    }

    //--Find Index of MainMenu------------------------------------------------------------------------------------------
    //--Manual SetUp----------------------------------------------------------------------------------------------------
    public static String getMenuByIndex(int index){
        mainMenuIndexation.add("About");
        mainMenuIndexation.add("Work");
        mainMenuIndexation.add("People");
        mainMenuIndexation.add("Careers");
        mainMenuIndexation.add("Insights");
        mainMenuIndexation.add("Contact");
        return mainMenuIndexation.get(index);

    }

//  __public Methods END________________________________________________________________________________________________
//_/

}