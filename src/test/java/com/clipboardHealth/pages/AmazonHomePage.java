package com.clipboardHealth.pages;

import com.clipboardHealth.customUtils.BrowserUtils;
import com.clipboardHealth.customUtils.ConfigurationReader;
import com.clipboardHealth.customUtils.DriverUtil;
import io.cucumber.java.et.Ja;
import javafx.scene.layout.BackgroundRepeat;
import org.junit.Assert;
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

    @FindBy (xpath = "//*[@id=\"feature-bullets\"]")
    WebElement aboutThisSectionText;

    @FindBy (xpath = "//*[@id=\"feature-bullets\"]/ul/li[1]/span")
    WebElement featureBullets;

    @FindBy (xpath = "//*[@id=\"centerCol\"]")
    WebElement centerColumn;

    @FindBy (xpath = "//*[@id=\"a-page\"]")
    WebElement wholePage;




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

        BrowserUtils.sleep(4);

        String expectedFullPageItems = "Skip to main content\n" +
                ".in\n" +
                "Hello\n" +
                "Select your address\n" +
                "Televisions\n" +
                "Televisions\n" +
                "All Categories\n" +
                "Alexa Skills\n" +
                "Amazon Devices\n" +
                "Amazon Fashion\n" +
                "Amazon Fresh\n" +
                "Amazon Pharmacy\n" +
                "Appliances\n" +
                "Apps & Games\n" +
                "Baby\n" +
                "Beauty\n" +
                "Books\n" +
                "Car & Motorbike\n" +
                "Clothing & Accessories\n" +
                "Collectibles\n" +
                "Computers & Accessories\n" +
                "Deals\n" +
                "Electronics\n" +
                "Furniture\n" +
                "Garden & Outdoors\n" +
                "Gift Cards\n" +
                "Grocery & Gourmet Foods\n" +
                "Health & Personal Care\n" +
                "Home & Kitchen\n" +
                "Industrial & Scientific\n" +
                "Jewellery\n" +
                "Kindle Store\n" +
                "Luggage & Bags\n" +
                "Luxury Beauty\n" +
                "Movies & TV Shows\n" +
                "Music\n" +
                "Musical Instruments\n" +
                "Office Products\n" +
                "Pet Supplies\n" +
                "Prime Video\n" +
                "Shoes & Handbags\n" +
                "Software\n" +
                "Sports, Fitness & Outdoors\n" +
                "Subscribe & Save\n" +
                "Tools & Home Improvement\n" +
                "Toys & Games\n" +
                "Under ₹500\n" +
                "Video Games\n" +
                "Watches\n" +
                "Hello, Sign in\n" +
                "Account & Lists\n" +
                "Returns\n" +
                "& Orders\n" +
                "0\n" +
                "Cart\n" +
                "All\n" +
                "Best Sellers\n" +
                "Today's Deals\n" +
                "Mobiles\n" +
                "Customer Service\n" +
                "Books\n" +
                "Electronics\n" +
                "Prime\n" +
                "Fashion\n" +
                "New Releases\n" +
                "Home & Kitchen\n" +
                "Amazon Pay\n" +
                "Mobiles & Accessories\n" +
                "Laptops & Accessories\n" +
                "TV & Home Entertainment\n" +
                "Audio\n" +
                "Cameras\n" +
                "Computer Peripherals\n" +
                "Smart Technology\n" +
                "Musical Instruments\n" +
                "Office & Stationery\n" +
                "1-24 of 68 results\n" +
                "Sort by:\n" +
                "        \n" +
                "            Featured\n" +
                "        \n" +
                "            Price: Low to High\n" +
                "        \n" +
                "            Price: High to Low\n" +
                "        \n" +
                "            Avg. Customer Review\n" +
                "        \n" +
                "            Newest Arrivals\n" +
                "        \n" +
                "    Sort by:Price: High to Low\n" +
                "RESULTS\n" +
                "Samsung (98 Inch) 4K Neo QLED Smart TV (QN90A, Black)\n" +
                "1\n" +
                "Currently unavailable.\n" +
                "Samsung 214 cm (85 inches) 8K Ultra HD Smart Neo QLED TV QA85QN900AKXXL (Steel)\n" +
                "4\n" +
                "₹13,49,990\n" +
                "₹15,94,900 (15% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo QLED TV QA85QN90BAKXXL (Titan Black)\n" +
                "₹5,75,990\n" +
                "₹8,79,900 (35% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Only 2 left in stock.\n" +
                "Samsung 189 cm (75 inches) 4K Ultra HD Smart Neo QLED TV QA75QN90BAKXXL (Titan Black)\n" +
                "₹3,99,990\n" +
                "₹5,89,900 (32% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Only 2 left in stock.\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart Neo QLED TV QA65QN95BAKLXL (Bright Silver)\n" +
                "₹2,79,990\n" +
                "₹3,49,900 (20% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "Samsung 189 cm (75 inches) The Frame Series 4K Smart QLED TV QA75LS03BAKXXL (Black)\n" +
                "₹2,75,990\n" +
                "₹4,24,900 (35% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart Neo QLED TV QA65QN90BAKLXL (Titan Black)\n" +
                "₹2,17,990\n" +
                "₹3,04,900 (29% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) 8K Ultra HD Smart Neo QLED TV QA65QN85BAKLXL (Bright Silver)\n" +
                "₹1,98,990\n" +
                "₹2,79,900 (29% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart QLED TV QA65QN85AAKLXL (Silver)\n" +
                "1\n" +
                "₹1,94,990\n" +
                "₹2,74,900 (29% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart QLED TV QA65QN90AAKLXL (Black)\n" +
                "2\n" +
                "₹1,94,990\n" +
                "₹2,99,990 (35% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Only 2 left in stock.\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart NEO QLED TV QA55QN95BAKLXL (Bright Silver)\n" +
                "₹1,84,990\n" +
                "₹2,54,900 (27% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart NEO QLED TV QA55QN90BAKLXL (Titan Black)\n" +
                "₹1,54,990\n" +
                "₹2,19,900 (30% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "More Buying Choices\n" +
                "₹1,52,990(1 new offer)\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart NEO QLED TV QA55QN85BAKLXL (Bright Silver)\n" +
                "₹1,39,990\n" +
                "₹1,99,900 (30% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart QLED TV QA65Q60TAKXXL (Black)\n" +
                "5\n" +
                "Samsung 163 cm (65 inches) The Frame Series 4K Smart QLED TV QA65LS03BAKLXL (Black)\n" +
                "961\n" +
                "₹1,29,990\n" +
                "₹2,22,900 (42% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Only 2 left in stock.\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart QLED TV QA55QN90AAKLXL (Titan Black)\n" +
                "14\n" +
                "₹1,19,990\n" +
                "₹2,11,900 (43% off)\n" +
                "Save extra with No Cost EMI\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart QLED TV QA55Q60AAKLXL (Black)\n" +
                "9\n" +
                "Samsung 138 cm (55 inches) 4K Ultra HD Smart QLED TV QA55QN85AAKLXL (Silver)\n" +
                "₹1,09,990\n" +
                "₹1,92,900 (43% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) Ultra HD Smart LED TV UA65AU8000KLXL (Black) (2021 Model)\n" +
                "Samsung 125 cm (50 inches) 4K Ultra HD Smart NEO QLED TV QA50QN90BAKLXL (Titan Black)\n" +
                "₹1,04,999\n" +
                "₹1,36,900 (23% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "More Buying Choices\n" +
                "₹1,02,999(3 new offers)\n" +
                "Samsung 138 cm (55 inches) The Frame Series 4K Smart QLED TV QA55LS03BAKLXL (Black)\n" +
                "961\n" +
                "₹92,990\n" +
                "₹1,44,900 (36% off)\n" +
                "Get it Thursday, July 28 - Monday, August 1\n" +
                "Only 2 left in stock.\n" +
                "Samsung The Serif Series 138 cm (55 inches) 4K Ultra HD Smart QLED TV QA55LS01TAKXXL (Cloud White)\n" +
                "316\n" +
                "₹89,990\n" +
                "₹1,63,900 (45% off)\n" +
                "Save extra with No Cost EMI\n" +
                "FREE delivery by Thu, 28 Jul, 7:00 am - 9:00 pm\n" +
                "Alexa Built-in\n" +
                "Samsung 125 cm (50 inches) 4K Ultra HD Smart QLED TV QA50QN90AAKLXL (Black)\n" +
                "12\n" +
                "₹84,990\n" +
                "₹1,19,900 (29% off)\n" +
                "Save extra with No Cost EMI\n" +
                "Get it by Thursday, July 28\n" +
                "Samsung 163 cm (65 inches) 4K Ultra HD Smart LED TV UA65AU7700KLXL (Titan Gray) (2021 Model)\n" +
                "₹82,990\n" +
                "₹1,24,900 (34% off)\n" +
                "Get it by Thursday, July 28\n" +
                "Previous123Next\n" +
                "NEED HELP?\n" +
                "Visit the help section or contact us\n" +
                "Sponsored\n" +
                "Delivery Day\n" +
                "Get It by Tomorrow\n" +
                "Get It in 2 Days\n" +
                "Department\n" +
                "Electronics\n" +
                "Home Theater, TV & Video\n" +
                "Televisions\n" +
                "Smart Televisions\n" +
                "Standard Televisions\n" +
                "Avg. Customer Review\n" +
                "& Up\n" +
                "& Up\n" +
                "& Up\n" +
                "& Up\n" +
                "Brands\n" +
                "Clear\n" +
                "Samsung\n" +
                "OnePlus\n" +
                "LG\n" +
                "CROMA\n" +
                "VU\n" +
                "Sony\n" +
                "Hisense\n" +
                "MI\n" +
                "TOSHIBA\n" +
                "AmazonBasics\n" +
                "TCL\n" +
                "SANSUI\n" +
                "Price\n" +
                "₹10,000 - ₹20,000\n" +
                "₹20,000 - ₹30,000\n" +
                "₹30,000 - ₹50,000\n" +
                "Over ₹50,000\n" +
                "₹\n" +
                "₹\n" +
                "Go\n" +
                "Resolution\n" +
                "8K\n" +
                "4K\n" +
                "1080p\n" +
                "768p\n" +
                "720p\n" +
                "Model Year\n" +
                "2022\n" +
                "2021\n" +
                "2020\n" +
                "2019\n" +
                "Smart TV Platform\n" +
                "Tizen\n" +
                "Ideal Viewing Distance\n" +
                "6.1 to 8ft\n" +
                "8.1 to 10ft\n" +
                "12.1 to 15ft\n" +
                "Above 15ft\n" +
                "Display Technology\n" +
                "LED\n" +
                "QLED\n" +
                "Screen Size\n" +
                "32\" - 39\"\n" +
                "40\" - 47\"\n" +
                "48\" - 54\"\n" +
                "55\" & Above\n" +
                "Control Method\n" +
                "App\n" +
                "Remote\n" +
                "Touch\n" +
                "Voice\n" +
                "Refresh Rate\n" +
                "60 Hz\n" +
                "120 Hz\n" +
                "Pay On Delivery\n" +
                "Eligible for Pay On Delivery\n" +
                "Number of USB Ports\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "Mounting Type\n" +
                "Wall Mount\n" +
                "Total HDMI Ports\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "Supported Internet Services\n" +
                "Apple TV\n" +
                "Netflix\n" +
                "Prime Video\n" +
                "YouTube\n" +
                "Special Features\n" +
                "Flat\n" +
                "Connectivity Technology\n" +
                "Bluetooth\n" +
                "Ethernet\n" +
                "HDMI\n" +
                "USB\n" +
                "Wi-Fi\n" +
                "New Arrivals\n" +
                "Last 30 days\n" +
                "Last 90 days\n" +
                "Item condition\n" +
                "New\n" +
                "Renewed\n" +
                "Discount\n" +
                "10% Off or more\n" +
                "25% Off or more\n" +
                "35% Off or more\n" +
                "50% Off or more\n" +
                "Seller\n" +
                "DAWNTECH ELECTRONICS PRIVATE LIMITED\n" +
                "Big_Savings_Offers\n" +
                "BEST ELECTRONICS FOR YOU\n" +
                "Interglobe Electro India\n" +
                "Bestbuy Online\n" +
                "EnetSLP\n" +
                "WONDERSHOPEE\n" +
                "Appario Retail Private Ltd\n" +
                "BIG BACHAT SALE\n" +
                "gadgets storm\n" +
                "Availability\n" +
                "Include Out of Stock\n" +
                "Sponsored\n" +
                "\n" +
                "\n" +
                "Back to top\n" +
                "Get to Know Us\n" +
                "About Us\n" +
                "Careers\n" +
                "Press Releases\n" +
                "Amazon Cares\n" +
                "Gift a Smile\n" +
                "Amazon Science\n" +
                "Connect with Us\n" +
                "Facebook\n" +
                "Twitter\n" +
                "Instagram\n" +
                "Make Money with Us\n" +
                "Sell on Amazon\n" +
                "Sell under Amazon Accelerator\n" +
                "Amazon Global Selling\n" +
                "Become an Affiliate\n" +
                "Fulfilment by Amazon\n" +
                "Advertise Your Products\n" +
                "Amazon Pay on Merchants\n" +
                "Let Us Help You\n" +
                "COVID-19 and Amazon\n" +
                "Your Account\n" +
                "Returns Centre\n" +
                "100% Purchase Protection\n" +
                "Amazon App Download\n" +
                "Amazon Assistant Download\n" +
                "Help\n" +
                "English\n" +
                "AustraliaBrazilCanadaChinaFranceGermanyItalyJapanMexicoNetherlandsPolandSingaporeSpainTurkeyUnited Arab EmiratesUnited KingdomUnited States\n" +
                "AbeBooks\n" +
                "Books, art\n" +
                "& collectibles Amazon Web Services\n" +
                "Scalable Cloud\n" +
                "Computing Services Audible\n" +
                "Download\n" +
                "Audio Books DPReview\n" +
                "Digital\n" +
                "Photography IMDb\n" +
                "Movies, TV\n" +
                "& Celebrities\n" +
                "  Shopbop\n" +
                "Designer\n" +
                "Fashion Brands Amazon Business\n" +
                "Everything For\n" +
                "Your Business Prime Now\n" +
                "2-Hour Delivery\n" +
                "on Everyday Items Amazon Prime Music\n" +
                "90 million songs, ad-free\n" +
                "Over 15 million podcast episodes  \n" +
                "Conditions of Use & SalePrivacy NoticeInterest-Based Ads© 1996-2022, Amazon.com, Inc. or its affiliates";


        Assert.assertEquals(expectedFullPageItems, wholePage.getText());
        System.out.println(wholePage.getText());


        return this;
    }




}
