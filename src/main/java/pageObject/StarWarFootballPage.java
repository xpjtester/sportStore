package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://lv.sportsdirect.com/football/football-equipment?promo_name=landing-football")
public class StarWarFootballPage extends PageObject {
    WebDriver driver;
    /*
              SELECTORS
           */
    private static final String STAR_WARS_FOOTBALL_NAME = "css:span [id=\"lblProductName\"]";
    private static final String ADD_TO_BAG_BUTTON ="css:#aAddToBag";
    private static final String BAG_SUB_VALUE="css:#spanBagSubTotalValue";



   /*
    ACTIONS
 */

 public void checkStarWarsFootballName(){
     assertEquals("Star Wars Football",$(STAR_WARS_FOOTBALL_NAME).getText());
 }

 public void clickAddToBagButton(){$(ADD_TO_BAG_BUTTON).click();}

 public void checkBagSubValue() throws InterruptedException {
     Thread.sleep(1000);
     assertEquals("10,80 €", $(BAG_SUB_VALUE).getTextContent());}

}