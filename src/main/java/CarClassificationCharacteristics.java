import com.sun.jna.platform.win32.WinDef;

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
    public Scanner dataScan;
//    this array should return the characteristics like this: bodystyle;make;model;pricerange;year;odometer;engineseize;doors;transmission; fuel;region;listingtype)

    //Constructor
    public CarClassificationCharacteristics(boolean used) throws FileNotFoundException {
        this.dataScan = new Scanner(new BufferedInputStream(new FileInputStream(new File("data.txt"))));
    }
    //Getter Method
    public HashMap getCharacteristics(){
        return this.carCharacteristics;
    }

    public HashMap addCharacteristics() {
        HashMap Characteristics = new HashMap<String,Object>();
        //BodyStyle
        Characteristics.put(this.dataScan,this.dataScan.next());
        //Make
        Characteristics.put(this.dataScan,this.dataScan.next());
        //Model
        Characteristics.put(this.dataScan,this.dataScan.next());
        //PriceRangeMin
        Characteristics.put(this.dataScan,this.dataScan.nextInt());
        //PriceRangeMax
        Characteristics.put(this.dataScan,this.dataScan.nextInt());
        //Keywords
        //OdometerMin
        //OdometerMax
        //EngineSizeMin
        //engineSizeMax
        //numDoorsMin
        //numDoorsMax
        //Transmission
        //fuelType
        //Region
        //listingType
        return Characteristics;
    }
}
