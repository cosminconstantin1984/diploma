import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfo extends PageObject{

    private final String EmailForm="cosminel.com";
    private final String Phone="0766472524";
    private final String Country="Romania";
    private final String City="Brasov";
    private final String PostalCode="300312";

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
    private WebElement nextbutton1;

    public ContactInfo (WebDriver driver) {
        super(driver);
    }

    public void populateEmailForm() {this.emailform.sendKeys(EmailForm);}

    public void populatePhone() {this.phone.sendKeys(Phone);}

    public void populateCountry() {this.country.sendKeys(Country);}

    public void populateCity() {this.city.sendKeys(City);}

    public void populatePostalCode() {this.postalcode.sendKeys(PostalCode);}

    public void populateNextButton1(){this.nextbutton1.click();}

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

            populateNextButton1();
            Utils.waitForElementToLoad(2);
    }

}
