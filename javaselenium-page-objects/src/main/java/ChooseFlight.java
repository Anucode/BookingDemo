import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChooseFlight extends BasePage{
    public ChooseFlight(WebDriver driver) {
        super(driver);

    }
    //region Properties
    //@FindBy(how = How.XPATH, using = "//input[@type='submit'][1]")
    //private WebElement chooseFirstFlight;
    //endregion

    //region Methods
    // To select Flight for the selected cities
    public void SelectFlight(int flightNumber)
    {
        driver.findElement(By.xpath("//input[@type='submit']["+flightNumber+"]"));
    }
    //endregion
}
