
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

    @Test(testName = "Navigate to ContactInfo")
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

    @Test(testName ="Readmoreblack1")
    public static void populateReadmoreblack1 () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateReadmoreblack1();
    }

    @Test(testName ="Readmoregray")
    public static void populateReadmoregray() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populateReadmoregray();
    }

    @Test(testName ="Readmoreblack2")
    public static void populateReadmoreblack2() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populateReadmoreblack2();
    }

    @Test(testName ="Email")
    public static void populateSiteSearch() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateSiteSearch();
    }

    @Test(testName ="Wrong")
    public static void populateSiteSearch1() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(2);
        webForm.populateSiteSearch1();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName ="Fundamentals")
    public static void populateReadmorefundamental () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populateReadmorefundamental();
    }

    @Test(testName ="Question1")
    public static void populatequestion1() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatequestion1();
        Utils.waitForElementToLoad(5);

    }

    @Test(testName ="Question2")
    public static void populatequestion2() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatequestion2();
    }

    @Test(testName ="Question3")
    public static void populatequestion3() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatequestion3();
    }

    @Test(testName ="Question4")
    public static void populatequestion4() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatequestion4();
    }

    @Test(testName ="Question5")
    public static void populatequestion5() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.populatequestion5();
    }

 @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
