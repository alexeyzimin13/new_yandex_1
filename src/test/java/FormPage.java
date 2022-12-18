import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FormPage {
    private WebDriver driver;

    private final By name = (By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input"));
    private final By surname = (By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input"));
    private final By adress = (By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input"));
    private final By metro = (By.className("select-search__input"));
    private final By number = (By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input"));
    private final By nextButton = (By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_NextButton__1_rCA > button"));
    private final By date = (By.cssSelector(".react-datepicker__input-container > input:nth-child(1)"));
    private final By period = (By.cssSelector(".Dropdown-placeholder"));
    private final By periodSelect = (By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]"));
    private final By checkbox = (By.id("black"));
    private final By comment = (By.cssSelector("div.Input_InputContainer__3NykH:nth-child(4) > input:nth-child(1)"));
    private final By orderButton = (By.cssSelector("button.Button_Middle__1CSJM:nth-child(2)"));
    private final By yesButton = (By.cssSelector("div.Order_Buttons__1xGrp:nth-child(2) > button:nth-child(2)"));
    private final By finishButton = (By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)"));

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String varName){
        driver.findElement(name).sendKeys(varName);
    }
    public void setSurname(String varSurname){
        driver.findElement(surname).sendKeys(varSurname);
    }
    public void setAdress(String varAdress){
        driver.findElement(adress).sendKeys(varAdress);
    }
    public void setMetro(String varMetro){
        driver.findElement(metro).click();
        driver.findElement(metro).sendKeys(varMetro);
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(metro).sendKeys(Keys.ENTER);
    }
    public void setNumber(String varNumber){
        driver.findElement(number).sendKeys(varNumber);
    }
    public void clickNext() {
        driver.findElement(nextButton).click();
    }
    public void setDate(String varDate){
        driver.findElement(date).click();
        driver.findElement(date).sendKeys(varDate);
        driver.findElement(date).sendKeys(Keys.ENTER);
    }
    public void setPeriod(){
        driver.findElement(period).click();
        driver.findElement(periodSelect).click();
    }
    public void clickCheckbox() {
        driver.findElement(checkbox).click();
    }
    public void setComment(String varComment){
        driver.findElement(comment).sendKeys(varComment);
    }
    public void clickOrder() {
        driver.findElement(orderButton).click();
    }
    public void clickYes() {
        driver.findElement(yesButton).click();
    }
    public void finishCheck() {
        WebElement finish = driver.findElement(finishButton);
        Assert.assertTrue(finish.isDisplayed());
    }
}
