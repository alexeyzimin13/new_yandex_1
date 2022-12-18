import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestOne {
    private WebDriver driver;
    @Test
    public void startTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HeadPage objHeadPage = new HeadPage(driver);
        objHeadPage.clickCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement0();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement1();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement2();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement3();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement4();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement5();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement6();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        objHeadPage.checkElement7();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}