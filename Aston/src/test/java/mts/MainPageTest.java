package mts;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainPageTest {
    public static MainPage mainPage;
    public static WebDriver driver;

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver",ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainPage"));
        mainPage.cookieAccept();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath("(//*[@id=\"cookie-agree\"])")));
    }

    @Test
    @Order(1)
    public void titleTest(){
        String title = mainPage.getTitle();
        Assert.assertEquals(title,"Онлайн пополнение\n" + "без комиссии");
    }

    @Test
    @Order(2)
    public void imageTest(){
        Assert.assertTrue(mainPage.visaDisplayed());
        Assert.assertTrue(mainPage.vbVisaDisplayed());
        Assert.assertTrue(mainPage.masterDisplayed());
        Assert.assertTrue(mainPage.masterscDisplayed());
        Assert.assertTrue(mainPage.belcartDisplayed());
    }

    @Test
    @Order(3)
    public void serviceLinkTest(){
        Assert.assertTrue(mainPage.serviceLinkCheck());
    }

    @Test
    @Order(4)
    public void inputTest(){
        mainPage.inputPhone(ConfProperties.getProperty("phone"));
        mainPage.inputSum(ConfProperties.getProperty("summ"));
        mainPage.inputEmail(ConfProperties.getProperty("email"));
        mainPage.clickContinue();
        WebElement frame = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(frame);
        new WebDriverWait(driver,5).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(("//span[contains(text(),'50.00 BYN')]"))));
    }

    @Test
    @Order(5)
    public void continueTest(){
        mainPage.checkContinue();
    }

    @AfterAll
    public static void end(){
        driver.quit();
    }
}
