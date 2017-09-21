package Exercises;


import Pages.MotorsHome;
import Pages.TradeMeHomePage;
import org.openqa.selenium.WebDriver;
/**
 * Created by mesa1 on 21/09/2017.
 */
public class FirstExercise {
    public static void Run(WebDriver Driver, String carMake, String carType) throws InterruptedException {
        Driver.get(TradeMeHomePage.baseURL);
        MotorsHome.ToMotors(Driver);
        TradeMeHomePage.SearchInputter(TradeMeHomePage.MainSearchBar(Driver),"Best " + carMake + " " + carType,true);
        Thread.sleep(3000);
        Driver.quit();
    }
}
