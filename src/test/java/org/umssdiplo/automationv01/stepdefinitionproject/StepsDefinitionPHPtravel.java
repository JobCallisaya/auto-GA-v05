package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.HomePage;
import org.umssdiplo.automationv01.core.managepage.ProductSelectionPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private HomePage homePage;
    private ProductSelectionPage productSelectionPage;
    private String shoePrice;

    @Given("^'Adidas' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        homePage = LoadPage.homePage();
    }

    @And("^hover on 'HOMBRE' link in header$")
    public void hoverOnHombresLinkInHeader() throws Throwable {
        this.homePage.hoverHeaderLink();
    }

    @And("^click on 'Futbol' link sub menu$")
    public void clickOnFutbolLink() throws Throwable {
        this.productSelectionPage = this.homePage.clickOnFutbolLink();
    }


    @And("get price from 'CALZADO DE FUTBOL X 18.3 TF' shoe")
    public void getPriceFromCalzado() throws Throwable {
        this.shoePrice = this.productSelectionPage.getShoesPrice();
    }

    @And("click on 'CALZADO DE FUTBOL X 18.3 TF' link")
    public void clickOnShoeLink() throws Throwable {
        this.productSelectionPage.clickOnShoeLink();
    }
}
