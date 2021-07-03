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
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readmoreGraybutton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readmoreBlacksecondbutton;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement email;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement wrongEmailsection;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inperson;
    @FindBy(xpath = "/html/body")
    private WebElement readMore;
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

    public void populateEnrolment(){this.Enrolment.click();}

    public void populateSiteSearch() {this.email.sendKeys(emailEMAIL);}

    public void populateSiteSearch1() {this.wrongEmailsection.sendKeys(wrongEmail);}

    public void populatereadmoreBlackbutton(){
        Utils.scrollToElement(driver, virtual);
        this.readmoreBlackbutton.click();}

    public void populatereadmoreGraybutton(){
        Utils.scrollToElement(driver, hybrid);
        this.readmoreGraybutton.click();}

    public void populatereadmoreBlacksecondbutton(){
        Utils.scrollToElement(driver, inperson);
        this.readmoreBlacksecondbutton.click();}

    public void populateSectionfundamental(){
        this.readMore.click();
    }

    public void clickonquestionOne(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionOne.click();}

    public void clickonquestionTwo(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionTwo.click();}

    public void clickonquestionThree(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionThree.click();}

    public void clickonquestionFour(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFour.click();}

    public void clickonquestionFive(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFive.click();}

}