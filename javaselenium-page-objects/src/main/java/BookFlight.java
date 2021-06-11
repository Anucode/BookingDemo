import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BookFlight extends BasePage{
    public BookFlight(WebDriver driver) {
        super(driver);
    }

    //region Properties
    @FindBy(how = How.XPATH, using = "//input[@id='inputName']")
    private WebElement passengerName;

    @FindBy(how = How.XPATH, using = "//input[@id='address']")
    private WebElement passengerAddress;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    private WebElement passengerCity;

    @FindBy(how = How.XPATH, using = "//input[@id='state']")
    private WebElement passengerState;

    @FindBy(how = How.XPATH, using = "//input[@id='zipCode']")
    private WebElement passengerZipCode;

    @FindBy(how = How.XPATH, using = "//select[@id='cardType']")
    private Select creditCardType;

    @FindBy(how = How.XPATH, using = "//input[@id='creditCardNumber']")
    private WebElement creditCardNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='creditCardMonth']")
    private WebElement creditCardMonth;

    @FindBy(how = How.XPATH, using = "//input[@id='creditCardYear']")
    private WebElement creditCardYear;

    @FindBy(how = How.XPATH, using = "//input[@id='nameOnCard']")
    private WebElement cardHolderName;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement purchaseFlightTicket;
    //endregion

    //region Method
    public void PurchaseTicket(String name, String address, String state, String zipCode, String cardType, String cardNumber, String cardMonth, String cardYear, String cnameOntheCard)
    {
        passengerName.sendKeys(name);
        passengerAddress.sendKeys(address);
        passengerState.sendKeys(state);
        passengerZipCode.sendKeys(zipCode);
        creditCardType.selectByVisibleText(cardType);
        creditCardNumber.sendKeys(cardNumber);
        creditCardMonth.sendKeys(cardMonth);
        creditCardYear.sendKeys(cardYear);
        cardHolderName.sendKeys(cnameOntheCard);
        purchaseFlightTicket.click();
    }
    //endregion
}
