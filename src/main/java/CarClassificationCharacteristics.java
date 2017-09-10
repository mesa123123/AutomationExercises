import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Created by mesa1 on 9/09/2017.
 *
 * The main purpose of this class is to abstract away the options for what type of car you are searching for etc. in order to be able to search for many cars;
 * this will come in handy for buildnig assert cases with junit.
 */
public class CarClassificationCharacteristics {
    public HashMap carCharacteristics;
//    this array should return the characteristics like this: bodystyle;make;model;pricerange;year;odometer;engineseize;doors;transmission; fuel;region;listingtype)

    //Constructor
    public CarClassificationCharacteristics(boolean used) throws FileNotFoundException {
        Scanner in = new Scanner(new BufferedInputStream(new FileInputStream(new File("data.txt"))));
        String bodyStyle = in.next();

    }
    //Getter Method
    public HashMap getCharacteristics(){
        return this.carCharacteristics;
    }
    /*
    Side Bar Div ID SiteHeader_SideBar_AttributeSearch_groupVertical

    New/Used: "SiteHeader_SideBar_AttributeSearch_SearchTabs" they are ided 1 & 2.
            THERE ARE TWO BRANCHES THAT COME OFF THIS; SO YOU'LL HAVE TO BUILD DIFFERENTLY BASED ON WHAT TYPE YOU'RE LOOKING FOR
            IF THEY PICK USED Click on this WebElement; id="AdvancedCarSearchLink"

    -- these matter for both--

    Body Style:

    Make:

    Model:

    Price Range:

    --this matters for Used cars--
    (if Used classifications)
 	Year:	Any; before 2000 its 10 year increments back to 1950; and then skips to 1900, after 2000 its one year increments
 	Odometer: Any; 10k and then 10k increments to 100k after that 20km increments to 200km and then 50k increments to 300k
 	Engine Size: Any; increments of .5, from 1.0 to 6.0
 	Number of Doors: Any; 1-5
 	Transmission: (Manual, Automatic, Triptonic)
 	Fuel Type: (Diesel, Petrol, Hybrid, Electric, CNG, LPG, Alternative)

    Region:	Change region (North Island, Northland, Auckland, Waikato, Bay of Plenty, Gisborne, Hawke's Bay, Taranaki, Wanganui, Manawatu, Wairarapa, Wellington, South Island, Nelson Bays,
            Marlborough, West Coast, Canterbury, Timaru/Oamaru, Otago, Southland);

 	Listing type:	 (All listings,Private listings only,Dealer listings only)


     */
}
