import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//import javaselenium-page-objects.src.main.java;

public class FlightBooking {
    @Test
    public void bookingTest() throws IOException {
         WebDriver driver = new ChromeDriver();
         String url = "https://blazedemo.com/";
         driver.navigate().to(url);
         // This method will be moved to BaseTest.java under the framework
         HttpURLConnection huc = null;
        huc = (HttpURLConnection)(new URL(url).openConnection());
        huc.setRequestMethod("HEAD");
        huc.connect();
        if(huc.getResponseCode()>400)
        {
            System.out.println(url+" is a broken link");
        }

        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Welcome to the Simple Travel Agency!"));
        Assert.assertTrue(driver.getCurrentUrl().contains("blazedemo"));
        //Search Flights
        INSTANCEOF<FindFlightsPage>().FindFlights("Paris","London");
        //Select Flight
        INSTANCEOF<ChooseFlight>().SelectFlight(1);
        //Purchase Ticket
        INSTANCEOF<ChooseFlight>().SelectFlight(1);
        //Purchase Ticket
        INSTANCEOF<BookFlight>().PurchaseTicket("Passenger Smith", "1 Link Road", "California", "90011", "Visa", "12345678", "06","2022","Passenger Smith");
        Assert.assertTrue(INSTANCEOF<BookingConfirmation>().confirmationMessage.isDisplayed());
        Assert.assertTrue(INSTANCEOF<BookingConfirmation>().confirmationId.isDisplayed());


    }
}

