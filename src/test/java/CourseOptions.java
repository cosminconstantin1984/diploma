import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOptions extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement manualtester;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextbutton2;


    public CourseOptions(WebDriver driver) {
        super(driver);
    }

    public void populateManualTester() {
        this.manualtester.click();
    }

    public void populateNextButton2() {
        this.nextbutton2.click();
    }


    public void navigateToPaymentInfo() {

        driver.get(Utils.BASE_URL3_CourseOptions);
        CourseOptions webFormThree = new CourseOptions(driver);
        webFormThree.populateManualTester();
        Utils.waitForElementToLoad(10);


        webFormThree.populateNextButton2();
        Utils.waitForElementToLoad(10);
    }
}