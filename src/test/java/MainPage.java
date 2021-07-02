import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {


    private final String EMAIL1 ="cosminel_ctin@yahoo.com";
    private final String Wrong= "zxcdt";

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

    public void populateSiteSearch() {this.email1.sendKeys(EMAIL1);}

    public void populateSiteSearch1() {this.wrong.sendKeys(Wrong);}

    public void populateReadmoreblack1(){
        Utils.scrollToElement(driver, virtual);
        this.Readmoreblack1.click();}

    public void populateReadmoregray(){
        Utils.scrollToElement(driver, hybrid);
        this.Readmoregray.click();}

    public void populateReadmoreblack2(){
        Utils.scrollToElement(driver, inperson);
        this.Readmoreblack2.click();}

    public void populateSectionfundamental(){
        this.readMore.click();
    }

    public void populatequestionOne(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionOne.click();}

    public void populatequestionTwo(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionTwo.click();}

    public void populatequestionThree(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionThree.click();}

    public void populatequestionFour(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFour.click();}

    public void populatequestionFive(){
        Utils.scrollToElement(driver, bodyQuestion);
        this.questionFive.click();}

}