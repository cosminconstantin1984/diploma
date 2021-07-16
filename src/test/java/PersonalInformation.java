import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformation extends PageObject {

    private final String firstName="Cosmin";
    private final String lastName="Ionascu";
    private final String userName="IonascuCosmin";
    private final String PASSWORD="IonascuCosmin";
    private final String confirmPASSWORD="IonascuCosmin";


    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstname;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNamesection ;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmpassword;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButtonsection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement containInformationHeader;
    public String getpersonalinformationheader() {
        return this.containInformationHeader.getText();
    }


    public PersonalInformation (WebDriver driver) {
        super(driver);
    }

    public void populateFirstName() {this.firstname.sendKeys(firstName);}

    public void populateLastName() {this.lastNamesection.sendKeys(lastName);}

    public void populateUserName() {this.username.sendKeys(userName);}

    public void populatePassword() {this.password.sendKeys(PASSWORD);}

    public void populateConfirmPassword() {this.confirmpassword.sendKeys(confirmPASSWORD);}

    public void clickNextButton(){this.nextButtonsection.click();}

    public void navigateToContactInfoPage() {

        populateFirstName();
        Utils.waitForElementToLoad(2);

        populateLastName();
        Utils.waitForElementToLoad(2);

        populateUserName();
        Utils.waitForElementToLoad(2);

        populatePassword();
        Utils.waitForElementToLoad(2);

        populateConfirmPassword();
        Utils.waitForElementToLoad(2);

        clickNextButton();
        Utils.waitForElementToLoad(2);

    }
    public void InfoPage() {

        populateFirstName();
        Utils.waitForElementToLoad(2);

        populateLastName();
        Utils.waitForElementToLoad(2);

        clickNextButton();
        Utils.waitForElementToLoad(2);

    }
}
