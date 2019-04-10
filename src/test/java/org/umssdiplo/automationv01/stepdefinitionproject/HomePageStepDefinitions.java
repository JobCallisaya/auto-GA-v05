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

    @Then("fill 'Crear Accidente' fields in 'Accident' form")
    public void FillAccidentFields() throws Throwable {
        this.gestionAccidentes.setAccidentFields();
    }

    @Then("fill 'Editar Accidente' fields in 'Accident' form")
    public void FillEditarAccidentFields() throws Throwable {
        this.gestionAccidentes.setEditarAccidentFields();
    }

    @And("click 'GuardarAccidente' button in 'Accident' form")
    public void GuardarAccidentFields() throws Throwable {
        this.gestionAccidentes.clickGuardarAccidente();
    }

    @And("click 'EditarAccidente' button in 'Accident' form")
    public void EditarAccidentFields() throws Throwable {
        this.gestionAccidentes.clickEditarAccidente();
    }

    @And("click 'BorrarAccidente' button in 'Accident' form")
    public void BorrarAccidentFields() throws Throwable {
        this.gestionAccidentes.clickBorrarAccidente();
    }
}
