package com.clipboardHealth.pages;

import com.clipboardHealth.customUtils.ConfigurationReader;
import com.clipboardHealth.customUtils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage {

    WebDriver driver;


    @FindBy (id = "nav-hamburger-menu")
    WebElement amazonHamburgerMenu;

    @FindBy (xpath = "//*[text()='TV, Appliances, Electronics']")
    WebElement tvAppliancesElectronics;


    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public AmazonHomePage open(){

        String amazonIndia = ConfigurationReader.getProperty("amazon");
        driver.get(amazonIndia);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this;
    }

    public AmazonHomePage clickOnHamburgerMenu(){

        amazonHamburgerMenu.click();

        return this;
    }


    public AmazonHomePage clickOnTargetDepartment(){

        tvAppliancesElectronics.click();

        return this;
    }



}
