import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingConfirmation<Public> extends BasePage{
    public BookingConfirmation(WebDriver driver) {
        super(driver);
    }

    //region Properties
    @FindBy(how = How.XPATH, using = "//h1[text()='Thank you for your purchase today!']")
    private WebElement confirmationMessage;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement confirmationId;

}
