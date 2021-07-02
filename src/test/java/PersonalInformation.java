import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PersonalInformation extends PageObject {

    private final String FirstName="Cosmin";
    private final String LastName="Ionascu";
    private final String UserName="IonascuCosmin";
    private final String Password="IonascuCosmin";
    private final String ConfirmPassword="IonascuCosmin";

    /*@FindBy(xpath = "/html/body/section[1]/div/div/div/button")
    private WebElement Enrolment;*/
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstname;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName ;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmpassword;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextbutton;


    public PersonalInformation (WebDriver driver) {
        super(driver);
    }


    public void populateFirstName() {this.firstname.sendKeys(FirstName);}

    public void populateLastName() {this.lastName.sendKeys(LastName);}

    public void populateUserName() {this.username.sendKeys(UserName);}

    public void populatePassword() {this.password.sendKeys(Password);}

    public void populateConfirmPassword() {this.confirmpassword.sendKeys(ConfirmPassword);}

    public void populateNextButton(){this.nextbutton.click();}

    public void navigateToContactInfoPage() {

            driver.get(Utils.BASE_URL_PersonalInfo);
            PersonalInformation webForm = new PersonalInformation(driver);
            webForm.populateFirstName();
            Utils.waitForElementToLoad(10);

            webForm.populateLastName();
            Utils.waitForElementToLoad(10);


            webForm.populateUserName();
            Utils.waitForElementToLoad(10);


            webForm.populatePassword();
            Utils.waitForElementToLoad(10);

            webForm.populateConfirmPassword();
            Utils.waitForElementToLoad(10);

            webForm.populateNextButton();
            Utils.waitForElementToLoad(10);

    }
}
