package com.clipboardHealth.pages;

import com.clipboardHealth.customUtils.BrowserUtils;
import com.clipboardHealth.customUtils.ConfigurationReader;
import com.clipboardHealth.customUtils.DriverUtil;
import io.cucumber.java.et.Ja;
import javafx.scene.layout.BackgroundRepeat;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonHomePage {

    WebDriver driver;


    @FindBy (id = "nav-hamburger-menu")
    WebElement amazonHamburgerMenu;

    @FindBy (xpath = "//*[text()='TV, Appliances, Electronics']")
    WebElement tvAppliancesElectronics;

    @FindBy (xpath = "//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")
    WebElement television;

    @FindBy (xpath = "//*[text()='Samsung']")
    WebElement samsungTv;

    @FindBy (id = "a-autoid-0-announce")
    WebElement priceRangeHighToLow;

    @FindBy (xpath = "//*[@id=\"a-popover-2\"]/div/div/ul/li[3]")
    WebElement highToLowPriceFilter;

    @FindBy (xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]")
    WebElement allTvOptions;

    @FindBy (xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[1]/span/a/div/img")
    WebElement searchResultNo2;

    @FindBy (xpath = "//*[@id=\"feature-bullets\"]/h1']")
    WebElement aboutThisItem;

    @FindBy (xpath = "//*[@id=\"feature-bullets\"]/ul/li[1]")
    WebElement aboutThisSectionText;

    @FindBy (xpath = "//*[@id=\"feature-bullets\"]/ul/li[1]/span")
    WebElement featureBullets;

    @FindBy (xpath = "//*[@id=\"centerCol\"]")
    WebElement centerColumn;



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

    public AmazonHomePage clickOnTelevisionAndSelectBrand(){

        television.click();

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement word1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Samsung']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", word1);

        samsungTv.click();

        return this;
    }


    public AmazonHomePage highToLowPriceFilterAndPrintAboutThisItem(){

        priceRangeHighToLow.click();
        highToLowPriceFilter.click();

        searchResultNo2.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.getElementById('periodId').style.display='block';");


        System.out.println(featureBullets.getText());





        return this;
    }




}
