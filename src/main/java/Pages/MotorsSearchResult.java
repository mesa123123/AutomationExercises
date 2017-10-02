package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mesa1 on 28/09/2017.
 */
public class MotorsSearchResult {

    public static WebElement SortOrder(WebDriver driver, String sortCharacteristic){
        WebElement output;
        driver.findElement(By.name("sort_order")).click();
        if(sortCharacteristic.equals("Featured first"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[1]"));
        else if(sortCharacteristic.equals("Lowest Price"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[2]"));
        else if(sortCharacteristic.equals("Highest Price"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[3]"));
        else if(sortCharacteristic.equals("Lowest Buy Now"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[4]"));
        else if(sortCharacteristic.equals("Highest Buy Now"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[5]"));
        else if(sortCharacteristic.equals("Oldest vehicles"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[6]"));
        else if(sortCharacteristic.equals("Newest vehicles"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[7]"));
        else if(sortCharacteristic.equals("Lowest kms"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[8]"));
        else if(sortCharacteristic.equals("Highest kms"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[9]"));
        else if(sortCharacteristic.equals("Latest Listings"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[10]"));
        else if(sortCharacteristic.equals("Closing Soon"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[11]"));
        else if(sortCharacteristic.equals("Make and Model Alphabetically"))
            output = driver.findElement(By.xpath("//select[@id='listingTitleBarSelect']/option[12]"));
        else
            output = driver.findElement(By.id("sort_order"));
        return output;
    }

    public static WebElement Filter(WebDriver driver, String filterCharacteristic){
        WebElement output;
        if (filterCharacteristic.equals("Classifieds"))
            output = driver.findElement(By.id("ListingsTitle_MotorFiltersControl_Classifieds_on"));
        else if (filterCharacteristic.equals("Auctions"))
            output = driver.findElement(By.id("Listing_Title_MotorFiltersControl_Auctions_on"));
        else if (filterCharacteristic.equals("Buy Now"))
            output = driver.findElement(By.id("ListingsTitle_MotorFiltersControl_BuyNow_on"));
        else  // This will act as the "All" button
            output = driver.findElement(By.id("ListingsTitle_MotorFiltersControl_All_on"));
        return output;
    }

    public static void SwitchViewStyle(WebDriver driver){
        WebElement buttonStateCheck = driver.findElement(By.cssSelector("ListingsTitle_ListingViewBar_listViewTab_icon_a"));
        String buttonClassName = buttonStateCheck.getAttribute("class");
        if (buttonClassName.equals("btn btn-checked"))
            driver.findElement(By.cssSelector("ListingsTitle_ListingViewBar_galleryViewTab_icon_a")).click();
        else
            buttonStateCheck.click();
    }
}
