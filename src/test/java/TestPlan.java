import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @Test(testName ="Enrolment")
    public static void populateEnrolment  () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(10);
        webForm.populateEnrolment();
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
        Utils.waitForElementToLoad(10);
        webForm.populateReadmoregray();
    }


    @Test(testName ="Readmoreblack2")
    public static void populateReadmoreblack2() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(10);
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
        Utils.waitForElementToLoad(10);
        webForm.populateSiteSearch1();
    }

    @Test(testName ="Fundamentals")
    public static void populateReadmorefundamental () {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(10);
        webForm.populateReadmorefundamental();
    }

    @Test(testName ="Question1")
    public static void populatequestion1() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(10);
        webForm.populatequestion1();
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
        Utils.waitForElementToLoad(10);
        webForm.populatequestion3();
    }

    @Test(testName ="Question4")
    public static void populatequestion4() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        Utils.waitForElementToLoad(10);
        webForm.populatequestion4();
    }


/*public static void scrollToElement(WebDriver driver, WebElement element){((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
    Utils.waitForElementToLoad(3);}*/

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
