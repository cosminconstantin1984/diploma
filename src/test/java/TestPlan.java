
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public static void clickEnrolment() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickEnrolment();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName = "Navigate to Info Pages")
    public static void navigateToContactInfoPage() {
        driver.get(Utils.BASE_URL2_ContactInfo);
        PersonalInformation webForm = new PersonalInformation(driver);
        webForm.navigateToContactInfoPage();
        Utils.waitForElementToLoad(2);

        ContactInfo webFormTwo = new ContactInfo(driver);
        Assert.assertEquals(webFormTwo.getContactInformationHeader(), "Contact information");
        webFormTwo.navigateToCourseOptions();
        Utils.waitForElementToLoad(2);

        CourseOptions webFormThree = new CourseOptions(driver);
        Assert.assertEquals(webFormThree.getCourseOptions(), "Course options");
        webFormThree.navigateToPaymentInfo();
        Utils.waitForElementToLoad(2);

        PaymentInfo webFormFour = new PaymentInfo(driver);
        Assert.assertEquals(webFormFour.getPaymentInfo(), "Payment information");
        webFormFour.FinalPaymentInfo();
        Utils.waitForElementToLoad(2);
}

    @Test(testName = "Negative test on Navigate to Info Pages")
    public static void clickInfoPage() {
        driver.get(Utils.BASE_URL2_ContactInfo);
        PersonalInformation webForm = new PersonalInformation(driver);
        Assert.assertEquals(webForm.getpersonalinformationheader(), "Personal information");
        webForm.InfoPage();
        Utils.waitForElementToLoad(2);
    }

    @Test(testName = "Negative test on Navigate to Contact Info")
    public static void StopNavigateToCourseOptions() {
        driver.get(Utils.BASE_URL2_ContactInfo);
        PersonalInformation webForm = new PersonalInformation(driver);
        webForm.navigateToContactInfoPage();
        Utils.waitForElementToLoad(2);
        ContactInfo webFormTwo = new ContactInfo(driver);
        Assert.assertEquals(webFormTwo.getContactInformationHeader(), "Contact information");
        webFormTwo.StopNavigateToCourseOptions();
        Utils.waitForElementToLoad(2);

    }

    @Test(testName ="ReadmoreBlackbuttonsection")
    public static void clickReadmoreBlackbutton() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreBlackButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getVirtual(), "Virtual");
        Utils.waitForElementToLoad(2);
    }

    @Test(testName ="Readmore Blackbutton section back")
    public static void clickReadmoreBlackbuttonback() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreBlackButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getVirtual(), "Virtual");
        Utils.waitForElementToLoad(2);
        webForm.clickReadmoreBlackButtonback();
        Utils.waitForElementToLoad(2);

    }

    @Test(testName ="ReadmoreGraybuttonsection")
    public static void clickReadmoreGraybutton() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreGrayButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getHybrid(), "Hybrid");
        Utils.waitForElementToLoad(2);
    }

    @Test(testName ="Readmore Gray button section back")
    public static void clickReadmoreGraybuttonback() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreGrayButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getHybrid(), "Hybrid");
        Utils.waitForElementToLoad(2);
        webForm.ReadmoreGrayButtonback();
        Utils.waitForElementToLoad(2);
    }

    @Test(testName ="ReadmoreBlacksecondbuttonsection")
    public static void clickReadmoreBlacksecondbutton() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreBlackSecondButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getInPerson(), "In Person");
        Utils.waitForElementToLoad(2);
    }

    @Test(testName ="Readmore Black secondbuttonsection back")
    public static void ReadmoreBlacksecondbuttonback() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickReadmoreBlackSecondButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.getInPerson(), "In Person");
        Utils.waitForElementToLoad(2);
        webForm.ReadmoreBlacksecondbuttonback();
        Utils.waitForElementToLoad(2);

    }

    @Test(testName ="EmailAdressSearch")
    public static void SiteSearch() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.SiteSearch();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName ="WrongEmailadress")
    public static void SiteSearchWrong() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.SiteSearchWrong();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName ="QuestionOne")
    public static void clickOnQuestionOne() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.clickOnQuestionOne();
        Utils.waitForElementToLoad(5);

    }

    @Test(testName ="QuestionTwo")
    public static void clickOnQuestionTwo() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.clickOnQuestionTwo();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionThree")
    public static void clickOnQuestionThree() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.clickOnQuestionThree();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionFour")
    public static void clickOnQuestionFour() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.clickOnQuestionFour();
        Utils.waitForElementToLoad(5);
    }

    @Test(testName ="QuestionFive")
    public static void clickOnQuestionFive() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.clickOnQuestionFive();
        Utils.waitForElementToLoad(5);
    }

 @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.close();
    }
}
