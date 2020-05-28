package pageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://lv.sportsdirect.com/")
public class HomePage extends PageObject {
    /*
            SELECTORS
         */
    private static final String MAIN_HEADING_LABEL = "css:.HeaderWrap a[title=\"Home page\"]";
    private static final String POPUP_CLOSE_BUTTON = "css:.modal-dialog.advertPopup button";
    private static final String FOOTBALL_TAB = "css:#topMenu .mmHasChild.root.multicolumn.MenuGroupD  > a" ;





    /*
    ACTIONS
 */


  public void closePopup(){
      $(POPUP_CLOSE_BUTTON).click();
  }

  public void clickFootBallTab(){$(FOOTBALL_TAB).click();}






}
