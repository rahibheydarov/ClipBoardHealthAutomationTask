package com.clipboardHealth.stepDef;

import com.clipboardHealth.customUtils.DriverUtil;
import com.clipboardHealth.pages.AmazonHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonStepDefs {

    WebDriver driver = DriverUtil.getDriver();


    AmazonHomePage homePage = new AmazonHomePage(driver);


    @Given("The user is on the amazon homepage and clicks on hamburger menu")
    public void the_user_is_on_the_amazon_homepage_and_clicks_on_hamburger_menu() {

        homePage
                .open()
                .clickOnHamburgerMenu();

    }
    @When("departments appear clicks on TV, Appliances, Electronics")
    public void departments_appear_clicks_on_tv_appliances_electronics() {

        homePage
                .clickOnTargetDepartment();
    }

    @When("clicks on Televisions where he selects Samsung under brand and clicks on search")
    public void clicks_on_televisions_where_he_selects_samsung_under_brand_and_clicks_on_search() {

        homePage
                .clickOnTelevisionAndSelectBrand();

    }

    @Then("the outcome result is filtered for High to Low price, second item on the list is clicked and About This Item section is printed")
    public void the_outcome_result_is_filtered_for_high_to_low_price_and_about_this_item_section_is_printed() {

        homePage
                .highToLowPriceFilterAndPrintAboutThisItem();

    }



}
