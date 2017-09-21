package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;;

/**
 * Created by mesa1 on 7/09/2017.
 * A class built to abstract the browser driver so that you can launch with any browser in the main class by changing
 * the method call for this class
 */
public class BrowserLaunch {
    //Webdriver that will be returned to the main thread
    public static WebDriver mainDriver;
    //Constructor
    public BrowserLaunch(BrowserType Browser){
        if(Browser == BrowserType.CHROME){
            mainDriver = launchChrome();
        }
        else if(Browser == BrowserType.FIREFOX){
            mainDriver = launchFirefox();
        }
        else if(Browser == BrowserType.IE){
            mainDriver = launchIE();
        }
        else {
            mainDriver = launchEdgeDriver();
        }
    }
    //Getter Method
    public static WebDriver getBrowser(){
        return mainDriver;
    }
    //Chrome
    public static WebDriver launchChrome(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        return chromeDriver;
    }
    //FireFox
    public static WebDriver launchFirefox(){
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
        WebDriver fireFoxDriver = new FirefoxDriver();
        return fireFoxDriver;
    }
    //Internet Explorer
    public static WebDriver launchIE(){
        System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IE.exe");
        DesiredCapabilities capabilities =
                DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                true);
        WebDriver IEDriver = new InternetExplorerDriver(capabilities);
        return IEDriver;
    }
    //Edge -- Currently needs some updating before its functional
    public static WebDriver launchEdgeDriver(){
        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\Edge.exe");
        WebDriver edgeDriver = new EdgeDriver();
        return edgeDriver;
    }
}
