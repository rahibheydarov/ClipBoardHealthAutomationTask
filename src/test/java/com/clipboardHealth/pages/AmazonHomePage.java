package com.clipboardHealth.pages;

import com.clipboardHealth.customUtils.BrowserUtils;
import com.clipboardHealth.customUtils.ConfigurationReader;
import com.clipboardHealth.customUtils.DriverUtil;
import javafx.scene.layout.BackgroundRepeat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy (xpath = "//*[@id=\"s-refinements\"]/div[21]/ul/li[3]/span/a/span")
    WebElement samsungTv;

    @FindBy (id = "a-autoid-0-announce")
    WebElement priceRangeHighToLow;

    @FindBy (xpath = "//*[@id=\"a-popover-2\"]/div/div/ul/li[3]")
    WebElement highToLowPriceFilter;

    @FindBy (xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]")
    WebElement allTvOptions;

    @FindBy (xpath = "//div[@data-cel-widget='search_result_2']")
    WebElement searchResultNo2;

    @FindBy (xpath = "//*[text()=' About this item ']")
    WebElement aboutThisItem;


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

        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("window.scrollBy(0, 1750)");

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement word1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[3]/span/a/span")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", word1);

        samsungTv.click();

        return this;
    }


    public AmazonHomePage highToLowPriceFilterAndPrintAboutThisItem(){

        priceRangeHighToLow.click();
        highToLowPriceFilter.click();

//        List<WebElement> allTvOptions = driver.findElements(By.xpath("xpath is dynamic but I can solve this Java option in a longer time"));
//        BrowserUtils.sleep(1);
//        allTvOptions.get(1).click();

        searchResultNo2.click();

        BrowserUtils.sleep(3);

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement word1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=' About this item ']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", word1);


        return this;
    }




}
