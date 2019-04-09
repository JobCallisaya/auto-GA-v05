package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AccidentesStepDefinitions {
    private Home login;

    @Given("^Some action$")
    public void accidentesMenuItemIsClicked() throws Throwable {
        login = LoadPage.homePage();
    }
}
