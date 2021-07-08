import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOptions extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement manualtester;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButtonsection;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement containCourseOptions;

    public CourseOptions(WebDriver driver) {
        super(driver);
    }

    public void populateManualTester() {
        this.manualtester.click();
    }

    public void populateNextButtonSection() {
        this.nextButtonsection.click();
    }

    public String getCourseOptions() {
        return this.containCourseOptions.getText();
    }

    public void navigateToPaymentInfo() {

        populateManualTester();
        Utils.waitForElementToLoad(2);

        populateNextButtonSection();
        Utils.waitForElementToLoad(2);
    }
}