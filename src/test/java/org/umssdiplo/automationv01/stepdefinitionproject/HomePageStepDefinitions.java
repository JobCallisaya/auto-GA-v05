package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.GestionAccidentes;
import org.umssdiplo.automationv01.core.managepage.Login.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class HomePageStepDefinitions {
    private Home home;
    private GestionAccidentes gestionAccidentes;

    @Given("^SCA page is loaded$")
    public void scaPageIsLoaded() throws Throwable {
        home = LoadPage.homePage();
    }

    @And("^click 'Accidentes' button in 'SideMenu'$")
    public void clickOnAccidentes() throws Throwable {
        this.gestionAccidentes = home.clickOnAccidentesMenuItem();
    }

    @Then("fill 'Accidente' fields in 'Accident' form")
    public void FillAccidentFields() throws Throwable {
        this.gestionAccidentes.setAccidentFields();
    }
}
