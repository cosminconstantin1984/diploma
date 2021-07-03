
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Enrolment")
    public static void populateEnrolment() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateEnrolment();
        Utils.waitForElementToLoad(10);
    }

    @Test(testName = "Navigate to Info Pages")
    public static void navigateToContactInfoPage() {
        driver.get(Utils.BASE_URL2_ContactInfo);
        PersonalInformation webForm = new PersonalInformation(driver);
        webForm.navigateToContactInfoPage();
        Utils.waitForElementToLoad(2);

        ContactInfo webFormTwo = new ContactInfo(driver);
        webFormTwo.navigateToCourseOptions();
        Utils.waitForElementToLoad(2);

        CourseOptions webFormThree = new CourseOptions(driver);
        webFormThree.navigateToPaymentInfo();
        Utils.waitForElementToLoad(2);

        PaymentInfo webFormFour = new PaymentInfo(driver);
        webFormFour.FinalPaymentInfo();
        Utils.waitForElementToLoad(2);

}

    @Test(testName ="readmoreBlackbuttonsection")
    public static void populatereadmoreBlackbutton () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatereadmoreBlackbutton();
    }

    @Test(testName ="readmoreGraybuttonsection")
    public static void populatereadmoreGraybutton() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populatereadmoreGraybutton();
    }

    @Test(testName ="readmoreBlacksecondbuttonsection")
    public static void populatereadmoreBlacksecondbutton() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populatereadmoreBlacksecondbutton();
    }

    @Test(testName ="Emailadresssearch")
    public static void populateSiteSearch() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populateSiteSearch();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName ="WrongEmailadress")
    public static void populateSiteSearch1() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populateSiteSearch1();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName ="sectionFundamentals")
    public static void populateSectionfundamental () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSectionfundamental();
    }

    @Test(testName ="QuestionOne")
    public static void clickonquestionOne() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickonquestionOne();
        Utils.waitForElementToLoad(5);

    }

    @Test(testName ="QuestionTwo")
    public static void clickonquestionTwo() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickonquestionTwo();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionThree")
    public static void clickonquestionThree() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickonquestionThree();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionFour")
    public static void clickonquestionFour() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickonquestionFour();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionFive")
    public static void clickonquestionFive() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickonquestionFive();
        Utils.waitForElementToLoad(5);
    }

 @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
