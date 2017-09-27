
import Browser.BrowserLaunch;
import Browser.BrowserType;
import Exercises.SecondExercise;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

/**
 * Created by mesa1 on 6/09/2017.
 */
public class DriveCarDrive {
    private static final BrowserType browserInTest = BrowserType.CHROME;
    private static final String carMake = "Audi";
    private static final String carType = "RS4";
    private static final boolean used = true;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        BrowserLaunch launcher = new BrowserLaunch(browserInTest);
        WebDriver Driver = BrowserLaunch.getBrowser();
        Driver.manage().window().maximize();
       // FirstExercise.Run(Driver,carMake,carType);
       // TradeMeHomePage.ReturnHome(Driver);
        SecondExercise.Run(Driver,carMake,carType);
        Driver.quit();
    }
}
