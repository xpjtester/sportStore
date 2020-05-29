package TestCases;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObject.FootballEquipmentPage;
import pageObject.FootballPage;
import pageObject.HomePage;
import pageObject.StarWarFootballPage;

@RunWith(SerenityRunner.class)

public class addingToCart {
    @Managed
    WebDriver driver;
    @Managed
    HomePage homePage;
    FootballPage footballPage;
    FootballEquipmentPage footballEquipmentPage;
    StarWarFootballPage starWarFootballPage;


    @Test
        public void findStarWarsFootball() {
        homePage.open();
        homePage.closePopup();
        homePage.clickFootBallTab();
        footballPage.clickFootBallEquipmentCart();
        footballEquipmentPage.clickStarWarsFootball();
        starWarFootballPage.checkStarWarsFootballName();

    }

    @Test
        public void addToCart() throws InterruptedException {
            homePage.open();
            homePage.closePopup();
            homePage.clickFootBallTab();
            footballPage.clickFootBallEquipmentCart();
            footballEquipmentPage.clickStarWarsFootball();
            starWarFootballPage.clickAddToBagButton();
            starWarFootballPage.checkBagSubValue();


        }





    }






