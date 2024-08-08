package mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public WebDriver driver;
    @FindBy(xpath="(//*[@id=\"cookie-agree\"])")
    private WebElement cookieAccept;

    @FindBy(xpath="(//h2[text()='Онлайн пополнение '])")
    private WebElement titleElement;

    @FindBy(xpath="(//img[@alt='Visa'])")
    private WebElement visaImage;

    @FindBy(xpath="(//img[@alt='Verified By Visa'])")
    private WebElement vbVisaImage;

    @FindBy(xpath="(//img[@alt='MasterCard'])")
    private WebElement masterImage;

    @FindBy(xpath="(//img[@alt='MasterCard Secure Code'])")
    private WebElement masterscImage;

    @FindBy(xpath="(//img[@alt='Белкарт'])")
    private WebElement belcartImage;

    @FindBy(xpath="(//*[@id='pay-section']/div/div/div[2]/section/div/a)")
    private WebElement serviceLinkElement;

    @FindBy(xpath="(//input[@id='connection-phone'])")
    private WebElement phoneElement;

    @FindBy(xpath="(//input[@id='connection-sum'])")
    private WebElement summElement;

    @FindBy(xpath="(//input[@id='connection-email'])")
    private WebElement emailElement;

    @FindBy(xpath="(//*[@id='pay-connection']/button)")
    private WebElement continueButtonElement;

    @FindBy(xpath="(//span[contains(text(),'50.00 BYN')])")
    private WebElement paymentElement;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public void cookieAccept(){
        cookieAccept.click();
    }
    public String getTitle(){
        return titleElement.getText();
    }
    public boolean visaDisplayed(){
        return visaImage.isDisplayed();
    }
    public boolean vbVisaDisplayed(){
        return vbVisaImage.isDisplayed();
    }
    public boolean masterDisplayed(){
        return masterImage.isDisplayed();
    }
    public boolean masterscDisplayed(){
        return masterscImage.isDisplayed();
    }
    public boolean belcartDisplayed(){
        return belcartImage.isDisplayed();
    }
    public boolean serviceLinkCheck(){
        return serviceLinkElement.isEnabled();
    }
    public void inputPhone(String phone){
        phoneElement.sendKeys(phone);
    }
    public void inputSum(String summ){
        summElement.sendKeys(summ);
    }
    public void inputEmail(String email){
        emailElement.sendKeys(email);
    }
    public void clickContinue(){
        continueButtonElement.click();
    }
    public boolean checkContinue() {
        return paymentElement.isDisplayed();
    }
}
