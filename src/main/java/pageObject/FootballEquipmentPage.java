package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://lv.sportsdirect.com/football/football-equipment?promo_name=landing-football")
public class FootballEquipmentPage extends PageObject {
    /*
              SELECTORS
           */
    private static final String STAR_WARS_FOOTBALL ="css:[title=\"Mitre - Star Wars Football\"]";


   /*
    ACTIONS
 */

    public  void clickStarWarsFootball(){$(STAR_WARS_FOOTBALL).click();}
}
