package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://lv.sportsdirect.com/football")
public class FootballPage extends PageObject {
    /*
              SELECTORS
           */
    private static final String FOOTBALL_EQUIPMENT_CART ="css:a[href=\"/football/football-equipment?promo_name=landing-football\"]";





    public void clickFootBallEquipmentCart(){$(FOOTBALL_EQUIPMENT_CART).click();}





}
