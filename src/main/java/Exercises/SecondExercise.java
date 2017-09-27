package Exercises;

import Pages.MotorsHome;
import Pages.TradeMeHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by mesa1 on 21/09/2017.
 * This class is a second attempt at creating a more specific attack at getting the 'best' car the person wants; with a
 * deliberately vague adjective in the requirements and a lack of a BA to explain it the best way is to create a class
 * that runs the suite to get back the optimal answer for each characteristic of car
 */
public class SecondExercise {

    private WebElement searchForm;
    private static Select carMakeSelection;
    private static Select carModelSelection;

    public static void Run(WebDriver driver, String carMake, String carModel) throws InterruptedException {
        driver.get(TradeMeHomePage.baseURL);
        MotorsHome.ToMotors(driver);
        carMakeSelection = new Select(MotorsHome.CarMake(driver));
        carMakeSelection.selectByVisibleText(carMake);
        carModelSelection = new Select(MotorsHome.CarModel(driver));
        carModelSelection.selectByVisibleText(carModel);
        WebElement searchForm = driver.findElement(By.id("sidebarSearch"));
        searchForm.submit();

    }
}
