import com.sun.javafx.geom.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;

/**
 * Created by mesa1 on 7/09/2017.
 * A class built to abstract the browser driver so that you can launch with any browser in the main class by changing
 * the method call for this class
 */
public class BrowserLaunch {
    //Webdriver that will be returned to the main thread
    public static WebDriver mainDriver;
    //Constructor
    public BrowserLaunch(BrowserType Browser, String DriverLocation){
        if(Browser == BrowserType.CHROME){
            mainDriver = launchChrome(DriverLocation);
        }
        else if(Browser == BrowserType.FIREFOX){
            mainDriver = launchFirefox();
        }
        else if(Browser == BrowserType.IE){
            mainDriver = launchIE(DriverLocation);
        }
        else {
            mainDriver = launchEdgeDriver(DriverLocation);
        }
    }
    //Getter Method
    public static WebDriver getBrowser(){
        return mainDriver;
    }
    //Chrome
    public static WebDriver launchChrome(String chromeDriverLocation){
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        WebDriver chromeDriver = new ChromeDriver();
        return chromeDriver;
    }
    //FireFox - think this might actually need the gecko driver
    public static WebDriver launchFirefox(){
        WebDriver fireFoxDriver = new FirefoxDriver();
        return fireFoxDriver;
    }
    //Internet Explorer
    public static WebDriver launchIE(String IEDriverLocation){
        System.setProperty("webdriver.ie.driver", IEDriverLocation);
        DesiredCapabilities capabilities =
                DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                true);
        WebDriver IEDriver = new InternetExplorerDriver(capabilities);
        return IEDriver;
    }
    //Edge -- Currently needs some updating before its functional
    public static WebDriver launchEdgeDriver(String EdgeDriverLocation){
        System.setProperty("webdriver.edge.driver", EdgeDriverLocation);
        WebDriver edgeDriver = new EdgeDriver();
        return edgeDriver;
    }
}
