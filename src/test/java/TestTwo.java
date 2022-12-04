import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestTwo {
    private WebDriver driver;
    @Test
    public void startTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HeadPage objHeadPage = new HeadPage(driver);
        FormPage objFormPage = new FormPage(driver);

        objHeadPage.clickCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objHeadPage.clickOrder();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setName("Алексей");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setSurname("Андреев");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setAdress("г. Москва, ул. Ленина д.5");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setMetro("Митино");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setNumber("+75847532743");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.clickNext();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setDate("06.12.2022");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setPeriod();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.clickCheckbox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.setComment("С новым аккумулятором, пожалуйста!");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.clickOrder();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.clickYes();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        objFormPage.finishCheck();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
    }
}