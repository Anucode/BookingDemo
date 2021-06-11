import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FindFlightsPage extends BasePage{
    public FindFlightsPage(WebDriver driver) {
        super(driver);
    }

    //region Description
    @FindBy(how = How.NAME, using = "fromPort")
    private Select departureCity;

    @FindBy(how = How.NAME, using = "toPort")
    private Select destinationCity;

    @FindBy(how = How.CSS, using = ".btn.btn-primary")
    private WebElement searchFlights;
    //endregion

    //region Methods
    // To find Flights for the selected cities
    public void FindFlights(String departureCityName, String destinationCityName)
    {
        departureCity.selectByVisibleText(departureCityName);
        destinationCity.selectByVisibleText(destinationCityName);
        searchFlights.click();
    }
    //endregion
}
