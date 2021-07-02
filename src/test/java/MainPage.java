import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {


    private final String EMAIL1 ="cosminel_ctin@yahoo.com";
    private final String Wrong= "zxcdt";

    /*private final String FirstName="Cosmin";
    private final String LastName="Ionascu";
    private final String UserName="IonascuCosmin";
    private final String Password="IonascuCosmin";
    private final String ConfirmPassword="IonascuCosmin";*/

    /*private final String EmailForm="cosminel_ctin@yahoo.com";
    private final String Phone="0766472524";
    private final String Country="Romania";
    private final String City="Brasov";
    private final String PostalCode="300312";*/

    /*private final String CardHolder="CosminIonascu";
    private final String CardNumber="12345678";
    private final String CIV="123";*/


    /*@FindBy(xpath = "//*[@id=\"firstName\"]")
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

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailform;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phone ;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city ;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postalcode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextbutton1;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement manualtester;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextbutton2;

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
    private WebElement homepage;*/
    @FindBy(xpath = "/html/body/section[1]/div/div/div/button")
    private WebElement Enrolment;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement Readmoreblack1 ;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement Readmoregray;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement Readmoreblack2;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement email1;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement wrong;
    @FindBy(xpath = "//*[@id=\"learn\"]/div/div/div[2]/a")
    private WebElement Readmorefundamental;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement question1;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement question2;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement question3;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement question4;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inperson;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void populateEnrolment(){this.Enrolment.click();}

    /*public void populateFirstName() {this.firstname.sendKeys(FirstName);}

    public void populateLastName() {this.lastName.sendKeys(LastName);}

    public void populateUserName() {this.username.sendKeys(UserName);}

    public void populatePassword() {this.password.sendKeys(Password);}

    public void populateConfirmPassword() {this.confirmpassword.sendKeys(ConfirmPassword);}

    public void populateNextButton(){this.nextbutton.click();}


   public void populateEmailForm() {this.emailform.sendKeys(EmailForm);}

    public void populatePhone() {this.phone.sendKeys(Phone);}

    public void populateCountry() {this.country.sendKeys(Country);}

    public void populateCity() {this.city.sendKeys(City);}

    public void populatePostalCode() {this.postalcode.sendKeys(PostalCode);}

    public void populateNextButton1(){this.nextbutton1.click();}


  public void populateManualTester(){this.manualtester.click();}

    public void populateNextButton2(){this.nextbutton2.click();}


    public void populateCardHolder() {this.cardholder.sendKeys(CardHolder);}

    public void populateCardNumber() {this.cardnumber.sendKeys(CardNumber);}

    public void populateCiv() {this.civ.sendKeys(CIV);}

    public void populateMonth() {this.month.click();}

    public void populateYear() {this.year.click();}

    public void populateNextButton3(){this.nextbutton3.click();}

    public void populateHomePage(){this.homepage.click();}*/



    public void populateSiteSearch() {this.email1.sendKeys(EMAIL1);}

    public void populateSiteSearch1() {this.wrong.sendKeys(Wrong);}

    public void populateReadmoreblack1(){
        Utils.scrollToElement(driver, virtual );
        this.Readmoreblack1.click();}

    public void populateReadmoregray(){
        Utils.scrollToElement(driver, hybrid );
        this.Readmoregray.click();}

    public void populateReadmoreblack2(){
        Utils.scrollToElement(driver, inperson);
        this.Readmoreblack2.click();}

    public void populateReadmorefundamental(){this.Readmorefundamental.click();}

    public void populatequestion1(){this.question1.click();}

    public void populatequestion2(){this.question2.click();}

    public void populatequestion3(){this.question3.click();}

    public void populatequestion4(){this.question4.click();}


}