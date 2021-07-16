import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {


    private final String emailEMAIL ="cosminel_ctin@yahoo.com";
    private final String wrongEmail= "zxcdt";

    @FindBy(xpath = "/html/body/section[1]/div/div/div/button")
    private WebElement Enrolment;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readmoreBlackbutton ;
    @FindBy(xpath = "/html/body/h1")
    private WebElement containVirtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readmoreGraybutton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement containHybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readmoreBlacksecondbutton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement containInPerson;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement email;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement wrongEmailsection;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtual;
    @FindBy(xpath = "/html/body/a")
    private WebElement backvirtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybrid;
    @FindBy(xpath = "/html/body/a")
    private WebElement backhybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inperson;
    @FindBy(xpath = "/html/body/a")
    private WebElement backinperson;
    @FindBy(xpath = "//*[@id=\"questions\"]")
    private WebElement bodyQuestion;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement questionOne;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement questionTwo;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement questionThree;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement questionFour;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[5]/h3/button")
    private WebElement questionFive;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickEnrolment(){this.Enrolment.click();}

    public void SiteSearch() {this.email.sendKeys(emailEMAIL);}

    public void SiteSearchWrong() {this.wrongEmailsection.sendKeys(wrongEmail);}

    public void clickReadmoreBlackButton(){
        Utils.scrollToElement(driver, virtual);
        this.readmoreBlackbutton.click();}

    public void clickReadmoreBlackButtonback(){
        this.backvirtual.click();
    }

    public String getVirtual() {
        return this.containVirtual.getText();
    }

    public void clickReadmoreGrayButton(){
        Utils.scrollToElement(driver, hybrid);
        this.readmoreGraybutton.click();}

    public void ReadmoreGrayButtonback(){
        this.backhybrid.click();
    }

    public String getHybrid() {
        return this.containHybrid.getText();
    }

    public void clickReadmoreBlackSecondButton(){
        Utils.scrollToElement(driver, inperson);
        this.readmoreBlacksecondbutton.click();}

    public void ReadmoreBlacksecondbuttonback(){
        this.backinperson.click();
    }

    public String getInPerson() {
        return this.containInPerson.getText();
    }

    public void clickOnQuestionOne(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionOne.click();}

    public void clickOnQuestionTwo(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionTwo.click();}

    public void clickOnQuestionThree(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionThree.click();}

    public void clickOnQuestionFour(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFour.click();}

    public void clickOnQuestionFive(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFive.click();}

}