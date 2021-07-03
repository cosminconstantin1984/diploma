import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInfo extends PageObject{

    private final String cardHolder="CosminIonascu";
    private final String cardNumber="12345678";
    private final String CIV="123";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHoldersection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumbersection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement civ;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement month;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement year;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButtonsection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement homepage;

    public PaymentInfo (WebDriver driver) {
        super(driver);
    }

    public void populateCardHolder() {this.cardHoldersection.sendKeys(cardHolder);}

    public void populateCardNumber() {this.cardNumbersection.sendKeys(cardNumber);}

    public void populateCiv() {this.civ.sendKeys(CIV);}

    public void populateMonth() {this.month.click();}

    public void populateYear() {this.year.click();}

    public void populateNextButtonSection(){this.nextButtonsection.click();}

    public void populateHomePage(){this.homepage.click();}

    public void FinalPaymentInfo(){

       populateCardHolder();
       Utils.waitForElementToLoad(2);

       populateCardNumber();
       Utils.waitForElementToLoad(2);

       populateCiv();
       Utils.waitForElementToLoad(2);

       populateMonth();
       Utils.waitForElementToLoad(2);

       populateYear();
       Utils.waitForElementToLoad(2);

       populateNextButtonSection();
       Utils.waitForElementToLoad(2);
    }
}

