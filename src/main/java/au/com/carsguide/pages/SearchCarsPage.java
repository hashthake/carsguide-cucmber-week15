package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCarsPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchCarsPage.class.getName());

    public SearchCarsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/label[1]")
    WebElement allnewusedcars;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makes;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCartab;

    @CacheLookup
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[6]/div[2]/div[1]/a[1]")
    WebElement carmake;

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedlink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/label[3]")
    WebElement usedCarsPage;

    public void navigateToUsedCarsForSale() {
        log.info("click Used link : " + usedCarsPage.toString() + "<br>");
        clickOnElement(usedCarsPage);
    }
    public void clickOnUsedLink() {
        log.info("navigate to Used Cars For Sale page : " + usedlink.toString() + "<br>");
        clickOnElement(usedlink);
    }
    public String verifyMake(String make) {
        String message = getTextFromElement(carmake);
        log.info("verify Make : " + carmake.toString() + "<br>");
        return message;
    }
    public void selectMake(String Make) {
        log.info("Select make : " + makes.toString() + "<br>");
        selectByVisibleTextFromDropDown(makes, Make);
    }
    public void selectModel(String Model) {
        log.info("Select  model : " + findMyNextCartab.toString() + "<br>");
        selectByVisibleTextFromDropDown(model, Model);
    }
    public void selectLocation(String Location) {
        log.info("Select  location : " + findMyNextCartab.toString() + "<br>");
        selectByVisibleTextFromDropDown(location, Location);
    }
    public void selectPrice(String Price) {
        log.info("Select  price : " + findMyNextCartab.toString() + "<br>");
        selectByVisibleTextFromDropDown(price, Price);
    }
    public void clickFindMyNextCarTab() {
        log.info("Click on Find My Next Car tab : " + findMyNextCartab.toString() + "<br>");
        clickOnElement(findMyNextCartab);
    }
}
