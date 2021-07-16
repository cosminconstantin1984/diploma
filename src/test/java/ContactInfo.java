import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfo extends PageObject{

    private final String EMAILS ="cosminel_ctin@yahoo.com";
    private final String PHONE="0766472524";
    private final String COUNTRY="Romania";
    private final String CITY="Brasov";
    private final String POSTALCODE="300312";

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailform;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phone;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postalcode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButtonsection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement containInformationHeader;


    public ContactInfo (WebDriver driver) {
        super(driver);
    }

    public void populateEmailForm() {this.emailform.sendKeys(EMAILS);}

    public void populatePhone() {this.phone.sendKeys(PHONE);}

    public void populateCountry() {this.country.sendKeys(COUNTRY);}

    public void populateCity() {this.city.sendKeys(CITY);}

    public void populatePostalCode() {this.postalcode.sendKeys(POSTALCODE);}

    public void populateNextButtonSection(){this.nextButtonsection.click();}

    public String getContactInformationHeader() {
        return this.containInformationHeader.getText();
    }

    public void navigateToCourseOptions(){

            populateEmailForm();
            Utils.waitForElementToLoad(2);

            populatePhone();
            Utils.waitForElementToLoad(2);

            populateCountry();
            Utils.waitForElementToLoad(2);

            populateCity();
            Utils.waitForElementToLoad(2);

            populatePostalCode();
            Utils.waitForElementToLoad(2);

            populateNextButtonSection();
            Utils.waitForElementToLoad(2);
    }
    public void StopNavigateToCourseOptions(){

        populateEmailForm();
        Utils.waitForElementToLoad(2);

        populatePhone();
        Utils.waitForElementToLoad(2);

        populateNextButtonSection();
        Utils.waitForElementToLoad(2);
    }

}
