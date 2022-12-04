import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class HeadPage {
    private WebDriver driver;

    private final By cookiesButton = By.id("rcc-confirm-button");

    private final By orderButton = (By.className("Button_Button__ra12g"));

    private final By dropElement0 = By.id("accordion__heading-0");
    private final By dropElement1 = By.id("accordion__heading-1");
    private final By dropElement2 = By.id("accordion__heading-2");
    private final By dropElement3 = By.id("accordion__heading-3");
    private final By dropElement4 = By.id("accordion__heading-4");
    private final By dropElement5 = By.id("accordion__heading-5");
    private final By dropElement6 = By.id("accordion__heading-6");
    private final By dropElement7 = By.id("accordion__heading-7");

    private final By valueElement0 = By.id("accordion__panel-0");
    private final By valueElement1 = By.id("accordion__panel-1");
    private final By valueElement2 = By.id("accordion__panel-2");
    private final By valueElement3 = By.id("accordion__panel-3");
    private final By valueElement4 = By.id("accordion__panel-4");
    private final By valueElement5 = By.id("accordion__panel-5");
    private final By valueElement6 = By.id("accordion__panel-6");
    private final By valueElement7 = By.id("accordion__panel-7");

    public String textElement0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String textElement1 ="Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String textElement2 ="Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String textElement3 ="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String textElement4 ="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String textElement5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String textElement6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String textElement7 ="Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public HeadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookies() {
        driver.findElement(cookiesButton).click();
    }
    public void clickOrder() {
        driver.findElement(orderButton).click();
    }
    public void checkElement0() {
        driver.findElement(dropElement0).click();
        driver.findElement(valueElement0).click();
        String actual = driver.findElement(valueElement0).getText();
        String expected = textElement0;
        assertEquals(expected, actual);

    }
    public void checkElement1() {
        driver.findElement(dropElement1).click();
        driver.findElement(valueElement1).click();
        String actual = driver.findElement(valueElement1).getText();
        String expected = textElement1;
        assertEquals(expected, actual);

    }
    public void checkElement2() {
        driver.findElement(dropElement2).click();
        driver.findElement(valueElement2).click();
        String actual = driver.findElement(valueElement2).getText();
        String expected = textElement2;
        assertEquals(expected, actual);

    }
    public void checkElement3() {
        driver.findElement(dropElement3).click();
        driver.findElement(valueElement3).click();
        String actual = driver.findElement(valueElement3).getText();
        String expected = textElement3;
        assertEquals(expected, actual);

    }
    public void checkElement4() {
        driver.findElement(dropElement4).click();
        driver.findElement(valueElement4).click();
        String actual = driver.findElement(valueElement4).getText();
        String expected = textElement4;
        assertEquals(expected, actual);

    }
    public void checkElement5() {
        driver.findElement(dropElement5).click();
        driver.findElement(valueElement5).click();
        String actual = driver.findElement(valueElement5).getText();
        String expected = textElement5;
        assertEquals(expected, actual);

    }
    public void checkElement6() {
        driver.findElement(dropElement6).click();
        driver.findElement(valueElement6).click();
        String actual = driver.findElement(valueElement6).getText();
        String expected = textElement6;
        assertEquals(expected, actual);

    }
    public void checkElement7() {
        driver.findElement(dropElement7).click();
        driver.findElement(valueElement7).click();
        String actual = driver.findElement(valueElement7).getText();
        String expected = textElement7;
        assertEquals(expected, actual);
    }
}
