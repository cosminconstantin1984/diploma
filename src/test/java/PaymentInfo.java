import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInfo extends PageObject{

    private final String CardHolder="CosminIonascu";
    private final String CardNumber="12345678";
    private final String CIV="123";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardholder;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardnumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement civ;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement month;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement year;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextbutton3;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement homepage;

    public PaymentInfo (WebDriver driver) {
        super(driver);
    }

    public void populateCardHolder() {this.cardholder.sendKeys(CardHolder);}

    public void populateCardNumber() {this.cardnumber.sendKeys(CardNumber);}

    public void populateCiv() {this.civ.sendKeys(CIV);}

    public void populateMonth() {this.month.click();}

    public void populateYear() {this.year.click();}

    public void populateNextButton3(){this.nextbutton3.click();}

    public void populateHomePage(){this.homepage.click();}

    public void FinalPaymentInfo(){
       populateCardHolder();

       populateCardNumber();

       populateCiv();

       populateMonth();

       populateYear();

       populateNextButton3();
       Utils.waitForElementToLoad(3);
    }
}

