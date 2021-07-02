import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonalInformation extends PageObject {

    private final String FirstName="Cosmin";
    private final String LastName="Ionascu";
    private final String UserName="IonascuCosmin";
    private final String Password="IonascuCosmin";
    private final String ConfirmPassword="IonascuCosmin";


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


            populateFirstName();

            populateLastName();

            populateUserName();

            populatePassword();

            populateConfirmPassword();

            populateNextButton();


    }
}
