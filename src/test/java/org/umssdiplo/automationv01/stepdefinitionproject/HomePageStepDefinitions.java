package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
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

    @And("^fill \"([^\"]*)\" in Nombre field in 'Accident' form$")
    public void FillNombreAccidentField(String nombre) throws Throwable {
        this.gestionAccidentes.setNombreField(nombre);
    }

    @And("^fill \"([^\"]*)\" in Descripcion field in 'Accident' form$")
    public void FillDescripcionAccidentField(String descripcion) throws Throwable {
        this.gestionAccidentes.setDescripcionField(descripcion);
    }

    @And("^fill \"([^\"]*)\" in Tipo field in 'Accident' form$")
    public void FillTipoAccidentField(String tipo) throws Throwable {
        this.gestionAccidentes.setTipoField(tipo);
    }

    @And("^fill \"([^\"]*)\" in Severidad field in 'Accident' form$")
    public void FillSeveridadAccidentField(String severidad) throws Throwable {
        this.gestionAccidentes.setSeveridadField(severidad);
    }

    @Then("^fill 'Editar Accidente' fields in 'Accident' form")
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

    @Then("^verify 'created accident' has been saved in 'Accidents' table$")
    public void verifyAccidentHasBeenCreatedInAccidentsListTable() {
        boolean isCreatedAccident = this.gestionAccidentes.isAccidentCreated();
        Assert.assertEquals(isCreatedAccident, true);
    }

    @Then("^verify 'edited accident' has been saved in 'Accidents' table$")
    public void verifyAccidentHasBeenEditedInAccidentsListTable() {
        boolean isAccidentEdited = this.gestionAccidentes.isAccidentEdited();
        Assert.assertEquals(isAccidentEdited, true);
    }

    @Then("^verify 'accident' has been deleted in 'Accidents' table$")
    public void verifyAccidentHasBeenDeletedInAccidentsListTable() {
        boolean isAccidentDeleted = this.gestionAccidentes.isAccidentDeleted();
        Assert.assertEquals(isAccidentDeleted, true);
    }

}
