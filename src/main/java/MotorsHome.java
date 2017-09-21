import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mesa1 on 9/09/2017.
 */
public class MotorsHome extends TradeMeHomePage {
        public static String motorsURL = "https://www.trademe.co.nz/motors";

        public static void ToMotors(WebDriver driver){
                try{
                    WebElement MotorsTab = driver.findElement(By.id("SearchTabs1_MotorsAnchor"));
                    MotorsTab.click();
                } catch(NoSuchElementException e){
                    TradeMeHomePage.ReturnHome(driver);
                    ToMotors(driver);
                }
        }

        public static WebElement sideSearchBar(WebDriver driver){
            return driver.findElement(By.id("sidebarSearch"));
        }

        public static WebElement BodyStyle(WebDriver driver){
            return null;
        }

        public static WebElement Model(WebDriver driver){
            return null;
        }

        public static WebElement Make(WebDriver driver){
            if(1==1/*check here to see if the model field has been entered: if you cannot make the menu drop down*/) {
                //make the user enter the model and then they can be returned the make
            }
            else {
                //just return the make
            }
            return null;
        }

        public static WebElement[] PriceRange(WebDriver driver){
            WebElement[] priceRange = new WebElement[2];
            priceRange[0] = driver.findElement(By.id("min-18"));
            priceRange[1] = driver.findElement(By.id("max-18"));
            return priceRange;
        }

        public static WebElement[] YearRange(WebDriver driver){
            WebElement[] yearRange = new WebElement[2];
            yearRange[0] = driver.findElement(By.id("min-24"));
            yearRange[1] = driver.findElement(By.id("max-24"));
            return yearRange;
        }

        public static WebElement Region(WebDriver driver){
            //TODO
            return null;
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
 	/*
     -- these matter for both--

    Body Style:
    Tag name: <select id="form_body_style" name="body_style" class="normal-drop-down">
							<option value="" selected="selected">Any type</option><option value="Convertible">Convertible</option><option value="Coupe">Coupe</option><option value="Hatchback">Hatchback</option><option value="Sedan">Sedan</option><option value="Station Wagon">Station Wagon</option><option value="RV/SUV">RV/SUV</option><option value="Ute">Ute</option><option value="Van">Van</option>
						</select>

    Make:
    <select id="form_make" name="make" class="normal-drop-down" onchange="TradeMe.Motors.UsedCars.LoadModelsForMake('form_make', 'form_model');">
							<option value="" selected="selected">Any make</option><option value="Alfa Romeo">Alfa Romeo&nbsp;(133)</option><option value="Aston Martin">Aston Martin&nbsp;(30)</option><option value="Audi">Audi&nbsp;(2281)</option><option value="Austin">Austin&nbsp;(30)</option><option value="Bentley">Bentley&nbsp;(39)</option><option value="BMW">BMW&nbsp;(4262)</option><option value="Cadillac">Cadillac&nbsp;(36)</option><option value="Chery">Chery&nbsp;(30)</option><option value="Chevrolet">Chevrolet&nbsp;(404)</option><option value="Chrysler">Chrysler&nbsp;(187)</option><option value="Citroen">Citroen&nbsp;(158)</option><option value="Daewoo">Daewoo&nbsp;(25)</option><option value="Daihatsu">Daihatsu&nbsp;(201)</option><option value="Daimler">Daimler&nbsp;(19)</option><option value="Dodge">Dodge&nbsp;(287)</option><option value="DS Automobiles">DS Automobiles&nbsp;(0)</option><option value="Ferrari">Ferrari&nbsp;(35)</option><option value="Fiat">Fiat&nbsp;(117)</option><option value="Ford">Ford&nbsp;(5047)</option><option value="Foton">Foton&nbsp;(84)</option><option value="Geely">Geely&nbsp;(1)</option><option value="GMC">GMC&nbsp;(34)</option><option value="Great Wall">Great Wall&nbsp;(123)</option><option value="HAVAL">HAVAL&nbsp;(8)</option><option value="Holden">Holden&nbsp;(4704)</option><option value="Honda">Honda&nbsp;(5350)</option><option value="HSV">HSV&nbsp;(28)</option><option value="Hummer">Hummer&nbsp;(13)</option><option value="Hyundai">Hyundai&nbsp;(1992)</option><option value="INFINITI">INFINITI&nbsp;(15)</option><option value="Isuzu">Isuzu&nbsp;(400)</option><option value="Iveco">Iveco&nbsp;(6)</option><option value="Jaguar">Jaguar&nbsp;(559)</option><option value="Jeep">Jeep&nbsp;(482)</option><option value="Kia">Kia&nbsp;(1060)</option><option value="Lamborghini">Lamborghini&nbsp;(15)</option><option value="Lancia">Lancia&nbsp;(3)</option><option value="Land Rover">Land Rover&nbsp;(609)</option><option value="LDV">LDV&nbsp;(173)</option><option value="Lexus">Lexus&nbsp;(609)</option><option value="Lotus">Lotus&nbsp;(17)</option><option value="Mahindra">Mahindra&nbsp;(27)</option><option value="Maserati">Maserati&nbsp;(79)</option><option value="Mazda">Mazda&nbsp;(8390)</option><option value="McLaren">McLaren&nbsp;(15)</option><option value="Mercedes-Benz">Mercedes-Benz&nbsp;(2615)</option><option value="MG">MG&nbsp;(49)</option><option value="MINI">MINI&nbsp;(620)</option><option value="Mitsubishi">Mitsubishi&nbsp;(3667)</option><option value="Morgan">Morgan&nbsp;(3)</option><option value="Morris">Morris&nbsp;(41)</option><option value="Nissan">Nissan&nbsp;(10942)</option><option value="Opel">Opel&nbsp;(24)</option><option value="Peugeot">Peugeot&nbsp;(545)</option><option value="Pontiac">Pontiac&nbsp;(41)</option><option value="Porsche">Porsche&nbsp;(290)</option><option value="Ram">Ram&nbsp;(3)</option><option value="Renault">Renault&nbsp;(200)</option><option value="Riley">Riley&nbsp;(3)</option><option value="Rolls-Royce">Rolls-Royce&nbsp;(15)</option><option value="Rover">Rover&nbsp;(46)</option><option value="Saab">Saab&nbsp;(34)</option><option value="Seat">Seat&nbsp;(2)</option><option value="Skoda">Skoda&nbsp;(285)</option><option value="Smart">Smart&nbsp;(21)</option><option value="Ssangyong">Ssangyong&nbsp;(443)</option><option value="Subaru">Subaru&nbsp;(3744)</option><option value="Suzuki">Suzuki&nbsp;(2824)</option><option value="Tesla">Tesla&nbsp;(1)</option><option value="Toyota">Toyota&nbsp;(17469)</option><option value="Triumph">Triumph&nbsp;(14)</option><option value="TVR">TVR&nbsp;(3)</option><option value="Vauxhall">Vauxhall&nbsp;(12)</option><option value="Volkswagen">Volkswagen&nbsp;(3364)</option><option value="Volvo">Volvo&nbsp;(543)</option><option value="Other">Other&nbsp;(100)</option>
						</select>
    Model:
    <select id="form_model" name="model" class="normal-drop-down" disabled="">&gt;
							<option value="" selected="selected">Any model</option>
						</select>
    Price Range:
    //Min
    <select id="price_min" name="price_min" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="1000">$1k</option><option value="2000">$2k</option><option value="3000">$3k</option><option value="4000">$4k</option><option value="5000">$5k</option><option value="7500">$7.5k</option><option value="10000">$10k</option><option value="12500">$12.5k</option><option value="15000">$15k</option><option value="20000">$20k</option><option value="25000">$25k</option><option value="30000">$30k</option><option value="35000">$35k</option><option value="40000">$40k</option><option value="50000">$50k</option><option value="60000">$60k</option><option value="70000">$70k</option><option value="80000">$80k</option><option value="90000">$90k</option><option value="100000">$100k</option><option value="150000">$150k</option><option value="200000">$200k</option>
						</select>
    //Max
	<select id="price_max" name="price_max" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="1000">$1k</option><option value="2000">$2k</option><option value="3000">$3k</option><option value="4000">$4k</option><option value="5000">$5k</option><option value="7500">$7.5k</option><option value="10000">$10k</option><option value="12500">$12.5k</option><option value="15000">$15k</option><option value="20000">$20k</option><option value="25000">$25k</option><option value="30000">$30k</option><option value="35000">$35k</option><option value="40000">$40k</option><option value="50000">$50k</option><option value="60000">$60k</option><option value="70000">$70k</option><option value="80000">$80k</option><option value="90000">$90k</option><option value="100000">$100k</option><option value="150000">$150k</option><option value="200000">$200k</option>
						</select>
            --this matters for Used cars--
            (if Used classifications)
    Year:	Any; before 2000 its 10 year increments back to 1950; and then skips to 1900, after 2000 its one year increments
    //Min
 	<select id="year_min" name="year_min" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1990">1990</option><option value="1980">1980</option><option value="1970">1970</option><option value="1960">1960</option><option value="1950">1950</option><option value="1900">1900</option>
						</select>
    //Max
	<select id="year_max" name="year_max" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1990">1990</option><option value="1980">1980</option><option value="1970">1970</option><option value="1960">1960</option><option value="1950">1950</option><option value="1900">1900</option>
						</select>
    Keywords:
	<input name="Keyword" type="text" id="Keyword" size="30" maxlength="50">

    Odometer: Any; 10k and then 10k increments to 100k after that 20km increments to 200km and then 50k increments to 300k
            //Min
            <select id="odometer_min" name="odometer_min" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="10000">10,000 km</option><option value="20000">20,000 km</option><option value="30000">30,000 km</option><option value="40000">40,000 km</option><option value="50000">50,000 km</option><option value="60000">60,000 km</option><option value="70000">70,000 km</option><option value="80000">80,000 km</option><option value="90000">90,000 km</option><option value="100000">100,000 km</option><option value="120000">120,000 km</option><option value="140000">140,000 km</option><option value="160000">160,000 km</option><option value="180000">180,000 km</option><option value="200000">200,000 km</option><option value="250000">250,000 km</option><option value="300000">300,000 km</option>
						</select>
    //Max
	<select id="odometer_max" name="odometer_max" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="10000">10,000 km</option><option value="20000">20,000 km</option><option value="30000">30,000 km</option><option value="40000">40,000 km</option><option value="50000">50,000 km</option><option value="60000">60,000 km</option><option value="70000">70,000 km</option><option value="80000">80,000 km</option><option value="90000">90,000 km</option><option value="100000">100,000 km</option><option value="120000">120,000 km</option><option value="140000">140,000 km</option><option value="160000">160,000 km</option><option value="180000">180,000 km</option><option value="200000">200,000 km</option><option value="250000">250,000 km</option><option value="300000">300,000 km</option>
						</select>
    Engine Size: Any; increments of .5, from 1.0 to 6.0
    //Min
    <select id="engine_size_min" name="engine_size_min" class="side-by-side-dropdown">
							<option value="1" selected="selected">Any</option><option value="1000">1.0 litre</option><option value="1500">1.5 litre</option><option value="2000">2.0 litre</option><option value="2500">2.5 litre</option><option value="3000">3.0 litre</option><option value="3500">3.5 litre</option><option value="4000">4.0 litre</option><option value="4500">4.5 litre</option><option value="5000">5.0 litre</option><option value="5500">5.5 litre</option><option value="6000">6.0 litre</option>
						</select>
    //Max
	<select id="engine_size_max" name="engine_size_max" class="side-by-side-dropdown">
							<option value="1" selected="selected">Any</option><option value="1000">1.0 litre</option><option value="1500">1.5 litre</option><option value="2000">2.0 litre</option><option value="2500">2.5 litre</option><option value="3000">3.0 litre</option><option value="3500">3.5 litre</option><option value="4000">4.0 litre</option><option value="4500">4.5 litre</option><option value="5000">5.0 litre</option><option value="5500">5.5 litre</option><option value="6000">6.0 litre</option>
						</select>
    Number of Doors: Any; 1-5
    //Min
 	<select id="doors_min" name="doors_min" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="1">1 door</option><option value="2">2 door</option><option value="3">3 door</option><option value="4">4 door</option><option value="5">5 door</option>
						</select>
    //Max
	<select id="doors_max" name="doors_max" class="side-by-side-dropdown">
							<option value="0" selected="selected">Any</option><option value="1">1 door</option><option value="2">2 door</option><option value="3">3 door</option><option value="4">4 door</option><option value="5">5 door</option>
						</select>
    Transmission: (Manual, Automatic, Triptonic)
 	<select id="transmission" name="transmission" class="normal-drop-down">
							<option value="0" selected="selected">Any transmission</option><option value="1">Manual</option><option value="2">Automatic</option><option value="3">Tiptronic</option>
						</select>
    Fuel Type: (Diesel, Petrol, Hybrid, Electric, CNG, LPG, Alternative)
    <select id="fueltype" name="fueltype" class="normal-drop-down">
							<option value="" selected="selected">Any fuel</option><option value="Petrol">Petrol</option><option value="Diesel">Diesel</option><option value="Hybrid">Hybrid</option><option value="Electric">Electric</option><option value="CNG">CNG</option><option value="LPG">LPG</option><option value="Alternative">Alternative</option>
						</select>
    Region:	Change region (North Island, Northland, Auckland, Waikato, Bay of Plenty, Gisborne, Hawke's Bay, Taranaki, Wanganui, Manawatu, Wairarapa, Wellington, South Island, Nelson Bays,
            Marlborough, West Coast, Canterbury, Timaru/Oamaru, Otago, Southland);
    //This one will need to be looked at again; its kinda complicated
    <div class="advanced-search-regions">
				            <input type="radio" id="search-region-national" value="100" name="region" checked="checked"><label for="search-region-national" id="search-region-national-label">NZ</label><input type="radio" id="search-region-local" class="search-region-local" value="2" name="region"><label for="search-region-local" id="search-region-local-label" class="search-region-local-label">Auckland</label><div><small><a id="advanced-search-change-region-link" class="changeRegionOpen button17 spriteButton" href="/MyTradeMe/SelectRegion.aspx?url=%2fBrowse%2fCategoryAttributeSearch.aspx%3fkey%3d967289342%26view%3dsearchform">Change region</a><small><div>
				        </div>
				    </small></small></div></div>
    Listing type:	 (All listings,Private listings only,Dealer listings only)
            //these are radio buttons



            */
}
