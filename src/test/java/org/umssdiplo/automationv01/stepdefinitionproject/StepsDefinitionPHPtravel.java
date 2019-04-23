package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
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

    @And("^hover on \"([^\"]*)\" link in header$")
    public void hoverOnHombresLinkInHeader(String menuItem) throws Throwable {
        this.homePage.hoverHeaderLink(menuItem);
    }

    @And("^click on 'Futbol' link sub menu$")
    public void clickOnFutbolLink() throws Throwable {
        this.productSelectionPage = this.homePage.clickOnFutbolLink();
    }


    @And("get price from \"([^\"]*)\" shoes")
    public void getPriceFromCalzado(String shoesName) throws Throwable {
        this.shoePrice = this.productSelectionPage.getShoesPrice(shoesName);
    }

    @And("click on \"([^\"]*)\" link")
    public void clickOnShoeLink(String shoesName) throws Throwable {
        this.productSelectionPage.clickOnShoeLink(shoesName);
    }

    @And("click on \"([^\"]*)\" dropdown")
    public void clickOnDropDown(String dropdownName) throws Throwable {
        this.productSelectionPage.clickOnDropDown(dropdownName);
    }

    @And("select on \"([^\"]*)\" dropdown item")
    public void selectDropdownItem(String dropdownItemName) throws Throwable {
        this.productSelectionPage.selectDropdownItem(dropdownItemName);
    }

    @And("click on \"([^\"]*)\" button")
    public void clickOnButton(String buttonName) throws Throwable {
        this.productSelectionPage.clickOnButton(buttonName);
    }

    @And("click on 'Ver carrito' button")
    public void clickOnVerCarrito() throws Throwable {
        this.productSelectionPage.clickOnVerCarrito();
    }

    @Then("verify that quantity is \"([^\"]*)\"")
    public void verifyQuantity(String quantityExpected) throws Throwable {
        String quantityActual = this.productSelectionPage.getQuantity();
        Assert.assertEquals(quantityActual.toLowerCase(), quantityExpected.toLowerCase());
    }

    @And("verify \"([^\"]*)\" title is displayed")
    public void verifyTitleIsDisplayed(String titleExpected) throws Throwable {
        String titleActual = this.productSelectionPage.getItemTitle();
        Assert.assertEquals(titleActual.toLowerCase(), titleExpected.toLowerCase());
    }

    @And("verify price should be \"([^\"]*)\"")
    public void verifyPriceShouldBe(String quantity) throws Throwable {
        String actual = this.productSelectionPage.getPrice();
        Assert.assertEquals(actual, quantity);
    }

    @And("verify total should be \"([^\"]*)\"")
    public void verifyTotalShouldBe(String quantity) throws Throwable {
        String actual = this.productSelectionPage.getTotal();
        Assert.assertEquals(actual, quantity);
    }
}
